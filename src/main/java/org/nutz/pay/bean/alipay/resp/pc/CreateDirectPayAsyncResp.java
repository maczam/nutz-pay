package org.nutz.pay.bean.alipay.resp.pc;

/**
 * 即时到账交易异步回传
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
 *         <p>
 *         触发条件名      触发条件描述  触发条件默认值
 *         TRADE_FINISHED  交易完成      true（触发通知）
 *         TRADE_SUCCESS   支付成功      true（触发通知）
 *         WAIT_BUYER_PAY  交易创建      false（不触发通知）
 *         TRADE_CLOSED    交易关闭      false（不触发通知）
 */
public class CreateDirectPayAsyncResp extends Base {

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


}
