<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>직급 관리 목록</title>
    <link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
    
    <script type="text/javaScript">
   		 /* 직급 등록 화면 function */
		function addRank() {
				open("addRank.do", 'pop1', 'width=550, height=700, left=100, top=50, scrollbar=yes'
			);
		}
	</script>
</head>

<!-- rankList -->
<body style="text-align:center; margin:0 auto; display:inline; padding-top:100px;">
	<form id="listForm" name="listForm" method="post">
		<input type="hidden" name="emp_rank_use_Yn" value="N" />
		<div id="content_pop">
       	 	<!-- 타이틀 -->
        	<div id="title">
        		<ul>
					<li>직급 관리 목록</li>
        		</ul>
        	</div>
        	<!-- // 타이틀 -->
        	<!-- 버튼 -->
        	<div id="sysbtn">
        			<ul>
        				<li>
        	         	 <span class="btn_blue_l">
        	              <a href="javascript:addRank();"><spring:message code="button.create" /></a>
                          <img src="<c:url value='/images/egovframework/example/btn_bg_r.gif'/>" style="margin-left:6px;" alt=""/>
        	         	 </span>
        				</li>
        			</ul>
        		</div>
        		&nbsp;&nbsp;&nbsp;&nbsp;
        		<br></br>
		<div class="container">
			<table class="rank_list">
					<colgroup>
					<col width="10%" />
					<col width="10%" />
					<col width="10%" />
					<col width="10%" />
					<col width="10%" />
					<col width="10%" />
				</colgroup>	
				<thead>
					<tr>
						<th scope="col">No</th>
						<th scope="col">직급 코드</th>	
						<th scope="col">직급명</th>	
						<th scope="col">직급 수정자</th>	
						<th scope="col">직급 수정일자</th>	
						<th scope="col">직급 사용여부</th>	
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="result" items="${resultList}" varStatus="status">
						<tr>
							<td align="center" class="listtd"><c:out value="${result.emp_rank_idx}"/>&nbsp;</td>
							<td align="center" class="listtd"><c:out value="${result.emp_rank_code}"/>&nbsp;</td>
							<td align="center" class="listtd"><c:out value="${result.emp_rank_name}"/>&nbsp;</td>
							<td align="center" class="listtd"><c:out value="${result.emp_rank_mod_user}"/>&nbsp;</td>
							<td align="center" class="listtd"><c:out value="${result.emp_rank_mod_date}"/>&nbsp;</td>
							<td align="center" class="listtd"><a href="/HelloEgov/rank/changeUseYn.do?emp_rank_code=${result.emp_rank_code}&emp_rank_use_Yn=${result.emp_rank_use_Yn}"><c:out value="${result.emp_rank_use_Yn}"/>&nbsp;</a></td>
						</tr>	
					</c:forEach>
				</tbody>	
			</table>
		</div>
	</div>
	</form>
<!-- // rankList -->
</body>
</html>