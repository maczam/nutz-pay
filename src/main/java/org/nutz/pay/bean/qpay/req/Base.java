package org.nutz.pay.bean.qpay.req;

/**
 * Created by Howe on 2017/4/24.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class Base {

    /**
     * 应用ID
     * 腾讯开放平台审核通过的应用APPID或腾讯公众平台审核通过的公众号APPID
     * 选填
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
     * QQ钱包分配的商户号
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
     * 随机字符串，不长于32位，详见<a href="https://qpay.qq.com/qpaywiki/showdocument.php?pid=38&docid=57">随机数算法</a>
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
     * 商户签名，详见<a href="https://qpay.qq.com/qpaywiki/showdocument.php?pid=38&docid=57">商户签名算法规则</a>
     * 必填
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
