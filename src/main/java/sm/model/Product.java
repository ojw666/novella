package sm.model;

import java.util.Date;

public class Product extends BaseModel{
    private Integer productId;

    private String productPic;

    private Date productTime;

    private Integer productShow;

    private Integer productGoodsId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic == null ? null : productPic.trim();
    }

    public Date getProductTime() {
        return productTime;
    }

    public void setProductTime(Date productTime) {
        this.productTime = productTime;
    }

    public Integer getProductShow() {
        return productShow;
    }

    public void setProductShow(Integer productShow) {
        this.productShow = productShow;
    }

    public Integer getProductGoodsId() {
        return productGoodsId;
    }

    public void setProductGoodsId(Integer productGoodsId) {
        this.productGoodsId = productGoodsId;
    }
}