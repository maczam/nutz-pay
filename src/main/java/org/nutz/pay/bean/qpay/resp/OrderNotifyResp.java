package org.nutz.pay.bean.qpay.resp;

/**
 * Created by howe on 2017/4/24.
 */
public class OrderNotifyResp {

    /**
     * 应用ID
     * 腾讯开放平台审核通过的应用APPID或腾讯公众平台审核通过的公众号APPID
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
     * 随机字符串，不长于32位
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
     * 商户签名，详见商户签名算法规则
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 设备号
     * 调用接口提交的终端设备号，仅在走大订单逻辑时，会输出
     * 选填
     */
    private String device_info;

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    /**
     * 支付场景
     * MICROPAY、APP、JSAPI、NATIVE
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
     * 交易状态
     * SUCCESS 支付成功
     * REFUND 转入退款
     * REVOKED订单已撤销
     * CLOSED 订单已关闭
     * USERPAYING 用户支付中
     * 必填
     */
    private String trade_state;

    public String getTrade_state() {
        return trade_state;
    }

    public void setTrade_state(String trade_state) {
        this.trade_state = trade_state;
    }

    /**
     * 付款银行
     * 银行类型，采用字符串类型的银行卡标识
     * 必填
     */
    private String bank_type;

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    /**
     * 货币类型
     * 默认为人民币：CNY
     * 必填
     */
    private String fee_type;

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    /**
     * 订单金额
     * 商户订单总金额，单位为分，只能为整数，详见 交易金额
     * 必填
     */
    private Integer total_fee;

    public Integer getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(Integer total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * 用户支付金额
     * 用户本次交易中，实际支付的金额
     * 必填
     */
    private Integer cash_fee;

    public Integer getCash_fee() {
        return cash_fee;
    }

    public void setCash_fee(Integer cash_fee) {
        this.cash_fee = cash_fee;
    }

    /**
     * QQ钱包优惠金额
     * 选填
     */
    private Integer coupon_fee;

    public Integer getCoupon_fee() {
        return coupon_fee;
    }

    public void setCoupon_fee(Integer coupon_fee) {
        this.coupon_fee = coupon_fee;
    }

    /**
     * QQ钱包订单号
     * 必填
     */
    private String transaction_id;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    /**
     * 商户订单号
     * 商户系统内部的订单号,32个字符内、可包含字母。其它说明见 商户订单号
     * 必填
     */
    private String out_trade_no;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * 附加数据
     * 附加数据，在查询API和支付通知中原样返回，该字段主要用于商户携带订单的自定义数据
     * 选填
     */
    private String attach;

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
     * 支付完成时间
     * 订单支付时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010
     * 必填
     */
    private String time_end;

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }

    /**
     * 交易状态描述
     * 对当前查询订单状态的描述和下一步操作的指引
     * 必填
     */
    private String trade_state_desc;

    public String getTrade_state_desc() {
        return trade_state_desc;
    }

    public void setTrade_state_desc(String trade_state_desc) {
        this.trade_state_desc = trade_state_desc;
    }

    /**
     * 用户标识
     * 用户在商户appid下的唯一标识
     * 选填
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
