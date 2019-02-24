<%@ page import="com.hwua.demo01.CookieUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	li{
		list-style:none;
	}
</style>
</head>
<body>
<ul>
		<li>
			<a href="Servlet04?id=1"> 
				<img alt="" src="imgs/01.jpg" width="100px"
					height="100px">
			</a>
		</li>
		<li>
			<a href="Servlet04?id=2"> 
				<img alt="" src="imgs/02.jpg" width="100px"
					height="100px">
			</a>
		</li>
		<li>
			<a href="Servlet04?id=3"> 
				<img alt="" src="imgs/03.jpg" width="100px"
					height="100px">
			</a>
		</li>
		<li>
			<a href="Servlet04?id=4"> 
				<img alt="" src="imgs/04.jpg" width="100px"
					height="100px">
			</a>
		</li>
	</ul>
	
	<hr>
	<h3>浏览记录</h3>
	
	<%-- 从JSP的内置对象request中获取Cookie --%>
	<ul>
	<% 		
		Cookie[] cookies = request.getCookies();
		Cookie c = CookieUtils.getCookie(cookies, "id");
		if(c == null){
			%>
			<h4>你没有浏览任何商品</h4>
			<%
		}else{
			String[] ids = c.getValue().split("#");
			for(String id:ids){
				%>
				<li>
					<img width="100px" height="100px" src="imgs/0<%=id%>.jpg"/>
				</li>
				<%
			}
		}
	%>
	</ul>
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>