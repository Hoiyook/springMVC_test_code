<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <!-- 上传表单 -->
  <!-- 
  1.必须是POST
  2.内容类型必须是multipart/form-data
  3.多文件上传,name属性要一样.
   -->
  <form action="${pageContext.request.contextPath }/mul-upload.mvc"  method="post" enctype="multipart/form-data">
    <input name="files" type="file"><br>
    <input name="files" type="file"><br>
    <input name="files" type="file"><br>
    <input type="submit" value="上传">
  </form>
  
  <a href="${pageContext.request.contextPath }/filelist.mvc">下载列表</a>
</body>
</html>