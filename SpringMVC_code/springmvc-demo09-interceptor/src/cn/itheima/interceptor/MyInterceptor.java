package cn.itheima.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * ����������ʵ�ֽӿ�HandlerInterceptor
 * @author ranger
 *
 */
public class MyInterceptor implements HandlerInterceptor {

	/**
	 * ������ɺ�����
	 * ����������û��ִ���궼Ҫ����,���ǽ���������Ľ�����Ϊ�������.
	 * ����������ܳ������쳣��ִ��
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object value, Exception ex)
			throws Exception {
		if(ex!=null){
			System.out.println("�����·��:"+request.getRequestURL());
			System.out.println("ִ�еķ���:"+value);
			// TODO Auto-generated method stub
			System.out.println("-������ɺ�����-");
		}
		
	}

	/**
	 * ��ʾ����ִ�к�����
	 * ���һ�������������쳣,������Ϊ�������ʱû��ִ����ɵ�.
	 * ����������������쳣ʱ��ִ��.
	 * 
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object value, ModelAndView mv)
			throws Exception {
		System.out.println(value);
		// TODO Auto-generated method stub
		System.out.println("-��ʾ����ִ�к�����-");
		
	}

	/**
	 * ��ʾ����ִ��ǰ����
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object value) throws Exception {
		System.out.println(value);
		// TODO Auto-generated method stub
		System.out.println("-��ʾ����ִ��ǰ����-");
		//����,���Ϊfalse��ʾ��ִ��postHandle,afterCompletion
		return true;
	}

}
