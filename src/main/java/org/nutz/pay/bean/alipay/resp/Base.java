package org.nutz.pay.bean.alipay.resp;

/**
 * Created by Howe on 2017/4/18.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class Base {

    /**
     * 通知时间
     * 通知的发送时间。
     * 格式为yyyy-MM-dd HH:mm:ss。
     * 不可空
     */
    private String notify_time;

    public String getNotify_time() {
        return notify_time;
    }

    public void setNotify_time(String notify_time) {
        this.notify_time = notify_time;
    }

    /**
     * 通知类型
     * 通知的类型。
     * 不可空
     */
    private String notify_type;

    public String getNotify_type() {
        return notify_type;
    }

    public void setNotify_type(String notify_type) {
        this.notify_type = notify_type;
    }

    /**
     * 通知校验ID
     * 通知校验ID。
     * 不可空
     */
    private String notify_id;

    public String getNotify_id() {
        return notify_id;
    }

    public void setNotify_id(String notify_id) {
        this.notify_id = notify_id;
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
}
