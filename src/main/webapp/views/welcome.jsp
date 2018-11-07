<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<meta name="_csrf" content="${_csrf.token}" />
<meta name="_csrf_header" content="${_csrf.headerName}" />
<meta name="project_baseurl"
	content="${pageContext.servletContext.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="commons/coreCSS.jsp"%>
<!-- JavaScript -->
	<%@ include file="commons/coreJs.jsp"%>
</head>
<body>
	<h1>hello</h1>
	
	<div ng-app="">
  <p>Name : <input type="text" ng-model="name"></p>
  <h1>Hello {{name}}</h1>
</div>
	

</body>

</html>