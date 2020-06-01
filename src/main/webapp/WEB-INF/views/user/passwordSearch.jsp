<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${ pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
		<!-- header -->
	<%@ include file="/WEB-INF/views/head.jsp"%>
	
	<body>
		<!-- Navigation -->
		<%@ include file="/WEB-INF/views/nav.jsp"%>
		
		<!-- Page Header -->
		<%@ include file="/WEB-INF/views/pageHeader.jsp"%>
		
		<div class="container" align="center">
<!-- 			<h1>비밀번호 찾기</h1> -->
			<form method="post" action="/happyhouse/findPw">
				<c:if test="${!empty auth_msg} ">
					<p>${auth_msg }</p>
				</c:if>
				<table>
					<tr><td><div align="right">이름 *</div></td><td><input type="text" name="name" placeholder="이름"></td></tr>
					<tr><td>&nbsp;&nbsp;</td></tr>
					<tr><td><div align="right">아이디 *</div></td><td><input type="text" name="id" placeholder="아이디"></td></tr>
					<tr><td>&nbsp;&nbsp;</td></tr>
					<tr><td><div align="right">전화번호 *</div></td><td><input type="text" name="phone" placeholder="전화번호"></td></tr>
				</table>
				<br>
			   	<input type="submit" class="btn btn-primary" value="비밀번호 변경">
				<input type="reset" class="btn btn-primary" value="돌아가기" onClick="location.href='/happyhouse/'">
			</form>
		</div>
		
		<hr>
	
	  <!-- Footer -->
      <%@ include file="/WEB-INF/views/footer.jsp"%>
	
	  <!-- JavaScript -->
	  <%@ include file="/WEB-INF/views/script.jsp"%>

	</body>
</html>