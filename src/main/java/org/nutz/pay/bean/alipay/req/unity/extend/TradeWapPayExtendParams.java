package org.nutz.pay.bean.alipay.req.unity.extend;

/**
 * Created by Howe on 2017/4/19.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class TradeWapPayExtendParams {

    /**
     * 系统商编号，该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
     * 选填
     */
    private String sys_service_provider_id;

    public String getSys_service_provider_id() {
        return sys_service_provider_id;
    }

    public void setSys_service_provider_id(String sys_service_provider_id) {
        this.sys_service_provider_id = sys_service_provider_id;
    }

    /**
     * 是否发起实名校验
     * T：发起
     * F：不发起
     * 选填
     */
    private String needBuyerRealnamed;

    public String getNeedBuyerRealnamed() {
        return needBuyerRealnamed;
    }

    public void setNeedBuyerRealnamed(String needBuyerRealnamed) {
        this.needBuyerRealnamed = needBuyerRealnamed;
    }

    /**
     * 账务备注
     * 注：该字段显示在离线账单的账务备注中
     * 选填
     */
    private String TRANS_MEMO;

    public String getTRANS_MEMO() {
        return TRANS_MEMO;
    }

    public void setTRANS_MEMO(String TRANS_MEMO) {
        this.TRANS_MEMO = TRANS_MEMO;
    }
}
