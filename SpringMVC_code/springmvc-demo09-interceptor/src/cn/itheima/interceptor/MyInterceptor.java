package cn.itheima.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器必须实现接口HandlerInterceptor
 * @author ranger
 *
 */
public class MyInterceptor implements HandlerInterceptor {

	/**
	 * 方法完成后拦截
	 * 不过方法有没有执行完都要结束,我们将这个方法的结束称为方法完成.
	 * 这个方法不管出不出异常都执行
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object value, Exception ex)
			throws Exception {
		if(ex!=null){
			System.out.println("请求的路径:"+request.getRequestURL());
			System.out.println("执行的方法:"+value);
			// TODO Auto-generated method stub
			System.out.println("-方法完成后拦截-");
		}
		
	}

	/**
	 * 表示方法执行后拦截
	 * 如果一个方法出现了异常,我们认为这个方法时没有执行完成的.
	 * 所以这个方法出了异常时不执行.
	 * 
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object value, ModelAndView mv)
			throws Exception {
		System.out.println(value);
		// TODO Auto-generated method stub
		System.out.println("-表示方法执行后拦截-");
		
	}

	/**
	 * 表示方法执行前拦截
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object value) throws Exception {
		System.out.println(value);
		// TODO Auto-generated method stub
		System.out.println("-表示方法执行前拦截-");
		//开关,如果为false表示不执行postHandle,afterCompletion
		return true;
	}

}
