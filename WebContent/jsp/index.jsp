<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
 <%@ page isELIgnored="false"%>
<%-- <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
	<div align="center">
		<table>
			<thead>
				<tr>
					<th style="width: 40px">id</th>
					<th style="width: 40px">name</th>
				</tr>
			</thead>
			<tbody>
				<!-- ±éÀú´òÓ¡´ÓÊý¾Ý¿âÖÐÄÃ³öµÄÊý¾Ý -->
				<s:iterator value="userList">
					<tr>
						<td>${id}</td>
						<td>${name}</td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</div>
</body>
</html>