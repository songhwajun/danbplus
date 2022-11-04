<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
	<title><tiles:getAsString name="title" ignore="true"/></title>
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
    <link href="/resources/css/styles.css" rel="stylesheet" />
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>

<!--
	메뉴 스크롤 X: <body>
	메뉴 스크롤 O: <body class="sb-nav-fixed">
-->
<body>
	<tiles:insertAttribute name="header" ignore="true"/>
	<div id="layoutSidenav">
		<div id="layoutSidenav_nav">
			<tiles:insertAttribute name="side" ignore="true"/>
		</div>
		<div id="layoutSidenav_content">
			<tiles:insertAttribute name="body" ignore="true"/>
			<tiles:insertAttribute name="footer" ignore="true"/>
		</div>
	</div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script src="/resources/js/scripts.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
    <script src="/resources/assets/demo/chart-area-demo.js"></script>
    <script src="/resources/assets/demo/chart-bar-demo.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
    <script src="/resources/js/datatables-simple-demo.js"></script>
</body>
</html>