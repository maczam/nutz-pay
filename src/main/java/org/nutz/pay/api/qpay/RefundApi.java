package org.nutz.pay.api.qpay;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.Xmls;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.pay.bean.qpay.req.RefundReq;
import org.nutz.pay.bean.qpay.resp.RefundResp;
import org.nutz.pay.util.HttpUtil;
import org.nutz.pay.util.Util;

import java.util.Map;

/**
 * <a href="https://qpay.qq.com/qpaywiki/showdocument.php?pid=38&docid=62">申请退款</a>
 * Created by Howe on 2017/4/25.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class RefundApi {

    private static final Log log = Logs.get();

    /**
     * 申请退款
     *
     * @param req
     * @return
     */
    public RefundResp refund(RefundReq req) {

        try {
            String result = this.checkParams(req);
            if (Strings.isEmpty(result)) {

                String xml = Xmls.mapToXml(Lang.obj2nutmap(req));

                String resp = HttpUtil.post("https://api.qpay.qq.com/cgi-bin/pay/qpay_refund.cgi", xml);
                return Lang.map2Object(Xmls.xmlToMap(resp), RefundResp.class);
            } else {
                log.error("手Q钱包RefundReq参数校验异常: " + result);
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
    public static String checkParams(RefundReq req) {

        if (Strings.isEmpty(req.getMch_id())) {
            return "商户号不能为空";
        } else if (Strings.isEmpty(req.getNonce_str())) {
            return "随机字符串不能为空";
        } else if (Strings.isEmpty(req.getSign())) {
            return "签名不能为空";
        } else if (Strings.isEmpty(req.getOut_trade_no())) {
            return "商户订单号不能为空";
        } else if (Lang.isEmpty(req.getTransaction_id())
                && Strings.isEmpty(req.getOut_trade_no())) {
            return "QQ钱包订单号和商户订单号2选1不能同为空";
        } else if (Lang.length(req.getOut_trade_no()) > 32) {
            return "商户订单号不能超过32位长度";
        } else if (Strings.isEmpty(req.getOut_refund_no())) {
            return "商户退款单号不能为空";
        } else if (Lang.isEmpty(req.getRefund_fee())) {
            return "退款申请金额不能为空";
        } else if (Strings.isEmpty(req.getOp_user_id())) {
            return "操作员ID不能为空";
        } else if (Strings.isEmpty(req.getOp_user_passwd())) {
            return "操作员密码的MD5不能为空";
        } else {
            return "";
        }
    }

    /**
     * 获取签名
     *
     * @param req 对象
     * @param k   密钥
     * @return 签名
     */
    public static String getSign(RefundReq req, String k) {

        if (Strings.isEmpty(checkParams(req))) {
            Map<String, Object> params = Lang.obj2nutmap(req);
            String s = Util.buildParmas(params, new String[]{"sign"});
            return Lang.md5(s + k).toUpperCase();
        } else {
            return null;
        }
    }

    /**
     * 校验响应签名
     *
     * @param resp 响应对象
     * @param k    密钥
     * @return 判断结果
     */
    public static Boolean verifySign(RefundResp resp, String k) {

        Map<String, Object> params = Lang.obj2nutmap(resp);
        String s = Util.buildParmas(params, new String[]{"sign"});
        if (Strings.equals(Lang.md5(s + k).toUpperCase(), resp.getSign())) {
            return true;
        } else {
            return false;
        }
    }
}
