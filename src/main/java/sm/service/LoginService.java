package sm.service;

import javax.servlet.http.HttpSession;

public interface LoginService {
	/*
	 * �û���¼�ӿ�
	 */
	int adminLogin(HttpSession session,String account,String password);	
	/*
	 * �û�ע��ӿ�
	 */
	int adminRegist(String mobile,String code,String password);
	/*
	 * �һ�����
	 */
	int adminFind(String mobile);
	/*
	 * ��������
	 */
	int adminReset(String mobile,String password);
}
