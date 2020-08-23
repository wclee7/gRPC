<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<body>
	<h3>Return Message : ${msg}</h3>
	<% String msg2 = (String)request.getAttribute("msg"); %>	
	<%= msg2 %>
</body>
</html>