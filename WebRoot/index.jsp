<%@ page language="java" import="cn.ldm.bean.People" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script>
		$(function(){
			$("#aa").click(function(){
				 $("#aa1").val("fsdafsda");
			});
		});
		function aaa(){
			//  document.getElementById("aa1").value="das";
		}
	</script>
</head>
	<body>
		<form>
			<input type="button" value="fdsa" id="aa" " />
			<a href="${pageContext.request.contextPath }/success.jsp?flag=3423">afdsda</a>
			<s:if test="#parameters.a!=null">
			fdasdfsdafs
			</s:if>
			<br>
		</form>
		<debug></debug>
	</body>
</html>
