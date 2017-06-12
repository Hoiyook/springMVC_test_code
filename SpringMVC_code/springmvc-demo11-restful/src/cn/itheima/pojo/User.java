package cn.itheima.pojo;

public class User {
	
	private String username;
	private String password;
	private Integer age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		System.out.println("-set-"+username);
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

}
