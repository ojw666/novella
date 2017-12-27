package sm.model;

public class SysRoleMenu {
    private Integer roleMenuId;

    private Integer roleId;

    private Integer menuId;

    private Integer permission;

    private Integer roleDeleteStatus;

    public Integer getRoleMenuId() {
        return roleMenuId;
    }

    public void setRoleMenuId(Integer roleMenuId) {
        this.roleMenuId = roleMenuId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public Integer getRoleDeleteStatus() {
        return roleDeleteStatus;
    }

    public void setRoleDeleteStatus(Integer roleDeleteStatus) {
        this.roleDeleteStatus = roleDeleteStatus;
    }
}