package org.nutz.pay.bean.alipay.resp.unity;

/**
 * 查询对账单下载地址
 * Created by Jianghao on 2017/4/23
 *
 * @howechiang
 */
public class DataDataserviceBillDownloadurlQueryResp extends Base {

    /**
     * 账单下载地址链接，获取连接后30秒后未下载，链接地址失效。
     * 必填
     */
    private String bill_download_url;

    public String getBill_download_url() {
        return bill_download_url;
    }

    public void setBill_download_url(String bill_download_url) {
        this.bill_download_url = bill_download_url;
    }
}
