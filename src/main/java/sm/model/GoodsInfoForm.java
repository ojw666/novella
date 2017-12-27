package sm.model;

import java.math.BigDecimal;

/**
 * Created by YangKang on 2017/8/26.
 */
public class GoodsInfoForm extends GoodsInfo {

   /* private List<GoodsStdAttr> attrList;

    private List<GoodsStdSpec> specList;

    private List<CouponManagement> couponList;

    private List<SysArea> regionIdsList;*/

    private String serviceRegionIds;

    private BigDecimal goodCommentPercent;

    public BigDecimal getGoodCommentPercent() {
        return goodCommentPercent;
    }

    public void setGoodCommentPercent(BigDecimal goodCommentPercent) {
        this.goodCommentPercent = goodCommentPercent;
    }

   /* public List<GoodsStdAttr> getAttrList() {
        return attrList;
    }

    public void setAttrList(List<GoodsStdAttr> attrList) {
        this.attrList = attrList;
    }

    public List<GoodsStdSpec> getSpecList() {
        return specList;
    }

    public void setSpecList(List<GoodsStdSpec> specList) {
        this.specList = specList;
    }

    public List<CouponManagement> getCouponList() {
        return couponList;
    }

    public void setCouponList(List<CouponManagement> couponList) {
        this.couponList = couponList;
    }

    public List<SysArea> getRegionIdsList() {
        return regionIdsList;
    }

    public void setRegionIdsList(List<SysArea> regionIdsList) {
        this.regionIdsList = regionIdsList;
    }*/

    public String getServiceRegionIds() {
        return serviceRegionIds;
    }

    public void setServiceRegionIds(String serviceRegionIds) {
        this.serviceRegionIds = serviceRegionIds;
    }
}
