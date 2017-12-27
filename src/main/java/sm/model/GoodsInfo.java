package sm.model;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsInfo extends BaseModel {
    private Integer goodsId;

    private String goodsName;

    private String goodsBrief;

    private String goodsSn;

    private Integer goodsBrandId;

    private String goodsSupplier;

    private Integer goodsClassifyId;

    private Integer goodsStock;

    private String goodsSku;

    private BigDecimal goodsSalePrice;

    private Double goodsCostPrice;

    private Double goodsCommission;

    private Integer goodsPresentPoint;

    private Integer goodsExchangePoint;

    private Integer goodsAdminId;

    private Integer goodsInventory;

    private Integer goodsWarn;

    private Integer goodsRecommed;

    private Integer goodsHotsale;

    private Integer goodsPutaway;

    private Integer goodsSort;

    private String goodsDesc;

    private Integer goodsCateId;

    private String goodsImageUrls;

    private Integer goodsDeliId;

    private Integer goodsDeliType;

    private String goodsRegionIds;

    private String goodsRegionNames;

    private BigDecimal goodsPercentage;

    private Integer goodsType;
    private String goodsAdminCompany;
    private String goodsBrandName;
    private Long goodsSaleCount;

    private String currentCity;

    private Date goodsTime;

    private Integer goodsNew;

    private Integer goodsSend;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief == null ? null : goodsBrief.trim();
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    public Integer getGoodsBrandId() {
        return goodsBrandId;
    }

    public void setGoodsBrandId(Integer goodsBrandId) {
        this.goodsBrandId = goodsBrandId;
    }

    public String getGoodsSupplier() {
        return goodsSupplier;
    }

    public void setGoodsSupplier(String goodsSupplier) {
        this.goodsSupplier = goodsSupplier == null ? null : goodsSupplier.trim();
    }

    public Integer getGoodsClassifyId() {
        return goodsClassifyId;
    }

    public void setGoodsClassifyId(Integer goodsClassifyId) {
        this.goodsClassifyId = goodsClassifyId;
    }

    public Integer getGoodsStock() {
        return this.goodsStock;
    }

    public void setGoodsStock(Integer goodsStock) {
        this.goodsStock = goodsStock;
    }

    public String getGoodsSku() {
        return goodsSku;
    }

    public void setGoodsSku(String goodsSku) {
        this.goodsSku = goodsSku == null ? null : goodsSku.trim();
    }

    public BigDecimal getGoodsSalePrice() {
        return goodsSalePrice;
    }

    public void setGoodsSalePrice(BigDecimal goodsSalePrice) {
        this.goodsSalePrice = goodsSalePrice;
    }

    public Double getGoodsCostPrice() {
        return goodsCostPrice;
    }

    public void setGoodsCostPrice(Double goodsCostPrice) {
        this.goodsCostPrice = goodsCostPrice;
    }

    public Double getGoodsCommission() {
        return goodsCommission;
    }

    public void setGoodsCommission(Double goodsCommission) {
        this.goodsCommission = goodsCommission;
    }

    public Integer getGoodsPresentPoint() {
        return goodsPresentPoint;
    }

    public void setGoodsPresentPoint(Integer goodsPresentPoint) {
        this.goodsPresentPoint = goodsPresentPoint;
    }

    public Integer getGoodsExchangePoint() {
        return goodsExchangePoint;
    }

    public void setGoodsExchangePoint(Integer goodsExchangePoint) {
        this.goodsExchangePoint = goodsExchangePoint;
    }

    public Integer getGoodsAdminId() {
        return goodsAdminId;
    }

    public void setGoodsAdminId(Integer goodsAdminId) {
        this.goodsAdminId = goodsAdminId;
    }

    public Integer getGoodsInventory() {
        return goodsInventory;
    }

    public void setGoodsInventory(Integer goodsInventory) {
        this.goodsInventory = goodsInventory;
    }

    public Integer getGoodsWarn() {
        return goodsWarn;
    }

    public void setGoodsWarn(Integer goodsWarn) {
        this.goodsWarn = goodsWarn;
    }

    public Integer getGoodsRecommed() {
        return goodsRecommed;
    }

    public void setGoodsRecommed(Integer goodsRecommed) {
        this.goodsRecommed = goodsRecommed;
    }

    public Integer getGoodsHotsale() {
        return goodsHotsale;
    }

    public void setGoodsHotsale(Integer goodsHotsale) {
        this.goodsHotsale = goodsHotsale;
    }

    public Integer getGoodsPutaway() {
        return goodsPutaway;
    }

    public void setGoodsPutaway(Integer goodsPutaway) {
        this.goodsPutaway = goodsPutaway;
    }

    public Integer getGoodsSort() {
        return goodsSort;
    }

    public void setGoodsSort(Integer goodsSort) {
        this.goodsSort = goodsSort;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc == null ? null : goodsDesc.trim();
    }

    public String getGoodsImageUrls() {
        return goodsImageUrls;
    }

    public void setGoodsImageUrls(String goodsImageUrls) {
        this.goodsImageUrls = goodsImageUrls;
    }

    public Integer getGoodsCateId() {
        return goodsCateId;
    }

    public void setGoodsCateId(Integer goodsCateId) {
        this.goodsCateId = goodsCateId;
    }

    public Integer getGoodsDeliId() {
        return goodsDeliId;
    }

    public void setGoodsDeliId(Integer goodsDeliId) {
        this.goodsDeliId = goodsDeliId;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getGoodsDeliType() {
        return goodsDeliType;
    }

    public void setGoodsDeliType(Integer goodsDeliType) {
        this.goodsDeliType = goodsDeliType;
    }

    public String getGoodsAdminCompany() {
        return goodsAdminCompany;
    }

    public void setGoodsAdminCompany(String goodsAdminCompany) {
        this.goodsAdminCompany = goodsAdminCompany;
    }

    public String getGoodsBrandName() {
        return goodsBrandName;
    }

    public void setGoodsBrandName(String goodsBrandName) {
        this.goodsBrandName = goodsBrandName;
    }

    public Long getGoodsSaleCount() {
        return goodsSaleCount;
    }

    public void setGoodsSaleCount(Long goodsSaleCount) {
        this.goodsSaleCount = goodsSaleCount;
    }

    public String getGoodsRegionIds() {
        return goodsRegionIds;
    }

    public void setGoodsRegionIds(String goodsRegionIds) {
        this.goodsRegionIds = goodsRegionIds;
    }

    public BigDecimal getGoodsPercentage() {
        return goodsPercentage;
    }

    public void setGoodsPercentage(BigDecimal goodsPercentage) {
        this.goodsPercentage = goodsPercentage;
    }

    public String getGoodsRegionNames() {
        return goodsRegionNames;
    }

    public void setGoodsRegionNames(String goodsRegionNames) {
        this.goodsRegionNames = goodsRegionNames;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public Date getGoodsTime() {
        return goodsTime;
    }

    public void setGoodsTime(Date goodsTime) {
        this.goodsTime = goodsTime;
    }

    public Integer getGoodsNew() {
        return goodsNew;
    }

    public void setGoodsNew(Integer goodsNew) {
        this.goodsNew = goodsNew;
    }

    public Integer getGoodsSend() {
        return goodsSend;
    }

    public void setGoodsSend(Integer goodsSend) {
        this.goodsSend = goodsSend;
    }
}