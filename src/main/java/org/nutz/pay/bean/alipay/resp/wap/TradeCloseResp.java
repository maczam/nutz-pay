package org.nutz.pay.bean.alipay.resp.wap;

/**
 * Created by Jianghao on 2017/4/22
 *
 * @howechiang
 */
public class TradeCloseResp extends Base {

    /**
     * 错误码	                错误描述	    解决方案
     * ACQ.SYSTEM_ERROR	        系统异常	    重新发起请求
     * ACQ.TRADE_NOT_EXIST	    交易不存在	    检查传入的交易号和外部订单号是否正确，修改后再重新发起
     * ACQ.TRADE_STATUS_ERROR	交易状态不合法	检查当前交易的状态是不是等待买家付付款，只有等待买家付款状态下才能发起交易关闭。
     * ACQ.INVALID_PARAMETER	参数无效	    检查请求参数，修改后重新发起请求
     */

    /**
     * 支付宝交易号
     * 选填
     */
    private String trade_no;

    public java.lang.String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(java.lang.String trade_no) {
        this.trade_no = trade_no;
    }

    /**
     * 创建交易传入的商户订单号
     * 选填
     */
    private String out_trade_no;

    public java.lang.String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(java.lang.String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }
}
