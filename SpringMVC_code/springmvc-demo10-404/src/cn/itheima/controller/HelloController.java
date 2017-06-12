package cn.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/user")
public class HelloController  {

	@RequestMapping(value="say",method={RequestMethod.GET,RequestMethod.POST})
	public String say(Model model){
		System.out.println("-say-");
		//������ͼ
		model.addAttribute("msg", "����");
		//б�ܿ�ͷ,��ʾweb��Ŀ�ĸ�Ŀ¼
		return "/hello.jsp";
	}
	
	@RequestMapping(value="/say1.mvc")
	public ModelAndView say1(){
		System.out.println("-say-");
		ModelAndView mv=new ModelAndView();
		//������ͼ
		mv.setViewName("/hello.jsp");
		mv.addObject("msg", "����");
		return mv;
	}

}
