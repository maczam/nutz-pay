package org.nutz.pay.bean.qpay.resp;

/**
 * 基础返回
 * Created by Howe on 2017/4/17.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class Base {

    /**
     * 返回状态码
     * SUCCESS/FAIL
     * 此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
     * 必填
     */
    private String return_code;

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    /**
     * 返回信息
     * 选填
     */
    private String return_msg;

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }

    /**
     * 手Q CGI原始错误码
     * 原始错误码
     * 必填
     */
    private String retcode;

    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    /**
     * 手Q CGI原始错误信息
     * 原始错误信息
     * 必填
     */
    private String retmsg;

    public String getRetmsg() {
        return retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg;
    }
}
