package org.nutz.pay.api.alipay;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.pay.bean.alipay.req.unity.Base;
import org.nutz.pay.bean.alipay.req.unity.TradeWapPay;
import org.nutz.pay.util.Util;
import org.nutz.pay.util.alipay.pc.Signature;

import java.util.Map;

/**
 * <a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=203&articleId=105463&docType=1">手机网站支付接口</a>
 * alipay.trade.wap.pay
 * 这是新版的手机网站支付, 老版的不准备支持.
 * <p>
 * Created by Howe on 2017/4/19.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class TradeWapPayApi {

    private static final Log log = Logs.get();

    /**
     * 构建手机网站支付跳转页面
     *
     * @param req 参数
     * @return 跳转页面
     */
    public static String tradeWapPay(Base req){

        try {
            String result = checkParams(req);
            if (Strings.isEmpty(result)) {
                return "https://openapi.alipay.com/gateway.do?" + Util.buildParmas(Lang.obj2nutmap(req));
            } else {
                log.error("支付宝手机网站支付接口参数校验异常: " + result);
                return null;
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * 校验参数
     * @param req
     * @return
     */
    public static String checkParams(Base req) {

        if (Strings.isEmpty(req.getApp_id())) {
            return "应用ID不能为空";
        } else if (Strings.isEmpty(req.getMethod())) {
            return "接口名称不能为空";
        } else if (!Strings.equals(req.getMethod(), "alipay.trade.wap.pay")) {
            return "接口名称错误, 应该为alipay.trade.wap.pay";
        } else if (Strings.isEmpty(req.getSign_type())) {
            return "签名方式不能为空";
        } else if (!Strings.equalsIgnoreCase("RSA2", req.getSign_type())
                && !Strings.equalsIgnoreCase("RSA", req.getSign_type())) {
            return "签名方式只支持RSA、RSA2";
        } else if (Strings.isEmpty(req.getSign())) {
            return "签名不能为空";
        } else if (Strings.isEmpty(req.getTimestamp())) {
            return "请求的时间不能为空";
        } else if (Strings.isEmpty(req.getNotify_url())) {
            return "异步通知请求地址不能为空";
        } else if (Lang.isEmpty(req.getBiz_content())) {
            return "业务请求参数的集合不能为空";
        } else {
            TradeWapPay twp = Lang.map2Object(req.getBiz_content(), TradeWapPay.class);
            if (Strings.isEmpty(twp.getSubject())) {
                return "商品标题不能为空";
            } else if (Strings.isEmpty(twp.getOut_trade_no())) {
                return "商户订单号不能为空";
            } else if (Lang.isEmpty(twp.getTotal_amount())) {
                return "订单总金额不能为空";
            } else {
                return "";
            }
        }
    }

    /**
     * 获取签名
     *
     * @param req 对象
     * @param k   密钥
     * @return 签名
     */
    public static String getSign(Base req, String k) {

        if (Strings.isEmpty(checkParams(req))) {
            Map<String, Object> params = Lang.obj2nutmap(req);
            String s = Util.buildParmas(params);
            if (Strings.equalsIgnoreCase(req.getSign_type(), "RSA2")
                    || Strings.equalsIgnoreCase(req.getSign_type(), "RSA")) {
                return Signature.sign(s, k, req.getSign_type(), "UTF-8");
            } else {
                log.error("支付宝手机网站支付接口签名方式只支持RSA、RSA2.");
                return null;
            }
        } else {
            return null;
        }
    }
}
