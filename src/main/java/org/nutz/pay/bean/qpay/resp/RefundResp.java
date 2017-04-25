package org.nutz.pay.bean.qpay.resp;

/**
 * Created by Howe on 2017/4/25.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class RefundResp extends Base {

    /**
     * QQ钱包订单号
     * QQ钱包订单号，优先使用
     * 必填
     */
    private String transaction_id;

    /**
     * 商户订单号
     * 商户系统内部的订单号,32个字符内、可包含字母，说明见商户订单号
     * 当没提供transaction_id时需要传入该参数
     * 必填
     */
    private String out_trade_no;

    /**
     * 商户退款单号
     * 商户系统内部的退款单号，商户系统内部唯一，同一退款单号多次请求只退一笔
     * 必填
     */
    private String out_refund_no;

    /**
     * QQ钱包退款单号
     * 在成功受理商户的退款申请后，QQ钱包会为本次退款申请生成该QQ钱包退款单号
     * 必填
     */
    private String refund_id;

    /**
     * 退款方式
     * ORIGINAL 原路退回
     * BALANCE  退款到余额
     * 必填
     */
    private String refund_channel;

    /**
     * 退款申请金额
     * 本次退款申请的退回金额。单位：分。币种：人民币
     * 必填
     */
    private Integer refund_fee;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getOut_refund_no() {
        return out_refund_no;
    }

    public void setOut_refund_no(String out_refund_no) {
        this.out_refund_no = out_refund_no;
    }

    public String getRefund_id() {
        return refund_id;
    }

    public void setRefund_id(String refund_id) {
        this.refund_id = refund_id;
    }

    public String getRefund_channel() {
        return refund_channel;
    }

    public void setRefund_channel(String refund_channel) {
        this.refund_channel = refund_channel;
    }

    public Integer getRefund_fee() {
        return refund_fee;
    }

    public void setRefund_fee(Integer refund_fee) {
        this.refund_fee = refund_fee;
    }
}
