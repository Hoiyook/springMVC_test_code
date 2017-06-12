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
	 * 表示请求中必须包括username, password
	 * !id,表示必须不能包括id这个参数
	 * @return
	 */
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(HttpServletRequest request,Model model,ModelMap modelMap,HttpSession session,HttpServletResponse response){
		System.out.println("请求路径"+request.getRequestURL());
		System.out.println("响应的编码"+response.getCharacterEncoding());
		String username1=request.getParameter("username");
		System.out.println("-用户名1-"+username1);
		//将数据放在Request的取值范围
		model.addAttribute("msg1", "msg测试1");
		
		//将数据放在Request的取值范围
		modelMap.addAttribute("msg2", "msg测试2");
		
		
		System.out.println("-用户登录-");
		return "/user.jsp";
	}
	
	/**
	 * 字段绑定
	 * 
	 * @return
	 */
	@RequestMapping(value="login1",method=RequestMethod.POST)
	public String login1(@RequestParam(value="uname") String username,String password){
	    System.out.println("-登录1-");
	    System.out.println("用户名"+username);
	    System.out.println("密码:"+password);
	 
		return "/user.jsp";
	}
	
	
	/**
	 * 强制绑定Map
	 * 
	 * @return
	 */
	@RequestMapping(value="login2",method=RequestMethod.POST)
	public String login2(@RequestParam Map<String,Object> entity){
	    System.out.println("-登录2-");
	    System.out.println("用户名"+entity.get("uname"));
	    System.out.println("密码:"+entity.get("password"));
	 
		return "/user.jsp";
	}
	
	
	/**
	 * 字段绑定
	 * 
	 * @return
	 */
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String register(String username,String password,Integer age){
	    System.out.println("-注册-");
	    System.out.println("用户名"+username);
	    System.out.println("密码:"+password);
	    System.out.println("年龄:"+age);
		return "/user.jsp";
	}
	
	/**
	 * JavaBean数据绑定
	 * 
	 * @return
	 */
	@RequestMapping(value="register1",method=RequestMethod.POST)
	public String register1(User user){
	    System.out.println("-注册-");
	    System.out.println("用户名"+user.getUsername());
	    System.out.println("密码:"+user.getPassword());
	    System.out.println("年龄:"+user.getAge());
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
	 * 自动绑定List
	 * @param user
	 * @return
	 */
	@RequestMapping(value="users",method=RequestMethod.POST)
	public String getUsers(UsersModel user){
		List<User> users=user.getUsers();
		for(User u:users){
			  System.out.println("用户名"+u.getUsername());
			  System.out.println("密码:"+u.getPassword());
			    System.out.println("年龄:"+u.getAge());
		}
		
        return "/user.jsp";
	}
	/**
	 * 强制绑定请求过来的Cookie
	 * @param cookie
	 * @return
	 */
	@RequestMapping(value="get-cookie")
	public String getCookie(@CookieValue(value="JSESSIONID") String cookie){
		System.out.println("-获得cookie值-");
		//JSESSIONID
		System.out.println("cookie:"+cookie);
		 return "/user.jsp";
	}
	
	@RequestMapping(value="{name}/get-name")
	public String getName(@PathVariable(value="name") String name){
		System.out.println("-获得参数名 -"+name);
		return "/index.jsp";
	}
	
	
	
	

}
