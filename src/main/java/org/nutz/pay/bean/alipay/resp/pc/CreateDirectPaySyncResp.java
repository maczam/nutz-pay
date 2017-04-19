package org.nutz.pay.bean.alipay.resp.pc;

/**
 * 即时到账交易同步回传
 * Created by Howe on 2017/4/18.
 *
 * @author Howe(howechiang@gmail.com)
 *         <p>
 *         必须保证服务器异步通知页面（notify_url）上无任何字符，如空格、HTML标签、开发系统自带抛出的异常提示信息等；
 *         支付宝是用POST方式发送通知信息，因此该页面中获取参数的方式，如：
 *         request.Form("out_trade_no")、$_POST['out_trade_no']；
 *         支付宝主动发起通知，该方式才会被启用；
 *         只有在支付宝的交易管理中存在该笔交易，且发生了交易状态的改变，支付宝才会通过该方式发起服务器通知（即时到账中交易状态为“等待买家付款”的状态默认是不会发送通知的）；
 *         服务器间的交互，不像页面跳转同步通知可以在页面上显示出来，这种交互方式是不可见的；
 *         第一次交易状态改变（即时到账中此时交易状态是交易完成）时，不仅页面跳转同步通知页面会启用，而且服务器异步通知页面也会收到支付宝发来的处理结果通知；
 *         程序执行完后必须打印输出“success”（不包含引号）。如果商户反馈给支付宝的字符不是success这7个字符，支付宝服务器会不断重发通知，直到超过24小时22分钟。
 *         一般情况下，25小时以内完成8次通知（通知的间隔频率一般是：4m,10m,10m,1h,2h,6h,15h）；
 *         程序执行完成后，该页面不能执行页面跳转。如果执行页面跳转，支付宝会收不到success字符，会被支付宝服务器判定为该页面程序运行出现异常，而重发处理结果通知；
 *         cookies、session等在此页面会失效，即无法获取这些数据；
 *         该方式的调试与运行必须在服务器上，即互联网上能访问；
 *         该方式的作用主要防止订单丢失，即页面跳转同步通知没有处理订单更新，它则去处理；
 *         当商户收到服务器异步通知并打印出success时，服务器异步通知参数notify_id才会失效。也就是说在支付宝发送同一条异步通知时（包含商户并未成功打印出success导致支付宝重发数次通知），服务器异步通知参数notify_id是不变的。
 */
public class CreateDirectPaySyncResp {

    /**
     * 成功标识
     * 表示接口调用是否成功，并不表明业务处理结果。
     * T/F
     * 不可空
     */
    private String is_success;

    public String getIs_success() {
        return is_success;
    }

    public void setIs_success(String is_success) {
        this.is_success = is_success;
    }

    /**
     * 签名方式
     * DSA、RSA、MD5三个值可选，必须大写。
     * 不可空
     */
    private String sign_type;

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    /**
     * 签名
     * 请参见本文档“附录：签名与验签”。
     * 不可空
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 商户网站唯一订单号
     * 对应商户网站的订单系统中的唯一订单号，非支付宝交易号。需保证在商户网站中的唯一性。是请求时对应的参数，原样返回。
     * 可空
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
     * 可空
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
     * 可空
     */
    private String payment_type;

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    /**
     * 接口名称
     * 标志调用哪个接口返回的链接。
     * 可空
     */
    private String exterface;

    public String getExterface() {
        return exterface;
    }

    public void setExterface(String exterface) {
        this.exterface = exterface;
    }

    /**
     * 支付宝交易号
     * 该交易在支付宝系统中的交易流水号。最长64位。
     * 可空
     */
    private String trade_no;

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    /**
     * 交易状态
     * 交易目前所处的状态。成功状态的值只有两个：
     * TRADE_FINISHED（普通即时到账的交易成功状态）；
     * TRADE_SUCCESS（开通了高级即时到账或机票分销产品后的交易成功状态）
     * 可空
     */
    private String trade_status;

    public String getTrade_status() {
        return trade_status;
    }

    public void setTrade_status(String trade_status) {
        this.trade_status = trade_status;
    }

    /**
     * 通知校验ID
     * 支付宝通知校验ID，商户可以用这个流水号询问支付宝该条通知的合法性。
     * 可空
     */
    private String notify_id;

    public String getNotify_id() {
        return notify_id;
    }

    public void setNotify_id(String notify_id) {
        this.notify_id = notify_id;
    }

    /**
     * 通知时间
     * 通知时间（支付宝时间）。格式为yyyy-MM-dd HH:mm:ss。
     * 可空
     */
    private String notify_time;

    public String getNotify_time() {
        return notify_time;
    }

    public void setNotify_time(String notify_time) {
        this.notify_time = notify_time;
    }

    /**
     * 通知类型
     * 返回通知类型。
     * 可空
     */
    private String notify_type;

    public String getNotify_type() {
        return notify_type;
    }

    public void setNotify_type(String notify_type) {
        this.notify_type = notify_type;
    }

    /**
     * 卖家支付宝账号
     * 卖家支付宝账号，可以是Email或手机号码。
     * 可空
     */
    private String seller_email;

    public String getSeller_email() {
        return seller_email;
    }

    public void setSeller_email(String seller_email) {
        this.seller_email = seller_email;
    }

    /**
     * 买家支付宝账号
     * 买家支付宝账号，可以是Email或手机号码。
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
     * 卖家支付宝账户号
     * 卖家支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
     * 可空
     */
    private String seller_id;

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    /**
     * 买家支付宝账户号
     * 买家支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
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
     * 交易金额
     * 该笔订单的资金总额，单位为RMB-Yuan。取值范围为[0.01,100000000.00]，精确到小数点后两位。
     * 可空
     */
    private Double total_fee;

    public Double getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(Double total_fee) {
        this.total_fee = total_fee;
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
     * 公用回传参数
     * 用于商户回传参数，该值不能包含“=”、“&”等特殊字符。如果用户请求时传递了该参数，则返回给商户时会回传该参数。
     * 可空
     */
    private String extra_common_param;

    public String getExtra_common_param() {
        return extra_common_param;
    }

    public void setExtra_common_param(String extra_common_param) {
        this.extra_common_param = extra_common_param;
    }
}
