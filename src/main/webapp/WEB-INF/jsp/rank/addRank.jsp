<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>직급 등록</title>
    <link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
</head>

<!-- addRank -->
<body style="text-align:center; margin:0 auto; display:inline; padding-top:100px;">
	<form id="addRank" name="addRank" method="post" action="/rank/insertRank.do">
		<div id="content_pop">
       	 	<!-- 타이틀 -->
        	<div id="title">
        		<ul>
					<li>직급 등록</li>
        		</ul>
        	</div>
        	<!-- // 타이틀 -->
		<div class="container">
			<table class="addRank">
				<tr>
					<td>글 번호</td>
					<td><input type="text" id="emp_rank_idx" name="emp_rank_idx"></input></td>
				</tr>
				<tr>
					<td>직급 코드</td>
					<td><input type="text" id="emp_rank_code" name="emp_rank_code"></input></td>
				</tr>
				<tr>
					<td>직급명</td>
					<td><input type="text" id="emp_rank_name" name="emp_rank_name"></input></td>
				</tr>
				<tr>
					<td>직급 등록자</td>
					<td><input type="text" id="emp_rank_reg_user" name="emp_rank_reg_user"></input></td>
				</tr>
				<tr>
					<td>직급 등록일자</td>
					<td><input type="text" id="emp_rank_reg_date" name="emp_rank_reg_date"></input></td>
				</tr>
				<tr>
					<td>직급 수정자</td>
					<td><input type="text" id="emp_rank_mod_user" name="emp_rank_mod_user"></input></td>
				</tr>
				<tr>
					<td>직급 수정일자</td>
					<td><input type="text" id="emp_rank_mod_date" name="emp_rank_mod_date"></input></td>
				</tr>
				<tr>
					<td>직급 사용여부</td>
					<td><select name="emp_rank_use_Yn">
						<option value=""> :: 사용여부 선택 :: </option>
						<option value="Y"> Y </option>
						<option value="N"> N </option>	
					</select></td>
				</tr>
			</table>
			<input type="submit" id="submit" value="등록" class="btn"></input>
		</div>
	</div>
</form>
<!-- // rankList -->
</body>
</html>