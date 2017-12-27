package sm.model;

import java.util.List;

/**
 * Created by YangKang on 2017/8/25.
 */
public class OrderListForm extends OrderList {

    private List<SaleList> saleList;

    private Integer orderShipId;

    private UserUserInfo userInfo;

    public List<SaleList> getSaleList() {
        return saleList;
    }

    public void setSaleList(List<SaleList> saleList) {
        this.saleList = saleList;
    }

    public Integer getOrderShipId() {
        return orderShipId;
    }

    public void setOrderShipId(Integer orderShipId) {
        this.orderShipId = orderShipId;
    }

    public UserUserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserUserInfo userInfo) {
        this.userInfo = userInfo;
    }

}
