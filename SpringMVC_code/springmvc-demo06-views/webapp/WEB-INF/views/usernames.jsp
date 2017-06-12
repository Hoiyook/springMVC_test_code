<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <!-- 用户表单 -->
  <form action="${pageContext.request.contextPath }/get-usernames.mvc" method="post">
   <!-- 使用数组传递,一定要name属性要一样 -->
       用户名1:<input name="username" type="text"><br/>
       用户名2:<input name="username" type="text"><br/>
       用户名3:<input name="username" type="text"><br/>
       <input type="submit">
  </form>
  
  ${sessionScope.msg1 } <br/>
  ${requestScope.msg1 } <br/>
  ${requestScope.msg2 }
</body>
</html>