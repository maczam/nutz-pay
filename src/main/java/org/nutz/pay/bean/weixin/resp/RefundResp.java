package org.nutz.pay.bean.weixin.resp;

/**
 * Created by Howe on 2017/4/24.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class RefundResp extends Base {

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
     * 微信订单号
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
     * 商户系统内部的订单号
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
     * 商户退款单号
     * 必填
     */
    private String out_refund_no;

    public String getOut_refund_no() {
        return out_refund_no;
    }

    public void setOut_refund_no(String out_refund_no) {
        this.out_refund_no = out_refund_no;
    }

    /**
     * 微信退款单号
     * 必填
     */
    private String refund_id;

    public String getRefund_id() {
        return refund_id;
    }

    public void setRefund_id(String refund_id) {
        this.refund_id = refund_id;
    }

    /**
     * 退款金额
     * 退款总金额,单位为分,
     * 可以做部分退款
     * 必填
     */
    private Integer refund_fee;

    public Integer getRefund_fee() {
        return refund_fee;
    }

    public void setRefund_fee(Integer refund_fee) {
        this.refund_fee = refund_fee;
    }

    /**
     * 应结退款金额
     * 去掉非充值代金券退款金额后的退款金额，
     * 退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额
     * 选填
     */
    private Integer settlement_refund_fee;

    public Integer getSettlement_refund_fee() {
        return settlement_refund_fee;
    }

    public void setSettlement_refund_fee(Integer settlement_refund_fee) {
        this.settlement_refund_fee = settlement_refund_fee;
    }

    /**
     * 标价金额
     * 订单总金额，单位为分，只能为整数，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2">支付金额</a>
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
     * 去掉非充值代金券金额后的订单总金额，
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
     * 订单金额货币类型，符合ISO 4217标准的三位字母代码，
     * 默认人民币：CNY，其他值列表详见货币类型
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
     * 现金支付金额
     * 现金支付金额，单位为分，只能为整数，详见支付金额
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
     * 现金支付币种
     * 货币类型，符合ISO 4217标准的三位字母代码，
     * 默认人民币：CNY，其他值列表详见货币类型
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
     * 现金退款金额
     * 单位为分，只能为整数，详见支付金额
     * 选填
     */
    private Integer cash_refund_fee;

    public Integer getCash_refund_fee() {
        return cash_refund_fee;
    }

    public void setCash_refund_fee(Integer cash_refund_fee) {
        this.cash_refund_fee = cash_refund_fee;
    }

    /**
     * 代金券退款总金额
     * 代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金，说明详见代金券或立减优惠
     * 选填
     */
    private Integer coupon_refund_fee;

    public Integer getCoupon_refund_fee() {
        return coupon_refund_fee;
    }

    public void setCoupon_refund_fee(Integer coupon_refund_fee) {
        this.coupon_refund_fee = coupon_refund_fee;
    }

    /**
     * 退款代金券使用数量
     * 选填
     */
    private Integer coupon_refund_count;

    public Integer getCoupon_refund_count() {
        return coupon_refund_count;
    }

    public void setCoupon_refund_count(Integer coupon_refund_count) {
        this.coupon_refund_count = coupon_refund_count;
    }
}
