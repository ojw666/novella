package sm.model;

import java.io.Serializable;
import java.util.Date;

public class SysMenu implements Serializable{
    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer menuOrderFlag;

    private Date menuCreateDate;

    private Date menuUpdateDate;

    private Integer menuDeleteStatus;

    private String menuDesc;

    private Integer menuType;

    private Integer menuOperValue;

    private Integer menuPid;

    private String menuParentName;

    private Integer menuPriviStatus;

    private String menuIcon;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public Integer getMenuOrderFlag() {
        return menuOrderFlag;
    }

    public void setMenuOrderFlag(Integer menuOrderFlag) {
        this.menuOrderFlag = menuOrderFlag;
    }

    public Date getMenuCreateDate() {
        return menuCreateDate;
    }

    public void setMenuCreateDate(Date menuCreateDate) {
        this.menuCreateDate = menuCreateDate;
    }

    public Date getMenuUpdateDate() {
        return menuUpdateDate;
    }

    public void setMenuUpdateDate(Date menuUpdateDate) {
        this.menuUpdateDate = menuUpdateDate;
    }

    public Integer getMenuDeleteStatus() {
        return menuDeleteStatus;
    }

    public void setMenuDeleteStatus(Integer menuDeleteStatus) {
        this.menuDeleteStatus = menuDeleteStatus;
    }


    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc == null ? null : menuDesc.trim();
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public Integer getMenuOperValue() {
        return menuOperValue;
    }

    public void setMenuOperValue(Integer menuOperValue) {
        this.menuOperValue = menuOperValue;
    }

    public Integer getMenuPid() {
        return menuPid;
    }

    public void setMenuPid(Integer menuPid) {
        this.menuPid = menuPid;
    }

    public String getMenuParentName() {
        return menuParentName;
    }

    public void setMenuParentName(String menuParentName) {
        this.menuParentName = menuParentName;
    }

    public void setMenuPriviStatus(Integer menuPriviStatus) {
        this.menuPriviStatus = menuPriviStatus;
    }

    public Integer getMenuPriviStatus() {
        return menuPriviStatus;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    @Override
    public String toString() {
        return "SysMenu{" +
                "menuCreateDate=" + menuCreateDate +
                ", menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", menuOrderFlag=" + menuOrderFlag +
                ", menuUpdateDate=" + menuUpdateDate +
                ", menuDeleteStatus=" + menuDeleteStatus +
                ", menuDesc='" + menuDesc + '\'' +
                ", menuType=" + menuType +
                ", menuOperValue=" + menuOperValue +
                ", menuPid=" + menuPid +
                '}';
    }
}