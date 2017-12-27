package sm.model;

public class GoodsClassify extends BaseModel {
    private Integer classifyId;

    private String classifyName;

    private Integer classifyLevel;

    private Integer classifyPid;

    private Integer classifySortFlag;

    private Integer classifyEnableStatus;

    private Integer classifyShowStatus;

    private String classifyIconUrl;

    private Integer classifyFirstId;

    private Integer classifySecondId;

    private Integer classifyThirdId;

    private Integer classifyForthId;

    private String classifyBgImage;

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName == null ? null : classifyName.trim();
    }

    public Integer getClassifyLevel() {
        return classifyLevel;
    }

    public void setClassifyLevel(Integer classifyLevel) {
        this.classifyLevel = classifyLevel;
    }

    public Integer getClassifyPid() {
        return classifyPid;
    }

    public void setClassifyPid(Integer classifyPid) {
        this.classifyPid = classifyPid;
    }

    public Integer getClassifySortFlag() {
        return classifySortFlag;
    }

    public void setClassifySortFlag(Integer classifySortFlag) {
        this.classifySortFlag = classifySortFlag;
    }

    public Integer getClassifyEnableStatus() {
        return classifyEnableStatus;
    }

    public void setClassifyEnableStatus(Integer classifyEnableStatus) {
        this.classifyEnableStatus = classifyEnableStatus;
    }

    public Integer getClassifyShowStatus() {
        return classifyShowStatus;
    }

    public void setClassifyShowStatus(Integer classifyShowStatus) {
        this.classifyShowStatus = classifyShowStatus;
    }

    public String getClassifyIconUrl() {
        return classifyIconUrl;
    }

    public void setClassifyIconUrl(String classifyIconUrl) {
        this.classifyIconUrl = classifyIconUrl == null ? null : classifyIconUrl.trim();
    }

    public Integer getClassifyFirstId() {
        return classifyFirstId;
    }

    public void setClassifyFirstId(Integer classifyFirstId) {
        this.classifyFirstId = classifyFirstId;
    }

    public Integer getClassifySecondId() {
        return classifySecondId;
    }

    public void setClassifySecondId(Integer classifySecondId) {
        this.classifySecondId = classifySecondId;
    }

    public Integer getClassifyThirdId() {
        return classifyThirdId;
    }

    public void setClassifyThirdId(Integer classifyThirdId) {
        this.classifyThirdId = classifyThirdId;
    }

    public Integer getClassifyForthId() {
        return classifyForthId;
    }

    public void setClassifyForthId(Integer classifyForthId) {
        this.classifyForthId = classifyForthId;
    }

    public String getClassifyBgImage() {
        return classifyBgImage;
    }

    public void setClassifyBgImage(String classifyBgImage) {
        this.classifyBgImage = classifyBgImage;
    }
}