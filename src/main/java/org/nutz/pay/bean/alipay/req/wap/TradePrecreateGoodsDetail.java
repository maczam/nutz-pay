package org.nutz.pay.bean.alipay.req.wap;

/**
 * Created by Jianghao on 2017/4/21
 *
 * @howechiang
 */
public class TradePrecreateGoodsDetail {

    /**
     * 商品的编号
     * 必填
     */
    private String goods_id;

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    /**
     * 支付宝定义的统一商品编号
     * 选填
     */
    private String alipay_goods_id;

    public String getAlipay_goods_id() {
        return alipay_goods_id;
    }

    public void setAlipay_goods_id(String alipay_goods_id) {
        this.alipay_goods_id = alipay_goods_id;
    }

    /**
     * 商品名称
     * 必填
     */
    private String goods_name;

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    /**
     * 商品数量
     * 必填
     */
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 商品单价，单位为元
     * 必填
     */
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 商品类目
     * 选填
     */
    private String goods_category;

    public String getGoods_category() {
        return goods_category;
    }

    public void setGoods_category(String goods_category) {
        this.goods_category = goods_category;
    }

    /**
     * 商品描述信息
     * 选填
     */
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 商品的展示地址
     * 选填
     */
    private String show_url;

    public String getShow_url() {
        return show_url;
    }

    public void setShow_url(String show_url) {
        this.show_url = show_url;
    }
}
