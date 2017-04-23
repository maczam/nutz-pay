package org.nutz.pay.bean.alipay.req.unity.extend;

import java.util.List;

/**
 * 描述分账信息，Json格式，其它说明详见分账说明
 * Created by Jianghao on 2017/4/21
 *
 * @howechiang
 */
public class RoyaltyInfo {

    /**
     * 分账类型
     * 卖家的分账类型，目前只支持传入ROYALTY（普通分账类型）。
     * 选填
     */
    private String oyalty_type;

    public String getOyalty_type() {
        return oyalty_type;
    }

    public void setOyalty_type(String oyalty_type) {
        this.oyalty_type = oyalty_type;
    }

    /**
     * 分账明细的信息，可以描述多条分账指令，json数组。
     * 必填
     */
    private List<RoyaltyDetailInfo> royalty_detail_infos;

    public List<RoyaltyDetailInfo> getRoyalty_detail_infos() {
        return royalty_detail_infos;
    }

    public void setRoyalty_detail_infos(List<RoyaltyDetailInfo> royalty_detail_infos) {
        this.royalty_detail_infos = royalty_detail_infos;
    }
}
