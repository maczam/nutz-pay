package org.nutz.pay.bean.qpay.req;

/**
 * <a href="https://qpay.qq.com/qpaywiki/showdocument.php?pid=38&docid=58">统一下单</a>
 * Created by Howe on 2017/4/17.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class UnifiedOrderReq extends Base {


    /**
     * 商品描述
     * 商品命名规则，详见<a href="https://qpay.qq.com/qpaywiki/showdocument.php?pid=38&docid=56">body字段格式规定</a>
     * 必填
     */
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 附加数据
     * 附加数据，在查询API和支付通知中原样返回，该字段主要用于商户携带订单的自定义数据
     * 选填
     */
    private String attach;

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
     * 商户订单号
     * 商户系统内部的订单号,32个字符内、可包含字母，其它说明见<a href="https://qpay.qq.com/qpaywiki/showdocument.php?pid=38&docid=56">商户订单号</a> (
     * 等同于老版接口中的"sp_billno" )
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
     * 货币类型定义
     * 默认为人民币：CNY
     * 必填
     */
    private String fee_type;

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    /**
     * 订单金额
     * 商户订单总金额，单位为分，只能为整数，详见<a href="https://qpay.qq.com/qpaywiki/showdocument.php?pid=38&docid=56">交易金额</a>
     * 必填
     */
    private Integer total_fee;

    public Integer getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(Integer total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * 终端IP
     * 用户端实际ip
     * 必填
     */
    private String spbill_create_ip;

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    /**
     * 订单生成时间
     * 订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。时区为GMT+8 beijing。该时间取自商户服务器。
     * 选填
     */
    private String time_start;

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    /**
     * 订单超时时间
     * 订单失效时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。时区为GMT+8 beijing。该时间取自商户服务器。
     * 选填
     */
    private String time_expire;

    public String getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(String time_expire) {
        this.time_expire = time_expire;
    }

    /**
     * 支付方式限制
     * 可以针对当前的交易，限制用户的支付方式，如：仅允许使用余额，或者是禁止使用信用卡。详情见<a href="https://qpay.qq.com/qpaywiki/showdocument.php?pid=38&docid=56">支付方式限制</a>
     * 选填
     */
    private String limit_pay;

    public String getLimit_pay() {
        return limit_pay;
    }

    public void setLimit_pay(String limit_pay) {
        this.limit_pay = limit_pay;
    }

    /**
     * 代扣签约序列号
     * 商户侧记录的用户代扣协议序列号，支付中开通代扣必传
     * 选填
     */
    private String contract_code;

    public String getContract_code() {
        return contract_code;
    }

    public void setContract_code(String contract_code) {
        this.contract_code = contract_code;
    }

    /**
     * QQ钱包活动标识
     * 指定本单参与某个QQ钱包活动或活动档位的标识，包含两个标识：
     * sale_tag --- 不同活动的匹配标志
     * level_tag --- 同一活动不同优惠档位的标志，可不填格式如下（本字段参与签名）：promotion_tag=urlencode(level_tag=xxx&sale_tag=xxx)
     * 选填
     */
    private String promotion_tag;

    public String getPromotion_tag() {
        return promotion_tag;
    }

    public void setPromotion_tag(String promotion_tag) {
        this.promotion_tag = promotion_tag;
    }

    /**
     * 支付场景
     * APP、JSAPI、NATIVE，详见<a href="https://qpay.qq.com/qpaywiki/showdocument.php?pid=38&docid=53">支付场景</a>
     * 必填
     */
    private String trade_type;

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    /**
     * 支付结果通知地址
     * 接收QQ钱包异步通知回调地址，通知url必须为直接可访问的url，不能携带参数 。基于安全考虑，建议使用https
     * 必填
     */
    private String notify_url;

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    /**
     * 设备号
     * 调用接口提交的终端设备号
     * 选填
     */
    private String device_info;

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

}
