package sm.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginMethodInterceptor extends HandlerInterceptorAdapter{
	public LoginMethodInterceptor() {
    }
	
	 public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		 
	 }
	 public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		 //��ȡ�����url
		
		 String url = request.getRequestURI();
		 //�ж�url�Ƿ��ǹ�����ַ
		 if(url.indexOf("login")>=0) {
			 //������е������,����
			 return true;
		 }
		 /*
		  * apiͨ��
		  */
		 if(url.startsWith("/sub")) {
			 //������е������,����
			 return true;
		 }
		 //�ж�session
		 HttpSession session = request.getSession();
		//��session��ȡ���û�����Ϣ 
		 String username = (String) session.getAttribute("username");
		 if(username != null) {
			 //��ݴ���,����
			 return true;
		 }
		//ִ�������ʾ�û������Ҫ��֤����ת����¼����  
		 request.getRequestDispatcher("/sub/login").forward(request, response);
		//return false��ʾ���أ�������ִ��  
		
		 return false;
	 }
	 
	 public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		 
	 }
}
