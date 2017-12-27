package sm.dao;

import org.apache.ibatis.annotations.Param;

import sm.model.UserInf;

public interface LoginMapper {
	//登录用户
	UserInf getRoleName(@Param("username") String u);
	//注册用户
	UserInf getRoleMobile(@Param("mobile") String mobile);
	
	void insertRole(UserInf u);
	//重置密码
	void updateRolePassword(UserInf u);
}
