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
  <form action="${pageContext.request.contextPath }/users.mvc" method="post">
<!--        编号:<input name="id" type="text"><br/> -->
       用户名:<input name="users[0].username" type="text"><br/>
       密码:<input name="users[0].password" type="text"><br/>
       年龄:<input name="users[0].age" type="text"><br/>
       
         用户名:<input name="users[1].username" type="text"><br/>
       密码:<input name="users[1].password" type="text"><br/>
       年龄:<input name="users[1].age" type="text"><br/>
       
        用户名:<input name="users[2].username" type="text"><br/>
       密码:<input name="users[2].password" type="text"><br/> 
       年龄:<input name="users[2].age" type="text"><br/>
              
       <input type="submit">
  </form>
  
  ${sessionScope.msg1 } <br/>
  ${requestScope.msg1 } <br/>
  ${requestScope.msg2 }
</body>
</html>