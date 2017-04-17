package org.nutz.pay.api.alipay;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.pay.bean.alipay.req.CreateDirectPayReq;

/**
 * 完成<a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.AF7oYg&treeId=62&articleId=104743&docType=1">即时到账交易接口</a>功能
 * Created by Howe on 2017/4/17.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class CreateDirectPayApi {

    private static final Log log = Logs.get();

    public String createDirectPay(CreateDirectPayReq req) {

        try {
            String result = this.checkParams(req);
            if (Strings.isEmpty(result)) {

                return null;
            } else {
                log.error("支付宝即时到账交易接口CreateDirectPayReq参数校验异常: " + result);
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
    protected String checkParams(CreateDirectPayReq req) {

        if (Strings.isEmail(req.getService())) {
            return "接口名称不能为空";
        } else if (!Strings.equalsIgnoreCase("create_direct_pay_by_user", req.getService())) {
            return "接口名称错误，应该为create_direct_pay_by_user";
        } else if (Strings.isEmpty(req.get_input_charset())) {
            return "参数编码字符集不能为空";
        } else if (!Strings.equalsIgnoreCase("UTF-8", req.get_input_charset())
                || !Strings.equalsIgnoreCase("GBK", req.get_input_charset())
                || !Strings.equalsIgnoreCase("GB2312", req.get_input_charset())) {
            return "参数编码字符集只支持UTF-8、GBK、GB2312";
        } else if (Strings.isEmpty(req.getSign_type())) {
            return "签名方式不能为空";
        } else if (!Strings.equalsIgnoreCase("DSA", req.getSign_type())
                || !Strings.equalsIgnoreCase("RSA", req.getSign_type())
                || !Strings.equalsIgnoreCase("MD5", req.getSign_type())) {
            return "签名方式只支持DSA、RSA、MD5";
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
        } else if (Strings.isEmpty(req.getPayment_type())) {
            return "支付类型不能为空";
        } else if (Lang.isEmpty(req.getTotal_fee())) {
            return "交易金额不能为空";
        } else if (!Strings.isEmpty(req.getSeller_id())
                || !Strings.isEmpty(req.getSeller_email())
                || !Strings.isEmpty(req.getSeller_account_name())) {
            return "seller_id、seller_account_name、seller_email三个参数至少必须传递一个";
        } else {
            return "";
        }
    }
}
