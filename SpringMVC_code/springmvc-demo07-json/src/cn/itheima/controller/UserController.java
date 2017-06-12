package cn.itheima.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itheima.pojo.User;

@Controller
public class UserController {

	/**
	 * 需求:前台请求发送过来的不是表单请求,是一个AJAX+JSON的请求.
	 * 注意:SpringMVC是使用@RequestBody绑定请求过来的JSON的
	 * @param user
	 * @return
	 */
	@RequestMapping(value="login")
	//默认情况下,执行方法返回的是路径,使用@ResponseBody表示返回的是内容主体.就是return的值.
	//如果配置的对JSON支持的Jackson包,SpringMVC会自动将Java对象转成ＪＳＯＮ对象
	@ResponseBody
	public Object login(@RequestBody User user){
		System.out.println("-用户登录-");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println("----------------------------");
		//将Java对象返回.并转成JSON对象
		return user;
		
	}
	
	@RequestMapping(value="login1")
	//默认情况下,执行方法返回的是路径,使用@ResponseBody表示返回的是内容主体.就是return的值.
	//如果配置的对JSON支持的Jackson包,SpringMVC会自动将Java对象转成ＪＳＯＮ对象
	@ResponseBody
	public Object login1(@RequestBody User user){
		Map<String,Object> entity=new HashMap<>();
		System.out.println("-用户登录1-");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println("----------------------------");
		//将Java对象返回.并转成JSON对象
		entity.put("username", user.getUsername());
		entity.put("password", user.getPassword());
		entity.put("age", user.getAge());
		return entity;
		
	}
	
	@RequestMapping(value="login2")
	//默认情况下,执行方法返回的是路径,使用@ResponseBody表示返回的是内容主体.就是return的值.
	//如果配置的对JSON支持的Jackson包,SpringMVC会自动将Java对象转成ＪＳＯＮ对象
	@ResponseBody
	public Object login2(@RequestBody User user){
		//Map<String,Object> datMap=new HashMap<>();
		List<User> users=new ArrayList<>();
		System.out.println("-用户登录2-");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println("----------------------------");
		//将Java对象返回.并转成JSON对象
		users.add(user);
		users.add(user);
		//datMap.put("users", users);
		return users;
		
	}



}
