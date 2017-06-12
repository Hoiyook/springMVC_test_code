<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.0.min.js"></script>
<script type="text/javascript">
//启动页面就执行函数
   $(function(){
	   $.ajax({
		   type: "POST",
		   url: "${pageContext.request.contextPath}/login2.mvc",
		   //构建一个JSON的
		   data: "{\"username\":\"zhangsan\",\"password\":\"123456\",\"age\":\"20\"}",
		   //发送的请求是以JSON发送的.
		   contentType: "application/json",
		   success: function(data){
		     //alert( "Data Saved: " + data.username );
		     console.log(data);
		   }
		});
	   
   });
</script>
</head>
<body>

</body>
</html>