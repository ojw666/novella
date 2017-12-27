package sm.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderList extends BaseModel {
    private Integer orderId;

    private Long orderNo;

    private Date orderTradeTime;

    private Integer orderQuantity;

    private BigDecimal orderCouponPrice;

    private Integer orderUid;

    private Integer orderUidAdmin;

    private BigDecimal orderActualPrice;

    private BigDecimal orderDivide;

    private Integer orderRegionId;

    private String orderAddress;

    private Integer orderStatus;

    private BigDecimal orderPostagePrice;

    private String orderShipReceiver;

    private String orderShipPhone;

    private String orderRemark;

    private BigDecimal orderTotalPrice;

    private String orderRegionName;

    private String orderTradeNo;

    private String orderPrepayId;

    private Date orderQueryStartTime;

    private Date orderQueryEndTime;

    private String orderPayerAccount;

    private String orderShipCompany;

    private String orderShipNo;

    private Date orderUrgentTime;

    private String orderSalerRemark;

    private String orderRefundReason;

    private Integer orderRefundStatus;

    private Date orderPayTime;

    private Date orderShipTime;

    private Date orderRefundTime;

    private Date orderReceiveTime;

    private String time;

    private String keyword;

    private Integer orderType;

    private Integer orderDeliType;

    private Integer orderExtendedStatus;

    private String orderUserNickname;

    private BigDecimal orderTotal;

    private Integer orderNums;

    private Integer userCouponId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Date getOrderTradeTime() {
        return orderTradeTime;
    }

    public void setOrderTradeTime(Date orderTradeTime) {
        this.orderTradeTime = orderTradeTime;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public BigDecimal getOrderCouponPrice() {
        return orderCouponPrice;
    }

    public void setOrderCouponPrice(BigDecimal orderCouponPrice) {
        this.orderCouponPrice = orderCouponPrice;
    }

    public Integer getOrderUid() {
        return orderUid;
    }

    public void setOrderUid(Integer orderUid) {
        this.orderUid = orderUid;
    }

    public Integer getOrderUidAdmin() {
        return orderUidAdmin;
    }

    public void setOrderUidAdmin(Integer orderUidAdmin) {
        this.orderUidAdmin = orderUidAdmin;
    }

    public BigDecimal getOrderActualPrice() {
        return orderActualPrice;
    }

    public void setOrderActualPrice(BigDecimal orderActualPrice) {
        this.orderActualPrice = orderActualPrice;
    }

    public BigDecimal getOrderDivide() {
        return orderDivide;
    }

    public void setOrderDivide(BigDecimal orderDivide) {
        this.orderDivide = orderDivide;
    }

    public Integer getOrderRegionId() {
        return orderRegionId;
    }

    public void setOrderRegionId(Integer orderRegionId) {
        this.orderRegionId = orderRegionId;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress == null ? null : orderAddress.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getOrderPostagePrice() {
        return orderPostagePrice;
    }

    public void setOrderPostagePrice(BigDecimal orderPostagePrice) {
        this.orderPostagePrice = orderPostagePrice;
    }

    public String getOrderShipReceiver() {
        return orderShipReceiver;
    }

    public void setOrderShipReceiver(String orderShipReceiver) {
        this.orderShipReceiver = orderShipReceiver == null ? null : orderShipReceiver.trim();
    }

    public String getOrderShipPhone() {
        return orderShipPhone;
    }

    public void setOrderShipPhone(String orderShipPhone) {
        this.orderShipPhone = orderShipPhone == null ? null : orderShipPhone.trim();
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    public BigDecimal getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(BigDecimal orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public String getOrderRegionName() {
        return orderRegionName;
    }

    public void setOrderRegionName(String orderRegionName) {
        this.orderRegionName = orderRegionName;
    }

    public String getOrderTradeNo() {
        return orderTradeNo;
    }

    public void setOrderTradeNo(String orderTradeNo) {
        this.orderTradeNo = orderTradeNo;
    }

    public Date getOrderQueryEndTime() {
        return orderQueryEndTime;
    }

    public void setOrderQueryEndTime(Date orderQueryEndTime) {
        this.orderQueryEndTime = orderQueryEndTime;
    }

    public Date getOrderQueryStartTime() {
        return orderQueryStartTime;
    }

    public void setOrderQueryStartTime(Date orderQueryStartTime) {
        this.orderQueryStartTime = orderQueryStartTime;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }


    public String getOrderPrepayId() {
        return orderPrepayId;
    }

    public void setOrderPrepayId(String orderPrepayId) {
        this.orderPrepayId = orderPrepayId == null ? null : orderPrepayId.trim();
    }

    public String getOrderPayerAccount() {
        return orderPayerAccount;
    }

    public void setOrderPayerAccount(String orderPayerAccount) {
        this.orderPayerAccount = orderPayerAccount == null ? null : orderPayerAccount.trim();
    }

    public String getOrderShipCompany() {
        return orderShipCompany;
    }

    public void setOrderShipCompany(String orderShipCompany) {
        this.orderShipCompany = orderShipCompany == null ? null : orderShipCompany.trim();
    }

    public String getOrderShipNo() {
        return orderShipNo;
    }

    public void setOrderShipNo(String orderShipNo) {
        this.orderShipNo = orderShipNo == null ? null : orderShipNo.trim();
    }

    public Date getOrderUrgentTime() {
        return orderUrgentTime;
    }

    public void setOrderUrgentTime(Date orderUrgentTime) {
        this.orderUrgentTime = orderUrgentTime;
    }

    public String getOrderSalerRemark() {
        return orderSalerRemark;
    }

    public void setOrderSalerRemark(String orderSalerRemark) {
        this.orderSalerRemark = orderSalerRemark == null ? null : orderSalerRemark.trim();
    }

    public String getOrderRefundReason() {
        return orderRefundReason;
    }

    public void setOrderRefundReason(String orderRefundReason) {
        this.orderRefundReason = orderRefundReason == null ? null : orderRefundReason.trim();
    }

    public Integer getOrderRefundStatus() {
        return orderRefundStatus;
    }

    public void setOrderRefundStatus(Integer orderRefundStatus) {
        this.orderRefundStatus = orderRefundStatus;
    }

    public Date getOrderPayTime() {
        return orderPayTime;
    }

    public void setOrderPayTime(Date orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    public Date getOrderShipTime() {
        return orderShipTime;
    }

    public void setOrderShipTime(Date orderShipTime) {
        this.orderShipTime = orderShipTime;
    }

    public Date getOrderRefundTime() {
        return orderRefundTime;
    }

    public void setOrderRefundTime(Date orderRefundTime) {
        this.orderRefundTime = orderRefundTime;
    }

    public Date getOrderReceiveTime() {
        return orderReceiveTime;
    }

    public void setOrderReceiveTime(Date orderReceiveTime) {
        this.orderReceiveTime = orderReceiveTime;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderDeliType() {
        return orderDeliType;
    }

    public void setOrderDeliType(Integer orderDeliType) {
        this.orderDeliType = orderDeliType;
    }

    public String getOrderUserNickname() {
        return orderUserNickname;
    }

    public void setOrderUserNickname(String orderUserNickname) {
        this.orderUserNickname = orderUserNickname;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Integer getOrderNums() {
        return orderNums;
    }

    public void setOrderNums(Integer orderNums) {
        this.orderNums = orderNums;
    }


    public Integer getOrderExtendedStatus() {
        return orderExtendedStatus;
    }

    public void setOrderExtendedStatus(Integer orderExtendedStatus) {
        this.orderExtendedStatus = orderExtendedStatus;
    }

    public Integer getUserCouponId() {
        return userCouponId;
    }

    public void setUserCouponId(Integer userCouponId) {
        this.userCouponId = userCouponId;
    }
}