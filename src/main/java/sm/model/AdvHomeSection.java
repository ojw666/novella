package sm.model;

public class AdvHomeSection extends BaseModel {

    private Integer ahsType;

    private Integer ahsId;

    private String ahsTitle;

    private String ahsSubtitle;

    private String ahsAdvIds;

    private Integer ahsOrderFlag;

    private Integer ahsPublishStatus;

    private Integer ahsSectionCount;

    private Integer ahsEnableStatus;

    private Integer ahsShow;

    private Integer ahsAdminId;

    private String ahsHeight;

    public Integer getAhsId() {
        return ahsId;
    }

    public void setAhsId(Integer ahsId) {
        this.ahsId = ahsId;
    }

    public String getAhsTitle() {
        return ahsTitle;
    }

    public void setAhsTitle(String ahsTitle) {
        this.ahsTitle = ahsTitle == null ? null : ahsTitle.trim();
    }

    public String getAhsSubtitle() {
        return ahsSubtitle;
    }

    public void setAhsSubtitle(String ahsSubtitle) {
        this.ahsSubtitle = ahsSubtitle == null ? null : ahsSubtitle.trim();
    }

    public String getAhsAdvIds() {
        return ahsAdvIds;
    }

    public void setAhsAdvIds(String ahsAdvIds) {
        this.ahsAdvIds = ahsAdvIds == null ? null : ahsAdvIds.trim();
    }

    public Integer getAhsOrderFlag() {
        return ahsOrderFlag;
    }

    public void setAhsOrderFlag(Integer ahsOrderFlag) {
        this.ahsOrderFlag = ahsOrderFlag;
    }

    public Integer getAhsPublishStatus() {
        return ahsPublishStatus;
    }

    public void setAhsPublishStatus(Integer ahsPublishStatus) {
        this.ahsPublishStatus = ahsPublishStatus;
    }

    public Integer getAhsSectionCount() {
        return ahsSectionCount;
    }

    public void setAhsSectionCount(Integer ahsSectionCount) {
        this.ahsSectionCount = ahsSectionCount;
    }

    public Integer getAhsEnableStatus() {
        return ahsEnableStatus;
    }

    public void setAhsEnableStatus(Integer ahsEnableStatus) {
        this.ahsEnableStatus = ahsEnableStatus;
    }

    public Integer getAhsType() {
        return ahsType;
    }

    public void setAhsType(Integer ahsType) {
        this.ahsType = ahsType;
    }

    public Integer getAhsShow() {
        return ahsShow;
    }

    public void setAhsShow(Integer ahsShow) {
        this.ahsShow = ahsShow;
    }

    public Integer getAhsAdminId() {
        return ahsAdminId;
    }

    public void setAhsAdminId(Integer ahsDeliId) {
        this.ahsAdminId = ahsDeliId;
    }


    public String getAhsHeight() {
        return ahsHeight;
    }

    public void setAhsHeight(String ahsHeight) {
        this.ahsHeight = ahsHeight;
    }
}