package org.nutz.pay.bean.alipay.req.unity;

import java.util.Map;

/**
 * Created by Howe on 2017/4/19.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class Base {

    /**
     * 支付宝分配给开发者的应用ID
     * 必填
     */
    private String app_id;

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    /**
     * 接口名称
     * alipay.trade.unity.pay
     * 必填
     */
    private String method;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 返回格式
     * 仅支持JSON
     * 选填
     */
    private String format;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * 同步通知回传链接
     * HTTP/HTTPS开头字符串
     * 选填
     */
    private String return_url;

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }

    /**
     * 请求使用的编码格式，如UTF-8,GBK,GB2312等
     * 必填
     */
    private String charset = "UTF-8";

    public String getCharset() {
        return charset;
    }

    /**
     * 商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2
     * 必填
     */
    private String sign_type;

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    /**
     * 	商户请求参数的签名串，详见<a href="https://doc.open.alipay.com/docs/doc.htm?treeId=291&articleId=105974&docType=1">签名</a>
     * 	必填
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 发送请求的时间，格式"yyyy-MM-dd HH:mm:ss"
     * 必填
     */
    private String timestamp;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 	调用的接口版本，固定为：1.0
     * 	必填
     */
    private String version = "1.0";

    public String getVersion() {
        return version;
    }

    /**
     * 异步通知请求链接
     * 支付宝服务器主动通知商户服务器里指定的页面http/https路径。
     * 选填
     */
    private String notify_url;

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    /**
     * 业务请求参数的集合，最大长度不限，除公共参数外所有请求参数都必须放在这个参数中传递，具体参照各产品快速接入文档
     * 选填
     */
    private Map<String, Object> biz_content;

    public Map<String, Object> getBiz_content() {
        return biz_content;
    }

    public void setBiz_content(Map<String, Object> biz_content) {
        this.biz_content = biz_content;
    }
}
