package org.nutz.pay.bean.weixin.resp;

/**
 * Created by Howe on 2017/4/24.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class RefundqueryResp extends Base {

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
     * 订单金额
     * 订单总金额，单位为分，只能为整数，详见支付金额
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
     * 货币种类
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
     * 退款笔数
     * 退款记录数
     * 必填
     */
    private Integer refund_count;

    public Integer getRefund_count() {
        return refund_count;
    }

    public void setRefund_count(Integer refund_count) {
        this.refund_count = refund_count;
    }
}
