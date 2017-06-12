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
	 * ����
	 * @param user
	 * @return
	 */
	@RequestMapping(value="insert" ,method=RequestMethod.POST)
	public ResponseEntity<User> insert(@RequestBody User user){
		System.out.println("-����-");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println("----------------------------");
		//��Java���󷵻�.��ת��JSON����
		//ok200,ResponseEntity.ok(user)
		//����404,����������
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}
	
	/**
	 * ɾ��
	 * @param user
	 * @return
	 */
	@RequestMapping(value="delete" ,method=RequestMethod.DELETE)
	public ResponseEntity<User> delete( User user){
		System.out.println("-ɾ��-");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println("----------------------------");
		//��Java���󷵻�.��ת��JSON����
		return ResponseEntity.ok(user);
	}
	
	/**
	 * ����
	 * @param user
	 * @return
	 */
	@RequestMapping(value="update" ,method=RequestMethod.PUT)
	public ResponseEntity<Void> update( User user){
		System.out.println("-�޸�-");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println("----------------------------");
		//��Java���󷵻�.��ת��JSON����
		return ResponseEntity.ok(null);
	}
	
	/**
	 * ��ѯ
	 * @param user
	 * @return
	 */
	@RequestMapping(value="get" ,method=RequestMethod.GET)
	public ResponseEntity<User> get( User user){
		System.out.println("-��ѯ-");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}
	

	




}
