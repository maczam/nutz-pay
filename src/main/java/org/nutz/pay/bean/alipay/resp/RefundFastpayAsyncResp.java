package org.nutz.pay.bean.alipay.resp;

/**
 * 即时到账有密退款异步回传
 * Created by Howe on 2017/4/18.
 * @author Howe(howechiang@gmail.com)
 *
 * 1.用户在登录成功后会看到一个支付宝提示登录的页面，该页面会停留几秒，然后会自动跳转回商户指定的同步通知页面（参数return_url）。
 * 2.该页面中获得参数的方式，需要使用GET方式获取，如request.QueryString(“out_trade_no”)、$_GET[‘out_trade_no’]。后续商户可根据获取的信息作处理，譬如，可以把获取到的token放入session中，以便于后续需要使用到token访问支付宝相应服务时，可以便捷地重用。
 * 3.该方式仅仅在用户登录完成以后进行自动跳转，因此只会进行一次。
 * 4.该方式不是支付宝主动去调用商户页面，而是支付宝的程序利用页面自动跳转的函数，使用户的当前页面自动跳转。
 * 5.该方式可在本机而不是只能在服务器上进行调试。
 * 6.返回URL只有一分钟的有效期，超过一分钟该链接地址会失效，验证则会失败。
 * 7.设置页面跳转同步通知页面（return_url）的路径时，不要在页面文件的后面再加上自定义参数。例如：
 * 错误的写法：http://www.alipay.com/alipay/return_url.php?xx=11
 * 正确的写法：http://www.alipay.com/alipay/return_url.php
 * 8.由于支付宝会对页面跳转同步通知页面（return_url）的域名进行合法有效性校验，因此设置页面跳转同步通知页面（return_url）的路径时，不要设置成本机域名，也不能带有特殊字符（如“!”），如：错误的写法：
 * http://localhost/alipay/return_url.php
 * http://localhost:80/alipay/return_url.php
 * http://商户自定义地址/alipay/return!url.do
 * 正确的写法：
 * 能够正常访问的域名地址：http://商户自定义地址/alipay/return_url.php
 * 能够正常访问的IP地址：http://121.1.1.255/alipay/return_url.php
 */
public class RefundFastpayAsyncResp extends Base {


    /**
     * 退款批次号
     * 原请求退款批次号。
     * 不可空
     */
    private String batch_no;

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    /**
     * 退款成功总数
     * 退交易成功的笔数。
     * 0<= success_num<= 总退款笔数。
     * 不可空
     */
    private String success_num;

    public String getSuccess_num() {
        return success_num;
    }

    public void setSuccess_num(String success_num) {
        this.success_num = success_num;
    }

    /**
     * 退款结果明细
     * 退款结果明细。
     * 退手续费结果返回格式：交易号^退款金额^处理结果$退费账号^退费账户ID^退费金额^处理结果；
     * 不退手续费结果返回格式：交易号^退款金额^处理结果。
     * 若退款申请提交成功，处理结果会返回“SUCCESS”。
     * 若提交失败，退款的处理结果中会有报错码，参见<a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.yVU00p&treeId=62&articleId=104744&docType=1#s4">业务错误码</a>。
     * 可空
     *
     */
    private String result_details;
}
