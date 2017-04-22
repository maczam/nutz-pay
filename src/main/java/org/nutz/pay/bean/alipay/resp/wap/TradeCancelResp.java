package org.nutz.pay.bean.alipay.resp.wap;

/**
 * 统一收单交易撤销接口响应参数
 * Created by Jianghao on 2017/4/21
 *
 * @howechiang
 */
public class TradeCancelResp extends Base {

    /**
     * 支付宝交易号
     * 必填
     */
    private String trade_no;

    public java.lang.String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(java.lang.String trade_no) {
        this.trade_no = trade_no;
    }

    /**
     * 商户订单号
     * 必填
     */
    private String out_trade_no;

    public java.lang.String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(java.lang.String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * 是否需要重试
     * Y/N
     * 必填
     */
    private String retry_flag;

    public java.lang.String getRetry_flag() {
        return retry_flag;
    }

    public void setRetry_flag(java.lang.String retry_flag) {
        this.retry_flag = retry_flag;
    }

    /**
     * 本次撤销触发的交易动作
     * close：关闭交易，无退款
     * refund：产生了退款
     * 必填
     */
    private String action;

    public java.lang.String getAction() {
        return action;
    }

    public void setAction(java.lang.String action) {
        this.action = action;
    }
}
