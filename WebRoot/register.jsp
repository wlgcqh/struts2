<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'register.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
<style type="text/css">
span.color {
	color: red;
}
</style>
<script type="text/javascript" src="jquery-2.1.1.js"></script>


</head>

<body>
	
	<s:actionerror cssStyle="color:red"/>
	<s:fielderror cssStyle="color:blue"></s:fielderror>
	
<!--  	<form action="register.action" method="post">

		username:<input type="text" size="20" name="username"><br>
		password:<input type="password" size="20" name="password"><br>
		repassword:<input type="password" size="20" name="repassword"><br>
		age:<input type="text" size="20" name="age"><br>
		birthday:<input type="text" size="20" name="birthday"><br>
		graduation:<input type="text" size="20" name="graduation"><br>
		<input type="submit" value="submit" id="submit">
	</form>
	-->
	
	<s:form action="register.action" theme="simple">
	
		username:<s:textfield name="username" label="username"></s:textfield><br>
		password:<s:password name="password" label="password"></s:password><br>
		repassword:<s:password name="repassword" label="repassword"></s:password><br>
		age:<s:textfield name="age" label="age"></s:textfield><br>
		birthday:<s:textfield name="birthday" label="birthday"></s:textfield><br>
		graduation:<s:textfield name="graduation" label="graduation"></s:textfield><br>
		submit:<s:submit value="submit"></s:submit>
		
	
	
	</s:form>
		
		









</body>
</html>
