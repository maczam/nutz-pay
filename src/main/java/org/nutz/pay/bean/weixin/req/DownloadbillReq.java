package org.nutz.pay.bean.weixin.req;

/**
 * Created by Howe on 2017/4/24.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class DownloadbillReq extends Base {

    /**
     * 设备号
     * 自定义参数，可以为请求支付的终端设备号等
     * 选填
     */
    private String device_info;

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    /**
     * 对账单日期
     * 下载对账单的日期，格式：20140603
     * 必填
     */
    private String bill_date;

    public String getBill_date() {
        return bill_date;
    }

    public void setBill_date(String bill_date) {
        this.bill_date = bill_date;
    }

    /**
     * 账单类型
     * ALL，返回当日所有订单信息，默认值
     * SUCCESS，返回当日成功支付的订单
     * REFUND，返回当日退款订单
     * RECHARGE_REFUND，返回当日充值退款订单（相比其他对账单多一栏“返还手续费”）
     * 必填
     */
    private String bill_type;

    public String getBill_type() {
        return bill_type;
    }

    public void setBill_type(String bill_type) {
        this.bill_type = bill_type;
    }

    /**
     * 压缩账单
     * 非必传参数，固定值：GZIP，返回格式为.gzip的压缩包账单。
     * 不传则默认为数据流形式。
     * 选填
     */
    private String tar_type;

    public String getTar_type() {
        return tar_type;
    }

    public void setTar_type(String tar_type) {
        this.tar_type = tar_type;
    }
}
