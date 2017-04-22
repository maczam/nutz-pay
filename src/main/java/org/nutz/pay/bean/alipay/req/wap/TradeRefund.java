package org.nutz.pay.bean.alipay.req.wap;

/**
 * 统一收单交易退款接口
 * Created by Jianghao on 2017/4/22
 *
 * @howechiang
 */
public class TradeRefund {

    /**
     * 订单支付时传入的商户订单号
     * 不能和 trade_no同时为空。
     */
    private String out_trade_no;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * 支付宝交易号
     * 和商户订单号不能同时为空
     */
    private String trade_no;

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    /**
     * 需要退款的金额
     * 该金额不能大于订单金额
     * 单位为元，支持两位小数
     * 必填
     */
    private Double refund_amount;

    public Double getRefund_amount() {
        return refund_amount;
    }

    public void setRefund_amount(Double refund_amount) {
        this.refund_amount = refund_amount;
    }

    /**
     * 退款的原因说明
     * 选填
     */
    private String refund_reason;

    public String getRefund_reason() {
        return refund_reason;
    }

    public void setRefund_reason(String refund_reason) {
        this.refund_reason = refund_reason;
    }

    /**
     * 标识一次退款请求
     * 同一笔交易多次退款需要保证唯一
     * 如需部分退款，则此参数必传。
     */
    private String out_request_no;

    public String getOut_request_no() {
        return out_request_no;
    }

    public void setOut_request_no(String out_request_no) {
        this.out_request_no = out_request_no;
    }

    /**
     * 商户的操作员编号
     * 选填
     */
    private String operator_id;

    public String getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id;
    }

    /**
     * 商户的门店编号
     * 选填
     */
    private String store_id;

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    /**
     * 商户的终端编号
     * 选填
     */
    private String terminal_id;

    public String getTerminal_id() {
        return terminal_id;
    }

    public void setTerminal_id(String terminal_id) {
        this.terminal_id = terminal_id;
    }
}
