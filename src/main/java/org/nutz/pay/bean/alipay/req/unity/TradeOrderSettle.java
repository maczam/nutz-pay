package org.nutz.pay.bean.alipay.req.unity;

import org.nutz.pay.bean.alipay.req.unity.extend.RoyaltyParameter;

import java.util.List;

/**
 * Created by howe on 2017/4/22.
 */
public class TradeOrderSettle {

    /**
     * 结算请求流水号
     * 开发者自行生成并保证唯一性
     * 必填
     */
    private String out_request_no;

    public String getOut_request_no() {
        return out_request_no;
    }

    public void setOut_request_no(String out_request_no) {
        this.out_request_no = out_request_no;
    }

    /**
     * 支付宝订单号
     * 必填
     */
    private String trade_no;

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    /**
     * 分账明细信息
     * 必填
     */
    private List<RoyaltyParameter> royalty_parameters;

    public List<RoyaltyParameter> getRoyalty_parameters() {
        return royalty_parameters;
    }

    public void setRoyalty_parameters(List<RoyaltyParameter> royalty_parameters) {
        this.royalty_parameters = royalty_parameters;
    }

    /**
     * 操作员id
     * 选填
     */
    private String operator_id;

    public String getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id;
    }
}
