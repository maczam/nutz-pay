package org.nutz.pay.bean.alipay.req.unity;

/**
 * 统一收单交易撤销接口请求参数
 * Created by Jianghao on 2017/4/21
 *
 * @howechiang
 */
public class TradeCancel {

    /**
     * 原支付请求的商户订单号
     * 和支付宝交易号不能同时为空
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
}
