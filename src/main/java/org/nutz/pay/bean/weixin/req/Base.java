package org.nutz.pay.bean.weixin.req;

/**
 * Created by Howe on 2017/4/24.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class Base {

    /**
     * 公众账号ID
     * 微信支付分配的公众账号ID（企业号corpid即为此appId）
     * 必填
     */
    private String appid;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 商户号
     * 微信支付分配的商户号
     * 必填
     */
    private String mch_id;

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    /**
     * 随机字符串
     * 随机字符串，长度要求在32位以内。推荐<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_3">随机数生成算法</a>
     * 必填
     */
    private String nonce_str;

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    /**
     * 签名
     * 通过签名算法计算得出的签名值，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_3">签名生成算法</a>
     * 必填
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 签名类型
     * 签名类型，默认为MD5，支持HMAC-SHA256和MD5。
     * 选填
     */
    private String sign_type;

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }
}
