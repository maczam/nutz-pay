package org.nutz.pay.bean.weixin.resp;

/**
 * 异步支付通知
 * Created by Howe on 2017/4/24.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class OrdernotifyResp extends Base {

    /**
     * 设备号
     * 微信支付分配的终端设备号，与下单一致
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
     * 用户标识
     * 用户在商户appid下的唯一标识
     * 必填
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 是否关注公众账号
     * 用户是否关注公众账号，
     * Y-关注，N-未关注，仅在公众账号类型支付有效
     * 选填
     */
    private String is_subscribe;

    public String getIs_subscribe() {
        return is_subscribe;
    }

    public void setIs_subscribe(String is_subscribe) {
        this.is_subscribe = is_subscribe;
    }

    /**
     * 交易类型
     * 调用接口提交的交易类型，
     * 取值如下：JSAPI，NATIVE，APP，MICROPAY，
     * 详细说明见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2">参数规定</a>
     */
    private String trade_type;

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    /**
     * 付款银行
     * 银行类型，采用字符串类型的银行标识
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
     * 标价金额
     * 订单总金额，单位为分
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
     * 应结订单金额
     * 应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额。
     * 选填
     */
    private Integer settlement_total_fee;

    public Integer getSettlement_total_fee() {
        return settlement_total_fee;
    }

    public void setSettlement_total_fee(Integer settlement_total_fee) {
        this.settlement_total_fee = settlement_total_fee;
    }

    /**
     * 标价币种
     * 货币类型，符合ISO 4217标准的三位字母代码，
     * 默认人民币：CNY，其他值列表详见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2">货币类型</a>
     * 选填
     */
    private String fee_type;

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    /**
     * 现金支付金额(分)
     * 现金支付金额订单现金支付金额，详见支付金额
     */
    private Integer cash_fee;

    public Integer getCash_fee() {
        return cash_fee;
    }

    public void setCash_fee(Integer cash_fee) {
        this.cash_fee = cash_fee;
    }

    /**
     * 现金支付币种
     * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型
     * 选填
     */
    private String cash_fee_type;

    public String getCash_fee_type() {
        return cash_fee_type;
    }

    public void setCash_fee_type(String cash_fee_type) {
        this.cash_fee_type = cash_fee_type;
    }

    /**
     * 代金券金额
     * “代金券”金额<=订单金额，订单金额-“代金券”金额=现金支付金额，详见支付金额
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
     * 代金券使用数量
     * 代金券使用数量
     * 选填
     */
    private Integer coupon_count;

    public Integer getCoupon_count() {
        return coupon_count;
    }

    public void setCoupon_count(Integer coupon_count) {
        this.coupon_count = coupon_count;
    }

    /**
     * 微信支付订单号
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
     * 商户系统的订单号，与请求一致。
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
     * 附加数据，原样返回
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
     * 订单支付时间，格式为yyyyMMddHHmmss，
     * 如2009年12月25日9点10分10秒表示为20091225091010。其他详见时间规则
     */
    private String time_end;

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }
}
