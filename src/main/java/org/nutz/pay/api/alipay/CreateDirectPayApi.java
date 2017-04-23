package org.nutz.pay.api.alipay;

import java.util.Map;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.pay.bean.alipay.req.pc.CreateDirectPayReq;
import org.nutz.pay.util.Util;
import org.nutz.pay.util.alipay.pc.Signature;

/**
 * <a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.AF7oYg&treeId=62&articleId=104743&docType=1">即时到账交易接口</a>
 * create_direct_pay_by_user
 * Created by Howe on 2017/4/17.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class CreateDirectPayApi {

    private static final Log log = Logs.get();

    /**
     * 构建即时到账跳转页面
     *
     * @param req 参数
     * @return 跳转页面
     */
    public static String createDirectPay(CreateDirectPayReq req) {
        try {
            String result = checkParams(req);
            if (Strings.isEmpty(result)) {
                return "https://mapi.alipay.com/gateway.do?" + Util.buildParmas(Lang.obj2nutmap(req));
            } else {
                log.error("支付宝即时到账交易接口参数校验异常: " + result);
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
     * @param req 参数
     * @return 校验结果
     */
    public static String checkParams(CreateDirectPayReq req) {
        if (Strings.isEmpty(req.getService())) {
            return "接口名称不能为空";
        } else if (Strings.isEmpty(req.getPartner())) {
            return "合作者身份ID不能为空";
        } else if (!Strings.equalsIgnoreCase("create_direct_pay_by_user", req.getService())) {
            return "接口名称错误，应该为create_direct_pay_by_user";
        } else if (Strings.isEmpty(req.getSign_type())) {
            return "签名方式不能为空";
        } else if (!Strings.equalsIgnoreCase("RSA", req.getSign_type())
                && !Strings.equalsIgnoreCase("MD5", req.getSign_type())
                && !Strings.equalsIgnoreCase("MD5", req.getSign_type())) {
            return "签名方式只支持RSA、DSA、MD5";
        } else if (Strings.isEmpty(req.getSign())) {
            return "签名不能为空";
        } else if (Strings.isEmpty(req.getNotify_url())) {
            return "服务器异步通知页面路径不能为空";
        } else if (Strings.isEmpty(req.getReturn_url())) {
            return "页面跳转同步通知页面路径不能为空";
        } else if (Strings.isEmpty(req.getOut_trade_no())) {
            return "商户网站唯一订单号不能为空";
        } else if (Strings.isEmpty(req.getSubject())) {
            return "商品名称不能为空";
        } else if (Lang.isEmpty(req.getTotal_fee())) {
            return "交易金额不能为空";
        } else if (!Strings.isEmpty(req.getSeller_id())
                && !Strings.isEmpty(req.getSeller_email())
                && !Strings.isEmpty(req.getSeller_account_name())) {
            return "seller_id、seller_account_name、seller_email三个参数至少必须传递一个";
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
    public static String getSign(CreateDirectPayReq req, String k) {
        if (Strings.isEmpty(checkParams(req))) {
            Map<String, Object> params = Lang.obj2nutmap(req);
            String s = Util.buildParmas(params, new String[]{"sign", "sign_type"});
            if (Strings.equalsIgnoreCase(req.getSign_type(), "MD5")
                    || Strings.equalsIgnoreCase(req.getSign_type(), "RSA")
                    || Strings.equalsIgnoreCase(req.getSign_type(), "DSA")) {
                return Signature.sign(s, k, req.getSign_type());
            } else {
                log.error("支付宝即时到账交易接口签名方式只支持RSA、DSA、MD5");
                return null;
            }
        } else {
            return null;
        }
    }
}
