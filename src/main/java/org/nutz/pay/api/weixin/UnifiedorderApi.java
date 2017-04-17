package org.nutz.pay.api.weixin;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.Xmls;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.pay.bean.weixin.req.UnifiedorderReq;
import org.nutz.pay.bean.weixin.resp.UnifiedorderResp;
import org.nutz.pay.util.HttpUtil;

/**
 * 完成<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_1">统一订单</a>功能
 * Created by Jianghao on 2017/4/17.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class UnifiedorderApi {

    private static final Log log = Logs.get();

    /**
     * 统一下单
     * @param req
     * @return
     */
    public UnifiedorderResp unifiedorder(UnifiedorderReq req) {

        try {
            String result = this.checkParams(req);
            if (Strings.isEmpty(result)) {

                String xml = Xmls.mapToXml(Lang.obj2nutmap(req));

                String resp = HttpUtil.post("https://api.mch.weixin.qq.com/pay/unifiedorder", xml);
                return Lang.map2Object(Xmls.xmlToMap(resp), UnifiedorderResp.class);
            } else {
                log.error("微信支付UnifiedorderReq参数校验异常: " + result);
                return null;
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    protected String checkParams(UnifiedorderReq req) {

        if (Strings.isEmpty(req.getAppid())) {
            return "公众账号ID不能为空";
        } else if (Strings.isEmpty(req.getMch_id())) {
            return "商户号不能为空";
        } else if (Strings.isEmpty(req.getNonce_str())) {
            return "随机字符串不能为空";
        } else if (Strings.isEmpty(req.getSign())) {
            return "签名不能为空";
        } else if (!Strings.isEmpty(req.getSign_type())
                || !Strings.equalsIgnoreCase("MD5", req.getSign_type())
                || !Strings.equalsIgnoreCase("HMAC-SHA256", req.getSign_type())) {
            return "签名类型只支持HMAC-SHA256和MD5";
        } else if (Strings.isEmpty(req.getBody())) {
            return "商品描述不能为空";
        } else if (Strings.isEmpty(req.getOut_trade_no())) {
            return "商户订单号不能为空";
        } else if (Lang.length(req.getOut_trade_no()) > 32) {
            return "商户订单号不能超过32位长度";
        } else if (!Strings.equalsIgnoreCase(req.getFee_type(), "CNY")
                || !Strings.isEmpty(req.getFee_type())) {
            return "标价币种只支持CNY";
        } else if (Lang.isEmpty(req.getTotal_fee())) {
            return "标价金额不能为空";
        } else if (Strings.isEmpty(req.getSpbill_create_ip())) {
            return "终端IP不能为空";
        } else if (Strings.isEmpty(req.getNotify_url())) {
            return "通知地址不能为空";
        } else if (!Strings.isUrl(req.getNotify_url())) {
            return "通知地址格式错误";
        } else if (Strings.isEmpty(req.getTrade_type())) {
            return "交易类型不能为空";
        } else if (!Strings.equalsIgnoreCase("APP", req.getTrade_type())
                || !Strings.equalsIgnoreCase("JSAPI", req.getTrade_type())
                || !Strings.equalsIgnoreCase("NATIVE", req.getTrade_type())) {
            return "交易类型只支持JSAPI--公众号支付、NATIVE--原生扫码支付、APP--app支付";
        } else if (Strings.equalsIgnoreCase("NATIVE", req.getTrade_type())
                && Strings.isEmpty(req.getProduct_id())) {
            return "交易类型为扫码支付NATIVE时, 商品ID不能为空";
        } else if (Strings.equalsIgnoreCase("JSAPI", req.getTrade_type())
                && Strings.isEmpty(req.getOpenid())) {
            return "交易类型为公众号支付JSAPI时, 用户标识openid不能为空";
        } else {
            return "";
        }
    }
}
