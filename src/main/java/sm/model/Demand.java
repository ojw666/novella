package sm.model;

import java.util.Date;

public class Demand extends BaseModel{
    private Integer demandId;

    private String demandName;

    private Integer demandSex;

    private String demandPhone;

    private Date demandTime;

    private String demandContext;

    public Integer getDemandId() {
        return demandId;
    }

    public void setDemandId(Integer demandId) {
        this.demandId = demandId;
    }

    public String getDemandName() {
        return demandName;
    }

    public void setDemandName(String demandName) {
        this.demandName = demandName == null ? null : demandName.trim();
    }

    public Integer getDemandSex() {
        return demandSex;
    }

    public void setDemandSex(Integer demandSex) {
        this.demandSex = demandSex;
    }

    public String getDemandPhone() {
        return demandPhone;
    }

    public void setDemandPhone(String demandPhone) {
        this.demandPhone = demandPhone == null ? null : demandPhone.trim();
    }

    public Date getDemandTime() {
        return demandTime;
    }

    public void setDemandTime(Date demandTime) {
        this.demandTime = demandTime;
    }

    public String getDemandContext() {
        return demandContext;
    }

    public void setDemandContext(String demandContext) {
        this.demandContext = demandContext;
    }
}