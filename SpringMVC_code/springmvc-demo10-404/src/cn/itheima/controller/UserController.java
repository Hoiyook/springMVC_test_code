package cn.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller

public class UserController {
	/**
	 * ��ʾ�����б������username, password
	 * !id,��ʾ���벻�ܰ���id�������
	 * @return
	 */
	@RequestMapping(value="login",params={"username","password","!id"})
	public String login(){
		System.out.println("-�û���¼-");
		return "/user.jsp";
	}
	
	/**
	 * username=1,��ʾusername��ֵ����Ϊ1
	 * !id,��ʾ���벻�ܰ���id�������
	 * password!=abc":��ʾ���벻�ܵ���abc
	 * @return
	 */
	@RequestMapping(value="login1",params={"username=1","password!=abc","!id"})
	public String login1(){
		System.out.println("-�û���¼1-");
		return "/user.jsp";
	}

}
