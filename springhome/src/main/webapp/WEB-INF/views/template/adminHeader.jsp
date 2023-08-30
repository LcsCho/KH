<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 메뉴</title>
<!--  favicon 설정 -->
<link rel="shortcut icon" href="/images/kh.png">

<!-- css 파일을 불러오는 코드 -->
<!-- 아이콘 사용을 위한 Font Awesome 6 CDN -->
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

<!-- 구글 웹 폰트 사용을 위한 CDN -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="/css/reset.css">
<link rel="stylesheet" type="text/css" href="/css/layout-sidebar.css">
<link rel="stylesheet" type="text/css" href="/css/commons.css">
<!-- <link rel="stylesheet" type="text/css" href="/css/test.css"> -->
<style></style>

</head>
<body>
    <main>
        <header>
            <div class="logo">
                <img src="https://dummyimage.com/200x50/000/fff">
            </div>
            <div class="title">
                <h1>타이틀/검색창</h1>
            </div>
            <div class="etc">???</div>
        </header>
        <nav>
            <ul class="menu center">
                <li><a href="/">Home</a></li>
				<li><a href="/member/logout">로그아웃</a></li>
                
            </ul>
        </nav>
        <section>
            <aside>
                <div class="flex-container vertical center border-blue">
                    <div class="row">
                        <h2><a href="/admin/member/list?size=20" class="link">회원관리</a></h2>
                    </div>
                    <div class="row">
                        <h2><a href="#" class="link">회원 통계</a></h2>
                    </div>
                    <div class="row">
                        <h2><a href="#" class="link">게시글 통계</a></h2>
                    </div>
                </div>
            </aside>
            <article>