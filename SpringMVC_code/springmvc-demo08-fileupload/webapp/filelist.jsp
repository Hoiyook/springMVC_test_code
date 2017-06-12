<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 
使用路径转码的方式来解决中文乱码问题

 -->
 <script type="text/javascript">
 function download(filename){
	//使用Base64编码的字符串
	var encodename =encodeURI(filename);
	//因为Base64编码有一些字符会被浏览器自动转义,如果不希望被转义,就加上escape
	var path="${pageContext.request.contextPath }/download.mvc?filename="+escape(encodename);
	alert(path);
	window.location.href=path;
	 
 }
 
 </script>
</head>
<body>
   文件列表
   <table border="1">
     <tr> 
       <td>文件名</td>
       <td>下载</td>
     </tr>
     <c:forEach var="filename" items="${requestScope.filenames }">
     <tr> 
       <td>${filename }</td>
       <!-- 参数有两个'',表示已字符串传递 -->
       <td><a href="javascript:download('${filename}')">下载</a></td>
     </tr>
     </c:forEach>
   </table>
</body>
</html>