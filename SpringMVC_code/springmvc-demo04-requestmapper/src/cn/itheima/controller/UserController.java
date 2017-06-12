package cn.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller

public class UserController {
	/**
	 * 表示请求中必须包括username, password
	 * !id,表示必须不能包括id这个参数
	 * @return
	 */
	@RequestMapping(value="login",params={"username","password","!id"})
	public String login(){
		System.out.println("-用户登录-");
		return "/user.jsp";
	}
	
	/**
	 * username=1,表示username的值必须为1
	 * !id,表示必须不能包括id这个参数
	 * password!=abc":表示密码不能等于abc
	 * @return
	 */
	@RequestMapping(value="login1",params={"username=1","password!=abc","!id"})
	public String login1(){
		System.out.println("-用户登录1-");
		return "/user.jsp";
	}

}
