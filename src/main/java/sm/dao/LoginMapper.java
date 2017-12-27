package sm.dao;

import org.apache.ibatis.annotations.Param;

import sm.model.UserInf;

public interface LoginMapper {
	//��¼�û�
	UserInf getRoleName(@Param("username") String u);
	//ע���û�
	UserInf getRoleMobile(@Param("mobile") String mobile);
	
	void insertRole(UserInf u);
	//��������
	void updateRolePassword(UserInf u);
}
