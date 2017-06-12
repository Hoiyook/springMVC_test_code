package cn.itheima.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.itheima.pojo.User;
import cn.itheima.pojo.UsersModel;

@Controller
@SessionAttributes(value={"msg1"})
public class UserController {
	/**
	 * ��ʾ�����б������username, password
	 * !id,��ʾ���벻�ܰ���id�������
	 * @return
	 */
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(HttpServletRequest request,Model model,ModelMap modelMap,HttpSession session,HttpServletResponse response){
		System.out.println("����·��"+request.getRequestURL());
		System.out.println("��Ӧ�ı���"+response.getCharacterEncoding());
		String username1=request.getParameter("username");
		System.out.println("-�û���1-"+username1);
		//�����ݷ���Request��ȡֵ��Χ
		model.addAttribute("msg1", "msg����1");
		
		//�����ݷ���Request��ȡֵ��Χ
		modelMap.addAttribute("msg2", "msg����2");
		
		
		System.out.println("-�û���¼-");
		return "/user.jsp";
	}
	
	/**
	 * �ֶΰ�
	 * 
	 * @return
	 */
	@RequestMapping(value="login1",method=RequestMethod.POST)
	public String login1(@RequestParam(value="uname") String username,String password){
	    System.out.println("-��¼1-");
	    System.out.println("�û���"+username);
	    System.out.println("����:"+password);
	 
		return "/user.jsp";
	}
	
	
	/**
	 * ǿ�ư�Map
	 * 
	 * @return
	 */
	@RequestMapping(value="login2",method=RequestMethod.POST)
	public String login2(@RequestParam Map<String,Object> entity){
	    System.out.println("-��¼2-");
	    System.out.println("�û���"+entity.get("uname"));
	    System.out.println("����:"+entity.get("password"));
	 
		return "/user.jsp";
	}
	
	
	/**
	 * �ֶΰ�
	 * 
	 * @return
	 */
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String register(String username,String password,Integer age){
	    System.out.println("-ע��-");
	    System.out.println("�û���"+username);
	    System.out.println("����:"+password);
	    System.out.println("����:"+age);
		return "/user.jsp";
	}
	
	/**
	 * JavaBean���ݰ�
	 * 
	 * @return
	 */
	@RequestMapping(value="register1",method=RequestMethod.POST)
	public String register1(User user){
	    System.out.println("-ע��-");
	    System.out.println("�û���"+user.getUsername());
	    System.out.println("����:"+user.getPassword());
	    System.out.println("����:"+user.getAge());
		return "/user.jsp";
	}
	
	
	@RequestMapping(value="get-usernames",method=RequestMethod.POST)
	public String getUserNames(String[] username){
	    for(String u:username)
	    {
	    	System.out.println(u);
	    }
		return "/user.jsp";
	}
	
	/**
	 * �Զ���List
	 * @param user
	 * @return
	 */
	@RequestMapping(value="users",method=RequestMethod.POST)
	public String getUsers(UsersModel user){
		List<User> users=user.getUsers();
		for(User u:users){
			  System.out.println("�û���"+u.getUsername());
			  System.out.println("����:"+u.getPassword());
			    System.out.println("����:"+u.getAge());
		}
		
        return "/user.jsp";
	}
	/**
	 * ǿ�ư����������Cookie
	 * @param cookie
	 * @return
	 */
	@RequestMapping(value="get-cookie")
	public String getCookie(@CookieValue(value="JSESSIONID") String cookie){
		System.out.println("-���cookieֵ-");
		//JSESSIONID
		System.out.println("cookie:"+cookie);
		 return "/user.jsp";
	}
	
	@RequestMapping(value="{name}/get-name")
	public String getName(@PathVariable(value="name") String name){
		System.out.println("-��ò����� -"+name);
		return "/index.jsp";
	}
	
	
	
	

}
