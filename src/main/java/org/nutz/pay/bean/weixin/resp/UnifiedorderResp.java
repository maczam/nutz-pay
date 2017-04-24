package org.nutz.pay.bean.weixin.resp;

/**
 * <a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_1">统一下单</a>
 * Created by Howe on 2017/4/17.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class UnifiedorderResp extends Base {

    /**
     * 设备号
     * 自定义参数，可以为请求支付的终端设备号等
     * 必填
     */
    private String device_info;

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    /**
     * 交易类型
     * 交易类型，取值为：JSAPI，NATIVE，APP等，说明详见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2">参数规定</a>
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
     * 预支付交易会话标识
     * 微信生成的预支付会话标识，用于后续接口调用中使用，该值有效期为2小时
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
     * trade_type为NATIVE时有返回，用于生成二维码，展示给用户进行扫码支付
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
