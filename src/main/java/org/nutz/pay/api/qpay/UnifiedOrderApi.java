package org.nutz.pay.api.qpay;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.Xmls;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.pay.bean.qpay.req.UnifiedOrderReq;
import org.nutz.pay.bean.qpay.resp.UnifiedOrderResp;
import org.nutz.pay.util.HttpUtil;

/**
 * <a href="https://qpay.qq.com/qpaywiki/showdocument.php?pid=38&docid=58">统一订单</a>功能
 * Created by Howe on 2017/4/17.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class UnifiedOrderApi {

    private static final Log log = Logs.get();

    /**
     * 统一下单
     *
     * @param req
     * @return
     */
    public UnifiedOrderResp unifiedOrder(UnifiedOrderReq req) {

        try {
            String result = this.checkParams(req);
            if (Strings.isEmpty(result)) {

                String xml = Xmls.mapToXml(Lang.obj2nutmap(req));

                String resp = HttpUtil.post("https://qpay.qq.com/cgi-bin/pay/qpay_unified_order.cgi", xml);
                return Lang.map2Object(Xmls.xmlToMap(resp), UnifiedOrderResp.class);
            } else {
                log.error("手Q钱包UnifiedOrderResp参数校验异常: " + result);
                return null;
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * 校验数据
     *
     * @param req
     * @return
     */
    public static String checkParams(UnifiedOrderReq req) {

        if (Strings.isEmpty(req.getMch_id())) {
            return "商户号不能为空";
        } else if (Strings.isEmpty(req.getNonce_str())) {
            return "随机字符串不能为空";
        } else if (Strings.isEmpty(req.getSign())) {
            return "签名不能为空";
        } else if (Strings.isEmpty(req.getBody())) {
            return "商品描述不能为空";
        } else if (Strings.isEmpty(req.getOut_trade_no())) {
            return "商户订单号不能为空";
        } else if (Lang.length(req.getOut_trade_no()) > 32) {
            return "商户订单号不能超过32位长度";
        } else if (!Strings.equalsIgnoreCase(req.getFee_type(), "CNY")) {
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
                && !Strings.equalsIgnoreCase("JSAPI", req.getTrade_type())
                && !Strings.equalsIgnoreCase("NATIVE", req.getTrade_type())) {
            return "交易类型只支持JSAPI--公众号支付、NATIVE--原生扫码支付、APP--app支付";
        } else {
            return "";
        }
    }
}
