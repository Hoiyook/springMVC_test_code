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
	 * ����:ǰ̨�����͹����Ĳ��Ǳ�����,��һ��AJAX+JSON������.
	 * ע��:SpringMVC��ʹ��@RequestBody�����������JSON��
	 * @param user
	 * @return
	 */
	@RequestMapping(value="login")
	//Ĭ�������,ִ�з������ص���·��,ʹ��@ResponseBody��ʾ���ص�����������.����return��ֵ.
	//������õĶ�JSON֧�ֵ�Jackson��,SpringMVC���Զ���Java����ת�ɣʣӣϣζ���
	@ResponseBody
	public Object login(@RequestBody User user){
		System.out.println("-�û���¼-");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println("----------------------------");
		//��Java���󷵻�.��ת��JSON����
		return user;
		
	}
	
	@RequestMapping(value="login1")
	//Ĭ�������,ִ�з������ص���·��,ʹ��@ResponseBody��ʾ���ص�����������.����return��ֵ.
	//������õĶ�JSON֧�ֵ�Jackson��,SpringMVC���Զ���Java����ת�ɣʣӣϣζ���
	@ResponseBody
	public Object login1(@RequestBody User user){
		Map<String,Object> entity=new HashMap<>();
		System.out.println("-�û���¼1-");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println("----------------------------");
		//��Java���󷵻�.��ת��JSON����
		entity.put("username", user.getUsername());
		entity.put("password", user.getPassword());
		entity.put("age", user.getAge());
		return entity;
		
	}
	
	@RequestMapping(value="login2")
	//Ĭ�������,ִ�з������ص���·��,ʹ��@ResponseBody��ʾ���ص�����������.����return��ֵ.
	//������õĶ�JSON֧�ֵ�Jackson��,SpringMVC���Զ���Java����ת�ɣʣӣϣζ���
	@ResponseBody
	public Object login2(@RequestBody User user){
		//Map<String,Object> datMap=new HashMap<>();
		List<User> users=new ArrayList<>();
		System.out.println("-�û���¼2-");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println("----------------------------");
		//��Java���󷵻�.��ת��JSON����
		users.add(user);
		users.add(user);
		//datMap.put("users", users);
		return users;
		
	}



}
