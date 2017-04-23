package org.nutz.pay.bean.alipay.req.unity;

import com.alipay.api.domain.ExtendParams;
import org.nutz.pay.bean.alipay.req.unity.extend.GoodsDetail;
import org.nutz.pay.bean.alipay.req.unity.extend.RoyaltyInfo;
import org.nutz.pay.bean.alipay.req.unity.extend.SubMerchan;

import java.util.List;

/**
 * Created by Jianghao on 2017/4/21
 *
 * @howechiang
 */
public class TradePrecreate {

    /**
     * 商户订单号
     * 64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复
     * 必填
     */
    private String out_trade_no;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * 卖家支付宝用户ID
     * 如果该值为空，则默认为商户签约账号对应的支付宝用户ID
     * 选填
     */
    private String seller_id;

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    /**
     * 订单总金额
     * 单位为元，精确到小数点后两位，取值范围[0.01,100000000]
     * 如果同时传入了【打折金额】，【不可打折金额】，【订单总金额】三者，
     * 则必须满足如下条件：【订单总金额】=【打折金额】+【不可打折金额】
     * 必填
     */
    private Double total_amount;

    public Double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }

    /**
     * 可打折金额
     * 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
     * 如果该值未传入，但传入了【订单总金额】，【不可打折金额】
     * 则该值默认为【订单总金额】-【不可打折金额】
     * 选填
     */
    private Double discountable_amount;

    public Double getDiscountable_amount() {
        return discountable_amount;
    }

    public void setDiscountable_amount(Double discountable_amount) {
        this.discountable_amount = discountable_amount;
    }

    /**
     * 不可打折金额
     * 不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
     * 如果该值未传入，但传入了【订单总金额】,【打折金额】，
     * 则该值默认为【订单总金额】-【打折金额】
     */
    private Double undiscountable_amount;

    public Double getUndiscountable_amount() {
        return undiscountable_amount;
    }

    public void setUndiscountable_amount(Double undiscountable_amount) {
        this.undiscountable_amount = undiscountable_amount;
    }

    /**
     * 买家支付宝账号
     * 选填
     */
    private String buyer_logon_id;

    public String getBuyer_logon_id() {
        return buyer_logon_id;
    }

    public void setBuyer_logon_id(String buyer_logon_id) {
        this.buyer_logon_id = buyer_logon_id;
    }

    /**
     * 订单标题
     * 必填
     */
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 订单包含的商品列表信息.Json格式.
     * 其它说明详见：“商品明细说明”
     * 选填
     */
    private List<GoodsDetail> goods_detail;

    public List<GoodsDetail> getGoods_detail() {
        return goods_detail;
    }

    public void setGoods_detail(List<GoodsDetail> goods_detail) {
        this.goods_detail = goods_detail;
    }

    /**
     * 商户操作员编号
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
     * 	商户门店编号
     * 	选填
     */
    private String store_id;

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    /**
     * 	商户机具终端编号
     * 	选填
     */
    private String terminal_id;

    public String getTerminal_id() {
        return terminal_id;
    }

    public void setTerminal_id(String terminal_id) {
        this.terminal_id = terminal_id;
    }

    /**
     * 业务扩展参数
     * 选填
     */
    private ExtendParams extend_params;

    public ExtendParams getExtend_params() {
        return extend_params;
    }

    public void setExtend_params(ExtendParams extend_params) {
        this.extend_params = extend_params;
    }

    /**
     * 该笔订单允许的最晚付款时间，逾期将关闭交易。
     * 取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。
     * 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
     * 选填
     */
    private String timeout_express;

    public String getTimeout_express() {
        return timeout_express;
    }

    public void setTimeout_express(String timeout_express) {
        this.timeout_express = timeout_express;
    }

    /**
     * 描述分账信息，json格式。
     * 选填
     */
    private RoyaltyInfo royalty_info;

    public RoyaltyInfo getRoyalty_info() {
        return royalty_info;
    }

    public void setRoyalty_info(RoyaltyInfo royalty_info) {
        this.royalty_info = royalty_info;
    }

    /**
     * 二级商户信息,当前只对特殊银行机构特定场景下使用此字段
     * 选填
     */
    private SubMerchan sub_merchant;

    public SubMerchan getSub_merchant() {
        return sub_merchant;
    }

    public void setSub_merchant(SubMerchan sub_merchant) {
        this.sub_merchant = sub_merchant;
    }

    /**
     * 支付宝店铺的门店ID
     * 选填
     */
    private String alipay_store_id;

    public String getAlipay_store_id() {
        return alipay_store_id;
    }

    public void setAlipay_store_id(String alipay_store_id) {
        this.alipay_store_id = alipay_store_id;
    }
}
