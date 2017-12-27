package sm.model;

public class ShippingAddress {
    private Integer shipId;

    private Integer shipRegionId;

    private String shipAddress;

    private String shipReceiver;

    private String shipPhone;

    private String shipName;

    private Integer shipUid;

    private Integer shipDefault;

    private Integer shipDeleteStatus;

    private String shipRegionName;

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public Integer getShipRegionId() {
        return shipRegionId;
    }

    public void setShipRegionId(Integer shipRegionId) {
        this.shipRegionId = shipRegionId;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress == null ? null : shipAddress.trim();
    }

    public String getShipReceiver() {
        return shipReceiver;
    }

    public void setShipReceiver(String shipReceiver) {
        this.shipReceiver = shipReceiver == null ? null : shipReceiver.trim();
    }

    public String getShipPhone() {
        return shipPhone;
    }

    public void setShipPhone(String shipPhone) {
        this.shipPhone = shipPhone == null ? null : shipPhone.trim();
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    public Integer getShipUid() {
        return shipUid;
    }

    public void setShipUid(Integer shipUid) {
        this.shipUid = shipUid;
    }

    public Integer getShipDefault() {
        return shipDefault;
    }

    public void setShipDefault(Integer shipDefault) {
        this.shipDefault = shipDefault;
    }

    public Integer getShipDeleteStatus() {
        return shipDeleteStatus;
    }

    public void setShipDeleteStatus(Integer shipDeleteStatus) {
        this.shipDeleteStatus = shipDeleteStatus;
    }

    public String getShipRegionName() {
        return shipRegionName;
    }

    public void setShipRegionName(String shipRegionName) {
        this.shipRegionName = shipRegionName;
    }
}