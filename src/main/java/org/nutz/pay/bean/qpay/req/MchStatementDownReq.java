package org.nutz.pay.bean.qpay.req;

/**
 * Created by Howe on 2017/4/25.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class MchStatementDownReq {

    /**
     * 对账单时间
     * 交易实际发生的日期 格式为YYYYMMDD
     * 必填
     */
    private String bill_date;

    /**
     * 对账单类型
     * <p>
     * ALL，返回当日所有交易账单；
     * 默认值SUCCESS，返回当日支付账单；
     * REFUND，返回当日退款账单
     * 必填
     */
    private String bill_type;

    /**
     * 压缩账单
     * 非必传，如果传入则返回格式为.gzip的压缩包账单，
     * 不传则默认为数据流形式
     * 选填
     */
    private String tar_type;

    public String getBill_date() {
        return bill_date;
    }

    public void setBill_date(String bill_date) {
        this.bill_date = bill_date;
    }
}
