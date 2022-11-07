<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
	td {
		padding: 10px;
		border: 1px solid #000;
		text-align: center;
	}
</style>
<div>
	<h2>TEST</h2>
	<table>
		<c:forEach var="code" items="${codeList}">
			<tr>
				<td>${code.cod_gb}</td>
				<td>${code.cod_depth}</td>
				<td>${code.cod_description}</td>
				<td>${code.reg_nm}</td>
				<td>${code.reg_dt}</td>
			</tr>
		</c:forEach>
	</table>
</div>