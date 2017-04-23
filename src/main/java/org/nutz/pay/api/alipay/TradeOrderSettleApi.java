package org.nutz.pay.api.alipay;

import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.pay.bean.alipay.req.unity.Base;
import org.nutz.pay.bean.alipay.req.unity.TradeOrderSettle;
import org.nutz.pay.bean.alipay.resp.unity.TradeOrderSettleResp;
import org.nutz.pay.util.Util;
import org.nutz.pay.util.alipay.pc.Signature;

import java.util.Map;

/**
 * <a href="https://doc.open.alipay.com/docs/api.htm?spm=a219a.7395905.0.0.w37bXe&docType=4&apiId=1147">统一收单交易结算接口</a>
 * Created by howe on 2017/4/22.
 */
public class TradeOrderSettleApi {

    private static final Log log = Logs.get();

    /**
     * 请求统一收单交易结算接口
     *
     * @param req 参数
     * @return 相应结果
     */
    public static TradeOrderSettleResp tradeOrderSettle(Base req) {

        try {
            String result = checkParams(req);
            if (Strings.isEmpty(result)) {
                String r = "https://openapi.alipay.com/gateway.do?" + Util.buildParmas(Lang.obj2nutmap(req));
                return Json.fromJson(TradeOrderSettleResp.class, r);
            } else {
                log.error("支付宝统一收单交易结算接口参数校验异常: " + result);
                return null;
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * 校验参数
     *
     * @param req
     * @return
     */
    public static String checkParams(Base req) {

        if (Strings.isEmpty(req.getApp_id())) {
            return "应用ID不能为空";
        } else if (Strings.isEmpty(req.getMethod())) {
            return "接口名称不能为空";
        } else if (!Strings.equals(req.getMethod(), "alipay.trade.unity.pay")) {
            return "接口名称错误, 应该为alipay.trade.unity.pay";
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
            TradeOrderSettle tos = Lang.map2Object(req.getBiz_content(), TradeOrderSettle.class);
            if (Strings.isEmpty(tos.getOut_request_no())) {
                return "结算请求流水号不能为空";
            } else if (Strings.isEmpty(tos.getTrade_no())) {
                return "支付宝订单号不能为空";
            } else if (Lang.isEmpty(tos.getRoyalty_parameters())) {
                return "分账明细信息不能为空";
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
                log.error("支付宝统一收单交易结算接口签名方式只支持RSA、RSA2.");
                return null;
            }
        } else {
            return null;
        }
    }
}
