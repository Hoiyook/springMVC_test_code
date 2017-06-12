package cn.itheima.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
/**
 * Controller必须要继承Controller接口或Controller接口的子类
 * MultiActionController:支持多个请求的Controller
 * @author ranger
 *
 */
public class HelloController extends MultiActionController  {
	/**
	 * 执行方法的格式必须为:
	 * public ModelAndView xxx(HttpServletRequest req,HttpServletResponse res)
	 * @return
	 */
	public ModelAndView say(HttpServletRequest request,HttpServletResponse response){
		//返回视图
		ModelAndView mv=new ModelAndView();
		//设置返回的视图名
		mv.setViewName("hello.jsp");
		//设置传递到视图的参数
		mv.addObject("msg", "张三");
		return mv;
	}

}
