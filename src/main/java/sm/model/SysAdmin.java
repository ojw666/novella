package sm.model;

public class SysAdmin extends BaseModel{
    private Integer adminId;

    private String adminName;

    private String adminPwd;

    private String adminAvatar;

    private String adminAccount;

    private Integer adminRoleId;

    private Integer adminRegionId;

    private Integer adminRegionPid;

    private String adminMobile;

    private String adminCompanyName;

    private Integer adminCompanyStatus;

    private Integer adminStatus;

    private Integer adminActive;

    private String adminNickname;

    private String adminRoleName;

    private String adminRegionName;

    private String adminRealName;

    private Integer adminRealStatus;

    private String adminIdCard;

    private Integer adminPid;

    private Integer adminRegionLevel;

    private Integer adminIsChild;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd == null ? null : adminPwd.trim();
    }

    public String getAdminAvatar() {
        return adminAvatar;
    }

    public void setAdminAvatar(String adminAvatar) {
        this.adminAvatar = adminAvatar == null ? null : adminAvatar.trim();
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
    }

    public Integer getAdminRoleId() {
        return adminRoleId;
    }

    public void setAdminRoleId(Integer adminRoleId) {
        this.adminRoleId = adminRoleId;
    }

    public Integer getAdminRegionId() {
        return adminRegionId;
    }

    public void setAdminRegionId(Integer adminRegionId) {
        this.adminRegionId = adminRegionId;
    }

    public String getAdminMobile() {
        return adminMobile;
    }

    public void setAdminMobile(String adminMobile) {
        this.adminMobile = adminMobile == null ? null : adminMobile.trim();
    }

    public String getAdminCompanyName() {
        return adminCompanyName;
    }

    public void setAdminCompanyName(String adminCompanyName) {
        this.adminCompanyName = adminCompanyName == null ? null : adminCompanyName.trim();
    }

    public Integer getAdminCompanyStatus() {
        return adminCompanyStatus;
    }

    public void setAdminCompanyStatus(Integer adminCompanyStatus) {
        this.adminCompanyStatus = adminCompanyStatus;
    }

    public Integer getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Integer adminStatus) {
        this.adminStatus = adminStatus;
    }

    public Integer getAdminActive() {
        return adminActive;
    }

    public void setAdminActive(Integer adminActive) {
        this.adminActive = adminActive;
    }

    public String getAdminNickname() {
        return adminNickname;
    }

    public void setAdminNickname(String adminNickname) {
        this.adminNickname = adminNickname == null ? null : adminNickname.trim();
    }

    public String getAdminRegionName() {
        return adminRegionName;
    }

    public void setAdminRegionName(String adminRegionName) {
        this.adminRegionName = adminRegionName;
    }

    public String getAdminRoleName() {
        return adminRoleName;
    }

    public void setAdminRoleName(String adminRoleName) {
        this.adminRoleName = adminRoleName;
    }

    public String getAdminIdCard() {
        return adminIdCard;
    }

    public void setAdminIdCard(String adminIdCard) {
        this.adminIdCard = adminIdCard;
    }

    public String getAdminRealName() {
        return adminRealName;
    }

    public void setAdminRealName(String adminRealName) {
        this.adminRealName = adminRealName;
    }

    public Integer getAdminRealStatus() {
        return adminRealStatus;
    }

    public void setAdminRealStatus(Integer adminRealStatus) {
        this.adminRealStatus = adminRealStatus;
    }

    public Integer getAdminPid() {
        return adminPid;
    }

    public void setAdminPid(Integer adminPid) {
        this.adminPid = adminPid;
    }

    public Integer getAdminRegionPid() {
        return adminRegionPid;
    }

    public void setAdminRegionPid(Integer adminRegionPid) {
        this.adminRegionPid = adminRegionPid;
    }

    public Integer getAdminRegionLevel() {
        return adminRegionLevel;
    }

    public void setAdminRegionLevel(Integer adminRegionLevel) {
        this.adminRegionLevel = adminRegionLevel;
    }

    public Integer getAdminIsChild() {
        return adminIsChild;
    }

    public void setAdminIsChild(Integer adminIsChild) {
        this.adminIsChild = adminIsChild;
    }
}