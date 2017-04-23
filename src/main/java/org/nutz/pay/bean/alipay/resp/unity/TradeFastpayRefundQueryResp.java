package org.nutz.pay.bean.alipay.resp.unity;

/**
 * Created by howe on 2017/4/22.
 */
public class TradeFastpayRefundQueryResp extends Base {

    /**
     * 支付宝交易号
     * 选填
     */
    private String trade_no;

    /**
     * 创建交易传入的商户订单号
     * 选填
     */
    private String out_trade_no;

    /**
     * 本笔退款对应的退款请求号
     * 选填
     */
    private String out_request_no;

    /**
     * 发起退款时，传入的退款原因
     * 选填
     */
    private String refund_reason;

    /**
     * 该笔退款所对应的交易的订单金额
     * 选填
     */
    private Double total_amount;

    /**
     * 该笔退款所对应的交易的订单金额
     * 选填
     */
    private Double refund_amount;

    public java.lang.String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(java.lang.String trade_no) {
        this.trade_no = trade_no;
    }

    public java.lang.String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(java.lang.String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public java.lang.String getOut_request_no() {
        return out_request_no;
    }

    public void setOut_request_no(java.lang.String out_request_no) {
        this.out_request_no = out_request_no;
    }

    public java.lang.String getRefund_reason() {
        return refund_reason;
    }

    public void setRefund_reason(java.lang.String refund_reason) {
        this.refund_reason = refund_reason;
    }

    public Double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }

    public Double getRefund_amount() {
        return refund_amount;
    }

    public void setRefund_amount(Double refund_amount) {
        this.refund_amount = refund_amount;
    }
}
