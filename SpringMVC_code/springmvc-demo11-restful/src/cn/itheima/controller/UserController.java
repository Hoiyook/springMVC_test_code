package cn.itheima.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.itheima.pojo.User;

@Controller
public class UserController {


	/**
	 * 增加
	 * @param user
	 * @return
	 */
	@RequestMapping(value="insert" ,method=RequestMethod.POST)
	public ResponseEntity<User> insert(@RequestBody User user){
		System.out.println("-增加-");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println("----------------------------");
		//将Java对象返回.并转成JSON对象
		//ok200,ResponseEntity.ok(user)
		//返回404,不返回数据
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}
	
	/**
	 * 删除
	 * @param user
	 * @return
	 */
	@RequestMapping(value="delete" ,method=RequestMethod.DELETE)
	public ResponseEntity<User> delete( User user){
		System.out.println("-删除-");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println("----------------------------");
		//将Java对象返回.并转成JSON对象
		return ResponseEntity.ok(user);
	}
	
	/**
	 * 更新
	 * @param user
	 * @return
	 */
	@RequestMapping(value="update" ,method=RequestMethod.PUT)
	public ResponseEntity<Void> update( User user){
		System.out.println("-修改-");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println("----------------------------");
		//将Java对象返回.并转成JSON对象
		return ResponseEntity.ok(null);
	}
	
	/**
	 * 查询
	 * @param user
	 * @return
	 */
	@RequestMapping(value="get" ,method=RequestMethod.GET)
	public ResponseEntity<User> get( User user){
		System.out.println("-查询-");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}
	

	




}
