package sm.model;

import java.util.Date;

public class SysRole extends BaseModel{
    private Integer roleId;

    private String roleName;

    private String description;

    private Integer roleFid;

    private Date roleCreateDate;

    private Short deleteFlag;

    private Date roleUpdateDate;

    private String roleOptData;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getRoleFid() {
        return roleFid;
    }

    public void setRoleFid(Integer roleFid) {
        this.roleFid = roleFid;
    }

    public Date getRoleCreateDate() {
        return roleCreateDate;
    }

    public void setRoleCreateDate(Date roleCreateDate) {
        this.roleCreateDate = roleCreateDate;
    }

    public Short getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getRoleUpdateDate() {
        return roleUpdateDate;
    }

    public void setRoleUpdateDate(Date roleUpdateDate) {
        this.roleUpdateDate = roleUpdateDate;
    }

    public String getRoleOptData() {
        return roleOptData;
    }

    public void setRoleOptData(String roleOptData) {
        this.roleOptData = roleOptData;
    }
}