<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upload.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="jquery-2.1.1.js"></script>
    <script type="text/javascript">

        $(document).ready(function () {
            $("#more").click(function () {

                var file = $("<input type='file' name='file'>");
                var button = $("<input type='button' class='remove' value='remove'>");
                var br = $("<br>");


                button.click(function () {

                    file.remove();
                    button.remove();
                    br.remove();
                });

                $("#submit").before(file).before(button).before(br);


            });

        });

    </script>
  </head>
  
  <body>
    
	<form action="upload.action" method="post" enctype="multipart/form-data">
		username:<input type="text" name="username"><br>
		file:<input type="file" name="file"><input type="button" id="more" value="more"><br>
    	<input type="submit" value="submit" id="submit">
	</form>

  </body>
</html>
