package org.nutz.pay.bean.alipay.req.wap;

import java.util.Map;

/**
 * Created by Howe on 2017/4/19.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class TradeWapPay {

    /**
     * 交易的具体描述信息
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
     * 商品的标题/交易标题/订单标题/订单关键字等。
     * 选填
     */
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 商户网站唯一订单号
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
     * 逾期关闭交易时间
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
     * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
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
     * 收款支付宝用户ID。 如果该值为空，则默认为商户签约账号对应的支付宝用户ID
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
     * 针对用户授权接口，获取用户相关数据时，用于标识用户授权关系
     * 选填
     */
    private String auth_token;

    public String getAuth_token() {
        return auth_token;
    }

    public void setAuth_token(String auth_token) {
        this.auth_token = auth_token;
    }

    /**
     * 销售产品码，商家和支付宝签约的产品码
     * QUICK_WAP_PAY
     * 必填
     */
    private String product_code = "QUICK_WAP_PAY";

    public String getProduct_code() {
        return product_code;
    }

    /**
     * 商品主类型：
     * 0—虚拟类商品，1—实物类商品
     * 注：虚拟类商品不支持使用花呗渠道
     * 选填
     */
    private String goods_type;

    public String getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(String goods_type) {
        this.goods_type = goods_type;
    }

    /**
     * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。
     * 支付宝会在异步通知时将该参数原样返回。
     * 本参数必须进行UrlEncode之后才可以发送给支付宝
     * 选填
     */
    private String passback_params;

    public String getPassback_params() {
        return passback_params;
    }

    public void setPassback_params(String passback_params) {
        this.passback_params = passback_params;
    }

    /**
     * 优惠参数
     * 注：仅与支付宝协商后可用
     * 格式:{"storeIdType":"1"}
     * 选填
     */
    private String promo_params;

    public String getPromo_params() {
        return promo_params;
    }

    public void setPromo_params(String promo_params) {
        this.promo_params = promo_params;
    }

    /**
     * 业务扩展参数，详见下面的“业务扩展参数说明”
     * 参数		                 描述	                                                                    示例值
     * sys_service_provider_id	 系统商编号，该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID	2088511833207846
     * needBuyerRealnamed        是否发起实名校验 T：发起 F：不发起                                         T
     * TRANS_MEMO                账务备注 注：该字段显示在离线账单的账务备注中                              促销
     * 格式:{"sys_service_provider_id":"2088511833207846"}
     * 选填
     */
    private TradeWapPayExpand extend_params;

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public TradeWapPayExpand getExtend_params() {
        return extend_params;
    }

    /**
     * 支付渠道
     * 可用渠道，用户只能在指定渠道范围内支付 当有多个渠道时用“,”分隔
     * 注：与disable_pay_channels互斥
     * 渠道名称	                说明
     * balance                  余额
     * moneyFund                余额宝
     * coupon	                红包
     * pcredit	                花呗
     * pcreditpayInstallment	花呗分期
     * creditCard	            信用卡
     * creditCardExpress	    信用卡快捷
     * creditCardCartoon	    信用卡卡通
     * credit_group	            信用支付类型（包含信用卡卡通、信用卡快捷、花呗、花呗分期）
     * debitCardExpress	        借记卡快捷
     * mcard	                商户预存卡
     * pcard	                个人预存卡
     * promotion	            优惠（包含实时优惠+商户优惠）
     * voucher	                营销券
     * point	                积分
     * mdiscount	            商户优惠
     * bankPay	                网银
     * 格式: pcredit,moneyFund,debitCardExpress
     * 选填
     */
    private String enable_pay_channels;

    public String getEnable_pay_channels() {
        return enable_pay_channels;
    }

    public void setEnable_pay_channels(String enable_pay_channels) {
        this.enable_pay_channels = enable_pay_channels;
    }

    /**
     * 禁用渠道
     * 用户不可用指定渠道支付当有多个渠道时用“,”分隔
     * 注：与enable_pay_channels互斥
     * 格式: pcredit,moneyFund,debitCardExpress
     * 选填
     */
    private String disable_pay_channels;

    public String getDisable_pay_channels() {
        return disable_pay_channels;
    }

    public void setDisable_pay_channels(String disable_pay_channels) {
        this.disable_pay_channels = disable_pay_channels;
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
}
