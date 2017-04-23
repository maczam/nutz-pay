package org.nutz.pay.bean.alipay.req.unity;

/**
 * Created by howe on 2017/4/22.
 */
public class TradeFastpayRefundQuery {

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
     * 请求退款接口时，传入的退款请求号，如果在退款请求时未传入，则该值为创建交易时的外部交易号
     * 必填
     */
    private String out_request_no;

    public String getOut_request_no() {
        return out_request_no;
    }

    public void setOut_request_no(String out_request_no) {
        this.out_request_no = out_request_no;
    }
}
