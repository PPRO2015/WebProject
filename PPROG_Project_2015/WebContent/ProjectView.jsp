<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="smena" scope = "request" class = "cz.uhk.pprog.mvc.ProjectModel"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Team work</title>
</head>
<body>
	<b>Jmeno:</b> <jsp:getProperty name="smena" property = "name"/>
	<tr>
	<b>Team:</b> <jsp:getProperty name="smena" property = "team"/>
		<tr>
	<b>Pracovni doba od:</b> <jsp:getProperty name="smena" property = "workHour"/>
		<tr>
	<b>Pracovni doba do:</b> <jsp:getProperty name="smena" property = "workHourUntil"/>
</body>
</html>