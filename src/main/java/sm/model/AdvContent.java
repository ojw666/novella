package sm.model;

public class AdvContent extends BaseModel {
    private Integer advId;

    private String advImage;

    private String advUrl;

    private Integer advType;

    private Integer advDefaultStatus;

    private Integer advEnableStatus;

    private Integer advSectionId;

    private Integer advAdminId;

    private Long advClickCount;

    private String advTitle;

    private String advSubtitle;

    public Integer getAdvId() {
        return advId;
    }

    public void setAdvId(Integer advId) {
        this.advId = advId;
    }

    public String getAdvImage() {
        return advImage;
    }

    public void setAdvImage(String advImage) {
        this.advImage = advImage == null ? null : advImage.trim();
    }

    public String getAdvUrl() {
        return advUrl;
    }

    public void setAdvUrl(String advUrl) {
        this.advUrl = advUrl == null ? null : advUrl.trim();
    }

    public Integer getAdvType() {
        return advType;
    }

    public void setAdvType(Integer advType) {
        this.advType = advType;
    }

    public Integer getAdvDefaultStatus() {
        return advDefaultStatus;
    }

    public void setAdvDefaultStatus(Integer advDefaultStatus) {
        this.advDefaultStatus = advDefaultStatus;
    }

    public Integer getAdvEnableStatus() {
        return advEnableStatus;
    }

    public void setAdvEnableStatus(Integer advEnableStatus) {
        this.advEnableStatus = advEnableStatus;
    }

    public Long getAdvClickCount() {
        return advClickCount;
    }

    public void setAdvClickCount(Long advClickCount) {
        this.advClickCount = advClickCount;
    }

    public Integer getAdvSectionId() {
        return advSectionId;
    }

    public void setAdvSectionId(Integer advSectionId) {
        this.advSectionId = advSectionId;
    }

    public Integer getAdvAdminId() {
        return advAdminId;
    }

    public void setAdvAdminId(Integer advAdminId) {
        this.advAdminId = advAdminId;
    }

    public String getAdvTitle() {
        return advTitle;
    }

    public void setAdvTitle(String advTitle) {
        this.advTitle = advTitle;
    }

    public String getAdvSubtitle() {
        return advSubtitle;
    }

    public void setAdvSubtitle(String advSubtitle) {
        this.advSubtitle = advSubtitle;
    }
}