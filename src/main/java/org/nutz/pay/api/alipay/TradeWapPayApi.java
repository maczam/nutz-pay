package org.nutz.pay.api.alipay;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.pay.bean.alipay.req.wap.Base;
import org.nutz.pay.bean.alipay.req.wap.TradeWapPay;

/**
 * <a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=203&articleId=105463&docType=1">手机网站支付接口</a>
 * 这是新版的手机网站支付, 老版的不准备支持.
 * <p>
 * Created by Howe on 2017/4/19.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class TradeWapPayApi {


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
                || !Strings.equalsIgnoreCase("RSA", req.getSign_type())) {
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
}
