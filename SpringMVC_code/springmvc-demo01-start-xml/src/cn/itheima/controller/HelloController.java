package cn.itheima.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
/**
 * Controller����Ҫ�̳�Controller�ӿڻ�Controller�ӿڵ�����
 * MultiActionController:֧�ֶ�������Controller
 * @author ranger
 *
 */
public class HelloController extends MultiActionController  {
	/**
	 * ִ�з����ĸ�ʽ����Ϊ:
	 * public ModelAndView xxx(HttpServletRequest req,HttpServletResponse res)
	 * @return
	 */
	public ModelAndView say(HttpServletRequest request,HttpServletResponse response){
		//������ͼ
		ModelAndView mv=new ModelAndView();
		//���÷��ص���ͼ��
		mv.setViewName("hello.jsp");
		//���ô��ݵ���ͼ�Ĳ���
		mv.addObject("msg", "����");
		return mv;
	}

}
