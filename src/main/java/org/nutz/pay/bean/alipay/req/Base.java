package org.nutz.pay.bean.alipay.req;

/**
 * 支付宝即时到账基础字段
 * Created by Howe on 2017/4/17.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class Base {

    /**
     * 接口名称
     * 接口名称
     * 不可空
     */
    private String service;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    /**
     * 合作者身份ID
     * 签约的支付宝账号对应的支付宝唯一用户号。
     * 不可空
     */
    private String partner;

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    /**
     * 参数编码字符集
     * 商户网站使用的编码格式，如UTF-8、GBK、GB2312等。
     * 不可空
     */
    private String _input_charset;

    public String get_input_charset() {
        return _input_charset;
    }

    public void set_input_charset(String _input_charset) {
        this._input_charset = _input_charset;
    }

    /**
     * 签名方式
     * DSA、RSA、MD5三个值可选，必须大写。
     * 不可空
     */
    private String sign_type;

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    /**
     * 签名
     * 请参见本文档“附录：签名与验签”。
     * 不可空
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 服务器异步通知页面路径
     * 支付宝服务器主动通知商户网站里指定的页面http路径。
     * 可空
     */
    private String notify_url;

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    /**
     * 页面跳转同步通知页面路径
     * 支付宝处理完请求后，当前页面自动跳转到商户网站里指定页面的http路径。
     * 可空
     */
    private String return_url;

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }
}
