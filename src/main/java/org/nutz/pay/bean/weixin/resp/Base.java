package org.nutz.pay.bean.weixin.resp;

/**
 * 基础返回
 * Created by Jianghao on 2017/4/17.
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
     * 返回信息，如非空，为错误原因
     * 选填
     */
    private String return_msg;
}
