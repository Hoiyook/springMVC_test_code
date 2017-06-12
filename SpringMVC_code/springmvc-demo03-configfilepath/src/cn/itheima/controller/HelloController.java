package cn.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController  {

	@RequestMapping(value="/say.mvc")
	public String say(Model model){
		System.out.println("-say-");
		//返回视图
		model.addAttribute("msg", "张三");
		return "hello.jsp";
	}
	
	@RequestMapping(value="/say1.mvc")
	public ModelAndView say1(){
		System.out.println("-say-");
		ModelAndView mv=new ModelAndView();
		//返回视图
		mv.setViewName("hello.jsp");
		mv.addObject("msg", "李四");
		return mv;
	}

}
