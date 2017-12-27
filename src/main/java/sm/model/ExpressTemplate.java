package sm.model;

public class ExpressTemplate extends BaseModel {
    private Integer expId;

    private String expName;

    private Integer expType;

    private Integer expDefault;

    private String expContent;

    private Integer expAdminId;

    public Integer getExpId() {
        return expId;
    }

    public void setExpId(Integer expId) {
        this.expId = expId;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName == null ? null : expName.trim();
    }

    public Integer getExpType() {
        return expType;
    }

    public void setExpType(Integer expType) {
        this.expType = expType;
    }

    public Integer getExpDefault() {
        return expDefault;
    }

    public void setExpDefault(Integer expDefault) {
        this.expDefault = expDefault;
    }

    public String getExpContent() {
        return expContent;
    }

    public void setExpContent(String expContent) {
        this.expContent = expContent == null ? null : expContent.trim();
    }

    public Integer getExpAdminId() {
        return expAdminId;
    }

    public void setExpAdminId(Integer expAdminId) {
        this.expAdminId = expAdminId;
    }
}