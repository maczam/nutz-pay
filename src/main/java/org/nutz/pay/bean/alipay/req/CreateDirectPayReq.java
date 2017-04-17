package org.nutz.pay.bean.alipay.req;

/**
 * Created by Howe on 2017/4/17.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class CreateDirectPayReq extends Base {

    /**
     * 商户网站唯一订单号
     * 支付宝合作商户网站唯一订单号。
     * 不可空
     */
    private String out_trade_no;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * 商品名称
     * 商品的标题/交易标题/订单标题/订单关键字等。
     * 该参数最长为128个汉字。
     * 不可空
     */
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 支付类型
     * 只支持取值为1（商品购买）。
     * 不可空
     */
    private String payment_type;

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    /**
     * 交易金额
     * 该笔订单的资金总额，单位为RMB-Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。
     * 不可空
     */
    private Double total_fee;

    public Double getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(Double total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * 卖家支付宝用户号
     * seller_id是以2088开头的纯16位数字。
     * 当签约账号就是收款账号时，请务必使用参数seller_id，即seller_id的值与partner的值相同。
     * 三个参数的优先级别是：seller_id>seller_account_name>seller_email。
     * seller_id、seller_email、seller_account_name三个参数至少必须传递一个。
     */
    private String seller_id;

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    /**
     * 卖家支付宝账号
     * seller_email是支付宝登录账号，格式一般是邮箱或手机号。
     * seller_id、seller_email、seller_account_name三个参数至少必须传递一个。
     */
    private String seller_email;

    public String getSeller_email() {
        return seller_email;
    }

    public void setSeller_email(String seller_email) {
        this.seller_email = seller_email;
    }

    /**
     * 卖家支付宝账号别名
     * seller_account_name是卖家支付宝账号别名。
     * seller_id、seller_email、seller_account_name三个参数至少必须传递一个。
     */
    private String seller_account_name;

    public String getSeller_account_name() {
        return seller_account_name;
    }

    public void setSeller_account_name(String seller_account_name) {
        this.seller_account_name = seller_account_name;
    }

    /**
     * 买家支付宝用户号
     * buyer_id是以2088开头的纯16位数字。
     * 三个参数的优先级别是：buyer_id>buyer_account_name>buyer_email。
     * 可空
     */
    private String buyer_id;

    public String getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(String buyer_id) {
        this.buyer_id = buyer_id;
    }

    /**
     * 买家支付宝账号
     * buyer_email是支付宝登录账号，格式一般是邮箱或手机号。
     * 可空
     */
    private String buyer_email;

    public String getBuyer_email() {
        return buyer_email;
    }

    public void setBuyer_email(String buyer_email) {
        this.buyer_email = buyer_email;
    }

    /**
     * 买家支付宝账号别名
     * buyer_account_name是买家支付宝账号别名。
     * 可空
     */
    private String buyer_account_name;

    public String getBuyer_account_name() {
        return buyer_account_name;
    }

    public void setBuyer_account_name(String buyer_account_name) {
        this.buyer_account_name = buyer_account_name;
    }

    /**
     * 商品单价
     * 单位为：RMB Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。此参数为单价
     * 规则：price、quantity能代替total_fee。即存在total_fee，就不能存在price和quantity；存在price、quantity，就不能存在total_fee。
     * 可空
     */
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 购买数量
     * price、quantity能代替total_fee。即存在total_fee，就不能存在price和quantity；存在price、quantity，就不能存在total_fee。
     * 可空
     */
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 商品描述
     * 对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。
     * 可空
     */
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 商品展示网址
     * 收银台页面上，商品展示的超链接。
     * 可空
     */
    private String show_url;

    public String getShow_url() {
        return show_url;
    }

    public void setShow_url(String show_url) {
        this.show_url = show_url;
    }

    /**
     * 可用渠道
     * 可用的<a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.Y1dTqo&treeId=62&articleId=104743&docType=1#s6">支付渠道</a>，用户只能在指定渠道范围内支付。
     * 当有多个渠道时，以“^”分隔。
     * 与disable_paymethod互斥。
     * directPay^bankPay^cartoon^cash
     * 可空
     */
    private String enable_paymethod;

    public String getEnable_paymethod() {
        return enable_paymethod;
    }

    public void setEnable_paymethod(String enable_paymethod) {
        this.enable_paymethod = enable_paymethod;
    }

    /**
     * 禁用渠道
     * 被禁用的<a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.Y1dTqo&treeId=62&articleId=104743&docType=1#s6">支付渠道</a>，用户不可用指定渠道支付。
     * 当有多个渠道时，以“^”分隔。
     * 与nable_paymethod互斥。
     * directPay^bankPay^cartoon
     * 可空
     */
    private String disable_paymethod;

    public String getDisable_paymethod() {
        return disable_paymethod;
    }

    public void setDisable_paymethod(String disable_paymethod) {
        this.disable_paymethod = disable_paymethod;
    }

    /**
     * 防钓鱼时间戳
     * 通过时间戳查询接口获取的加密支付宝系统时间戳。
     * 如果已申请开通防钓鱼时间戳验证，则此字段必填。
     * 可空
     */
    private String anti_phishing_key;

    public String getAnti_phishing_key() {
        return anti_phishing_key;
    }

    public void setAnti_phishing_key(String anti_phishing_key) {
        this.anti_phishing_key = anti_phishing_key;
    }

    /**
     * 客户端IP
     * 用户在创建交易时，该用户当前所使用机器的IP。
     * 如果商户申请后台开通防钓鱼IP地址检查选项，此字段必填，校验用。
     * 可空
     */
    private String exter_invoke_ip;

    public String getExter_invoke_ip() {
        return exter_invoke_ip;
    }

    public void setExter_invoke_ip(String exter_invoke_ip) {
        this.exter_invoke_ip = exter_invoke_ip;
    }

    /**
     * 公用回传参数
     * 如果用户请求时传递了该参数，则返回给商户时会回传该参数。
     * 可空
     */
    private String extra_common_param;

    public String getExtra_common_param() {
        return extra_common_param;
    }

    public void setExtra_common_param(String extra_common_param) {
        this.extra_common_param = extra_common_param;
    }

    /**
     * 超时时间
     * 设置未付款交易的超时时间，一旦超时，该笔交易就会自动被关闭。
     * 取值范围：1m～15d。
     * m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。
     * 该参数数值不接受小数点，如1.5h，可转换为90m。
     * 可空
     */
    private String it_b_pay;

    public String getIt_b_pay() {
        return it_b_pay;
    }

    public void setIt_b_pay(String it_b_pay) {
        this.it_b_pay = it_b_pay;
    }

    /**
     * 快捷登录授权令牌
     * 如果开通了快捷登录产品，则需要填写；如果没有开通，则为空。
     * 可空
     */
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 扫码支付方式
     * 扫码支付的方式，支持前置模式和跳转模式。
     * 前置模式是将二维码前置到商户的订单确认页的模式。需要商户在自己的页面中以iframe方式请求支付宝页面。具体分为以下4种：
     * 0：订单码-简约前置模式，对应iframe宽度不能小于600px，高度不能小于300px；
     * 1：订单码-前置模式，对应iframe宽度不能小于300px，高度不能小于600px；
     * 3：订单码-迷你前置模式，对应iframe宽度不能小于75px，高度不能小于75px。
     * 4：订单码-可定义宽度的嵌入式二维码，商户可根据需要设定二维码的大小。
     * 跳转模式下，用户的扫码界面是由支付宝生成的，不在商户的域名下。
     * 2：订单码-跳转模式
     * 可空
     */
    private String qr_pay_mode;

    public String getQr_pay_mode() {
        return qr_pay_mode;
    }

    public void setQr_pay_mode(String qr_pay_mode) {
        this.qr_pay_mode = qr_pay_mode;
    }

    /**
     * 商户自定二维码宽度
     * 商户自定义的二维码宽度。
     * 当qr_pay_mode=4时，该参数生效。
     * 可空
     */
    private String qrcode_width;

    public String getQrcode_width() {
        return qrcode_width;
    }

    public void setQrcode_width(String qrcode_width) {
        this.qrcode_width = qrcode_width;
    }

    /**
     * 是否需要买家实名认证
     * 是否需要买家实名认证。
     * T表示需要买家实名认证；
     * 不传或者传其它值表示不需要买家实名认证。
     * 可空
     */
    private String need_buyer_realnamed;

    public String getNeed_buyer_realnamed() {
        return need_buyer_realnamed;
    }

    public void setNeed_buyer_realnamed(String need_buyer_realnamed) {
        this.need_buyer_realnamed = need_buyer_realnamed;
    }

    /**
     * 花呗分期参数
     * 参数格式：hb_fq_seller_percent ^卖家承担付费比例|hb_fq_num ^期数。
     * hb_fq_num：花呗分期数，比如分3期支付；
     * hb_fq_seller_percent：卖家承担收费比例，比如100代表卖家承担100%。
     * 两个参数必须一起传入。
     * 两个参数用“|”间隔。Key和value之间用“^”间隔。
     * 具体花呗分期期数和卖家承担收费比例可传入的数值请咨询支付宝。
     * 	hb_fq_seller_percent^100|hb_fq_num^3
     * 	可空
     */
    private String hb_fq_param;

    public String getHb_fq_param() {
        return hb_fq_param;
    }

    public void setHb_fq_param(String hb_fq_param) {
        this.hb_fq_param = hb_fq_param;
    }

    /**
     * 商品类型
     * 商品类型：
     * 1表示实物类商品
     * 0表示虚拟类商品
     * 如果不传，默认为实物类商品。
     * 可空
     */
    private String  goods_type;

    public String getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(String goods_type) {
        this.goods_type = goods_type;
    }

    /**
     * 业务扩展参数
     * 参数格式：参数名1^参数值1|参数名2^参数值2|……
     * 多条数据用“|”间隔。
     * 详见下面的“业务扩展参数说明”。
     * ISV         系统商编号 String(64)  系统商编号，该参数作为系统商返佣数据提取的依据。 可空
     * TRANS_MEMO  账务备注   String(128) 账务备注。注：该字段显示在离线账单的账务备注中。 可空
     * TRANS_MEMO^促销|ISV^sd22
     * 可空
     */
    private String extend_param;

    public String getExtend_param() {
        return extend_param;
    }

    public void setExtend_param(String extend_param) {
        this.extend_param = extend_param;
    }

}
