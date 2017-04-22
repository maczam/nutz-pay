package org.nutz.pay.bean.alipay.req.wap;

/**
 * 统一收单线下交易查询接口
 * Created by Jianghao on 2017/4/22
 *
 * @howechiang
 */
public class TradeQuery {

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

}
