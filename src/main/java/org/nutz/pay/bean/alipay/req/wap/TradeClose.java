package org.nutz.pay.bean.alipay.req.wap;

/**
 * 统一收单交易关闭接口请求参数
 * Created by Jianghao on 2017/4/22
 *
 * @howechiang
 */
public class TradeClose {

    /**
     * 该交易在支付宝系统中的交易流水号。
     * 最短 16 位，最长 64 位。
     * 和out_trade_no不能同时为空，如果同时传了 out_trade_no和 trade_no，则以 trade_no为准。
     */
    private String trade_no;

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    /**
     * 	订单支付时传入的商户订单号,和支付宝交易号不能同时为空。
     * 	trade_no,out_trade_no如果同时存在优先取trade_no
     */
    private String out_trade_no;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * 卖家端自定义的的操作员 ID
     * 可选
     */
    private String operator_id;

    public String getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id;
    }
}
