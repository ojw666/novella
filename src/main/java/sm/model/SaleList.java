package sm.model;

import java.math.BigDecimal;
import java.util.Date;

public class SaleList extends BaseModel {
    private Integer saleId;

    private Integer saleGssId;

    private Integer saleGoodsId;

    private Integer saleQuantity;

    private BigDecimal saleCouponPrice;

    private BigDecimal salePrice;

    private BigDecimal saleActualPrice;

    private Integer saleOrderId;

    private Integer saleStatus;

    private Integer saleType;

    private Date saleServiceStartTime;

    private Date saleServiceEndTime;

    private String saleServiceAddress;

    private Integer saleServicePersonId;

    private String saleServicePersonName;

    private Date saleReceiveTime;

    private String saleCommentContent;

    private String saleCommentImages;

    private Integer saleCommentLevel;

    private Integer saleCommentDescRank;

    private Integer saleCommentDeliveryRank;

    private Integer saleCommentServiceRank;

    private Integer saleCommentStatus;

    private Integer saleVolume;

    private BigDecimal sales;

    private String saleGoodsName;

    private  Integer saleGoodsSn;

    private Integer serviceRegionId;

    private String serviceRegionName;

    private Integer firstClassifyId;
    
    private Integer thirdClassifyId;

    private Integer fourthClassifyId;

    private Integer secondClassifyId;

    private Integer saleProvince;

    private Integer saleCity;

    private Integer saleDistrict;

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getSaleGssId() {
        return saleGssId;
    }

    public void setSaleGssId(Integer saleGssId) {
        this.saleGssId = saleGssId;
    }

    public Integer getSaleGoodsId() {
        return saleGoodsId;
    }

    public void setSaleGoodsId(Integer saleGoodsId) {
        this.saleGoodsId = saleGoodsId;
    }

    public Integer getSaleQuantity() {
        return saleQuantity;
    }

    public void setSaleQuantity(Integer saleQuantity) {
        this.saleQuantity = saleQuantity;
    }

    public BigDecimal getSaleCouponPrice() {
        return saleCouponPrice;
    }

    public void setSaleCouponPrice(BigDecimal saleCouponPrice) {
        this.saleCouponPrice = saleCouponPrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getSaleActualPrice() {
        return saleActualPrice;
    }

    public void setSaleActualPrice(BigDecimal saleActualPrice) {
        this.saleActualPrice = saleActualPrice;
    }

    public Integer getSaleOrderId() {
        return saleOrderId;
    }

    public void setSaleOrderId(Integer saleOrderId) {
        this.saleOrderId = saleOrderId;
    }

    public Integer getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Integer saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Integer getSaleType() {
        return saleType;
    }

    public void setSaleType(Integer saleType) {
        this.saleType = saleType;
    }

    public String getSaleServiceAddress() {
        return saleServiceAddress;
    }

    public void setSaleServiceAddress(String saleServiceAddress) {
        this.saleServiceAddress = saleServiceAddress;
    }

    public Date getSaleServiceEndTime() {
        return saleServiceEndTime;
    }

    public void setSaleServiceEndTime(Date saleServiceEndTime) {
        this.saleServiceEndTime = saleServiceEndTime;
    }

    public Date getSaleServiceStartTime() {
        return saleServiceStartTime;
    }

    public void setSaleServiceStartTime(Date saleServiceStartTime) {
        this.saleServiceStartTime = saleServiceStartTime;
    }

    public Integer getSaleServicePersonId() {
        return saleServicePersonId;
    }

    public void setSaleServicePersonId(Integer saleServicePersonId) {
        this.saleServicePersonId = saleServicePersonId;
    }

    public String getSaleServicePersonName() {
        return saleServicePersonName;
    }

    public void setSaleServicePersonName(String saleServicePersonName) {
        this.saleServicePersonName = saleServicePersonName;
    }

    public Date getSaleReceiveTime() {
        return saleReceiveTime;
    }

    public void setSaleReceiveTime(Date saleReceiveTime) {
        this.saleReceiveTime = saleReceiveTime;
    }

    public String getSaleCommentContent() {
        return saleCommentContent;
    }

    public void setSaleCommentContent(String saleCommentContent) {
        this.saleCommentContent = saleCommentContent;
    }

    public Integer getSaleCommentDeliveryRank() {
        return saleCommentDeliveryRank;
    }

    public void setSaleCommentDeliveryRank(Integer saleCommentDeliveryRank) {
        this.saleCommentDeliveryRank = saleCommentDeliveryRank;
    }

    public Integer getSaleCommentDescRank() {
        return saleCommentDescRank;
    }

    public void setSaleCommentDescRank(Integer saleCommentDescRank) {
        this.saleCommentDescRank = saleCommentDescRank;
    }

    public String getSaleCommentImages() {
        return saleCommentImages;
    }

    public void setSaleCommentImages(String saleCommentImages) {
        this.saleCommentImages = saleCommentImages;
    }

    public Integer getSaleCommentLevel() {
        return saleCommentLevel;
    }

    public void setSaleCommentLevel(Integer saleCommentLevel) {
        this.saleCommentLevel = saleCommentLevel;
    }

    public Integer getSaleCommentServiceRank() {
        return saleCommentServiceRank;
    }

    public void setSaleCommentServiceRank(Integer saleCommentServiceRank) {
        this.saleCommentServiceRank = saleCommentServiceRank;
    }

    public Integer getSaleCommentStatus() {
        return saleCommentStatus;
    }

    public void setSaleCommentStatus(Integer saleCommentStatus) {
        this.saleCommentStatus = saleCommentStatus;
    }

    public Integer getSaleVolume() {
        return saleVolume;
    }

    public void setSaleVolume(Integer saleVolume) {
        this.saleVolume = saleVolume;
    }

    public BigDecimal getSales() {
        return sales;
    }

    public void setSales(BigDecimal sales) {
        this.sales = sales;
    }

    public String getSaleGoodsName() {
        return saleGoodsName;
    }

    public void setSaleGoodsName(String saleGoodsName) {
        this.saleGoodsName = saleGoodsName;
    }

    public Integer getSaleGoodsSn() {
        return saleGoodsSn;
    }

    public void setSaleGoodsSn(Integer saleGoodsSn) {
        this.saleGoodsSn = saleGoodsSn;
    }

    public Integer getFirstClassifyId() {
        return firstClassifyId;
    }

    public void setFirstClassifyId(Integer firstClassifyId) {
        this.firstClassifyId = firstClassifyId;
    }

    public Integer getThirdClassifyId() {
        return thirdClassifyId;
    }

    public void setThirdClassifyId(Integer thirdClassifyId) {
        this.thirdClassifyId = thirdClassifyId;
    }

    public Integer getFourthClassifyId() {
        return fourthClassifyId;
    }

    public void setFourthClassifyId(Integer fourthClassifyId) {
        this.fourthClassifyId = fourthClassifyId;
    }

    public Integer getSecondClassifyId() {
        return secondClassifyId;
    }

    public void setSecondClassifyId(Integer secondClassifyId) {
        this.secondClassifyId = secondClassifyId;
    }

    public Integer getSaleProvince() {
        return saleProvince;
    }

    public void setSaleProvince(Integer saleProvince) {
        this.saleProvince = saleProvince;
    }

    public Integer getSaleCity() {
        return saleCity;
    }

    public void setSaleCity(Integer saleCity) {
        this.saleCity = saleCity;
    }

    public Integer getSaleDistrict() {
        return saleDistrict;
    }

    public void setSaleDistrict(Integer saleDistrict) {
        this.saleDistrict = saleDistrict;
    }

    public Integer getServiceRegionId() {
        return serviceRegionId;
    }

    public void setServiceRegionId(Integer serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
    }

    public String getServiceRegionName() {
        return serviceRegionName;
    }

    public void setServiceRegionName(String serviceRegionName) {
        this.serviceRegionName = serviceRegionName;
    }
}