package org.nutz.pay.bean.alipay.req.unity;

import org.nutz.pay.bean.alipay.req.unity.extend.*;

import java.util.List;

/**
 * Created by howe on 2017/4/22.
 */
public class TradePay {

    /**
     * 商户订单号
     * 64个字符以内、可包含字母、数字、下划线
     * 需保证在商户端不重复
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
     * 支付场景
     * 条码支付，取值：bar_code
     * 声波支付，取值：wave_code
     * 必填
     */
    private String scene;

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    /**
     * 支付授权码
     * 必填
     */
    private String auth_code;

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    /**
     * 销售产品码
     * 选填
     */
    private String product_code;

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
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
     * 买家的支付宝用户id
     * 如果为空，会从传入了码值信息中获取买家ID
     * 必填
     */
    private String buyer_id;

    public String getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(String buyer_id) {
        this.buyer_id = buyer_id;
    }

    /**
     * 如果该值为空
     * 则默认为商户签约账号对应的支付宝用户ID
     * 必填
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
     * 单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
     * 如果同时传入【可打折金额】和【不可打折金额】，该参数可以不用传入；
     * 如果同时传入了【可打折金额】，【不可打折金额】，【订单总金额】三者，
     * 则必须满足如下条件：【订单总金额】=【可打折金额】+【不可打折金额】
     * 选填
     */
    private Double total_amount;

    public Double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }

    /**
     * 参与优惠计算的金额
     * 单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
     * 如果该值未传入，但传入了【订单总金额】和【不可打折金额】，
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
     * 不参与优惠计算的金额
     * 单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
     * 如果该值未传入，但传入了【订单总金额】和【可打折金额】，
     * 则该值默认为【订单总金额】-【可打折金额】
     * 选填
     */
    private Double undiscountable_amount;

    public Double getUndiscountable_amount() {
        return undiscountable_amount;
    }

    public void setUndiscountable_amount(Double undiscountable_amount) {
        this.undiscountable_amount = undiscountable_amount;
    }

    /**
     * 订单描述
     * 选填
     */
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 订单包含的商品列表信息，Json格式，其它说明详见商品明细说明
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
     * 商户门店编号
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
     * 商户机具终端编号
     * 选填
     */
    private String terminal_id;

    public String getTerminal_id() {
        return terminal_id;
    }

    public void setTerminal_id(String terminal_id) {
        this.terminal_id = terminal_id;
    }

    /**
     * 支付宝的店铺编号
     * 选填
     */
    private String alipay_store_id;

    public String getAlipay_store_id() {
        return alipay_store_id;
    }

    public void setAlipay_store_id(String alipay_store_id) {
        this.alipay_store_id = alipay_store_id;
    }

    /**
     * 业务扩展参数
     * 选填
     */
    private ExpandParams extend_params;

    public ExpandParams getExtend_params() {
        return extend_params;
    }

    public void setExtend_params(ExpandParams extend_params) {
        this.extend_params = extend_params;
    }

    /**
     * 该笔订单允许的最晚付款时间，逾期将关闭交易。
     * 取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。
     * 该参数数值不接受小数点， 如 1.5h，可转换为 90m
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
     * 描述分账信息，Json格式，其它说明详见分账说明
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
     * 外部指定买家
     * 选填
     */
    private ExtUserInfo ext_user_info;

    public ExtUserInfo getExt_user_info() {
        return ext_user_info;
    }

    public void setExt_user_info(ExtUserInfo ext_user_info) {
        this.ext_user_info = ext_user_info;
    }
}
