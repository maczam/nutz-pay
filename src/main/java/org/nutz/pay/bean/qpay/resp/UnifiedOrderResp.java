package org.nutz.pay.bean.qpay.resp;

/**
 * <a href="https://qpay.qq.com/qpaywiki/showdocument.php?pid=38&docid=58">统一下单</a>
 * Created by Howe on 2017/4/17.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class UnifiedOrderResp extends Success {

    /**
     * 支付场景
     * APP、JSAPI、NATIVE
     * 必填
     */
    private String trade_type;

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    /**
     * QQ钱包的预支付会话标识
     * QQ钱包的预支付会话标识，用于后续接口调用中使用，该值有效期为2小时
     * 必填
     */
    private String prepay_id;

    public String getPrepay_id() {
        return prepay_id;
    }

    public void setPrepay_id(String prepay_id) {
        this.prepay_id = prepay_id;
    }

    /**
     * 二维码链接
     * 当trade_type为 NATIVE 时，才会返回该字段，值可以直接转换为二维码，用户使用手机QQ扫描后，将会打开QQ钱包的支付页面。APP支付、H5支付不会返回此参数
     * 选填
     */
    private String code_url;

    public String getCode_url() {
        return code_url;
    }

    public void setCode_url(String code_url) {
        this.code_url = code_url;
    }
}
