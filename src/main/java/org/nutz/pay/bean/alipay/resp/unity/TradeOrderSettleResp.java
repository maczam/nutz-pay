package org.nutz.pay.bean.alipay.resp.unity;

/**
 * Created by howe on 2017/4/22.
 */
public class TradeOrderSettleResp extends Base {

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
}
