<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <!-- 更新用户 -->
  <!-- 表单的请求(application/x-www-form-urlencoded)只支持post和get -->
  <!-- 如果在本项目使用表单请求访问put和delete的方法,配置HiddenHttpMethodFilter过滤器 -->
  <!-- 
  HiddenHttpMethodFilter过滤器 是将put和delete转成post
   -->
  <form action="${pageContext.request.contextPath }/update.mvc"   method="post">
    <input type="hidden" name="_method" value="PUT">
    
       用户名:<input name="username" type="text"><br/>
       密码:<input name="password" type="text"><br/>
        年龄:<input name="age" type="text"><br/>
       <input type="submit">
  </form>
</body>
</html>