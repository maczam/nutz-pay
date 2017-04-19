package org.nutz.pay.api.alipay;

import java.util.Map;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.pay.bean.alipay.req.pc.RefundFastpayReq;
import org.nutz.pay.util.HttpUtil;
import org.nutz.pay.util.Util;
import org.nutz.pay.util.alipay.pc.Signature;

/**
 * <a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.JyEgac&treeId=62&articleId=104744&docType=1">即时到账有密退款接口</a>
 * Created by Howe on 2017/4/18.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class RefundFastpayApi {

    private static final Log log = Logs.get();

    /**
     * 提交即时到账有密退款请求
     *
     * @param req 参数
     * @return 反馈结果
     */
    public static String refundFastpay(RefundFastpayReq req) {
        try {
            String result = checkParams(req);
            if (Strings.isEmpty(result)) {
                Map<String, Object> params = Lang.obj2nutmap(req);
                return HttpUtil.post("https://mapi.alipay.com/gateway.do", params);
            } else {
                log.error("支付宝即时到账有密退款接口参数校验异常: " + result);
                return null;
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    public static String checkParams(RefundFastpayReq req) {
        if (Strings.isEmpty(req.getService())) {
            return "接口名称不能为空";
        } else if (Strings.isEmpty(req.getPartner())) {
            return "合作者身份ID不能为空";
        } else if (!Strings.equalsIgnoreCase("refund_fastpay_by_platform_pwd", req.getService())) {
            return "接口名称错误，应该为refund_fastpay_by_platform_pwd";
        } else if (Strings.isEmpty(req.getSign_type())) {
            return "签名方式不能为空";
        } else if (!Strings.equalsIgnoreCase("RSA", req.getSign_type())
                || !Strings.equalsIgnoreCase("DSA", req.getSign_type())
                || !Strings.equalsIgnoreCase("MD5", req.getSign_type())) {
            return "签名方式只支持RSA、DSA、MD5";
        } else if (Strings.isEmpty(req.getSign())) {
            return "签名不能为空";
        } else if (Strings.isEmpty(req.getNotify_url())) {
            return "服务器异步通知页面路径不能为空";
        } else if (!Strings.isEmpty(req.getSeller_user_id())
                || !Strings.isEmpty(req.getSeller_email())) {
            return "seller_email、seller_user_id两者必填一个";
        } else if (Strings.isEmpty(req.getRefund_date())) {
            return "退款请求时间不能为空";
        } else if (Strings.isEmpty(req.getBatch_no())) {
            return "退款批次号不能为空";
        } else if (Strings.isEmpty(req.getBatch_num())) {
            return "总笔数不能为空";
        } else if (Strings.isEmpty(req.getDetail_data())) {
            return "单笔数据集不能为空";
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
    public static String getSign(RefundFastpayReq req, String k) {

        if (Strings.isEmpty(checkParams(req))) {
            Map<String, Object> params = Lang.obj2nutmap(req);
            String s = Util.buildParmas(params, new String[]{"sign", "sign_type"});
            if (Strings.equalsIgnoreCase(req.getSign_type(), "MD5")
                    || Strings.equalsIgnoreCase(req.getSign_type(), "RSA")
                    || Strings.equalsIgnoreCase(req.getSign_type(), "DSA")) {
                return Signature.sign(s, k, req.getSign_type());
            } else {
                log.error("支付宝即时到账有密退款接口签名方式只支持RSA、DSA、MD5");
                return null;
            }
        } else {
            return null;
        }
    }
}
