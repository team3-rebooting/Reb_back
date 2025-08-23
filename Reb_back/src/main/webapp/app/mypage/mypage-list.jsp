<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- 페이지 이름 -->
<div class="pagetitle"></div>
<!-- 마이페이지 목록 틀 -->
<div class="list">
	<!-- 목록 속성 값 -->
	<div class="list-col-type">
		<p class="font-main list-title"></p>
		<p class="font-main list-user-name"></p>
		<p class="font-main list-date"></p>
	</div>
	<!-- 목록 -->
	<ul class="mypage-ul-list">
		<!-- 목록 행 -->
		<li class="li-content"><a href="" class="font-main list-title"></a>
			<p class="font-main list-user-name"></p>
			<p class="font-main list-date"></p></li>
		<li class="li-content"><a href="" class="font-main list-title"></a>
			<p class="font-main list-user-name"></p>
			<p class="font-main list-date"></p></li>
		<li class="li-content"><a href="" class="font-main list-title"></a>
			<p class="font-main list-user-name"></p>
			<p class="font-main list-date"></p></li>
		<li class="li-content"><a href="" class="font-main list-title"></a>
			<p class="font-main list-user-name"></p>
			<p class="font-main list-date"></p></li>
		<li class="li-content"><a href="" class="font-main list-title"></a>
			<p class="font-main list-user-name"></p>
			<p class="font-main list-date"></p></li>
		<li class="li-content"><a href="" class="font-main list-title"></a>
			<p class="font-main list-user-name"></p>
			<p class="font-main list-date"></p></li>
		<li class="li-content"><a href="" class="font-main list-title"></a>
			<p class="font-main list-user-name"></p>
			<p class="font-main list-date"></p></li>
		<li class="li-content"><a href="" class="font-main list-title"></a>
			<p class="font-main list-user-name"></p>
			<p class="font-main list-date"></p></li>
		<li class="li-content"><a href="" class="font-main list-title"></a>
			<p class="font-main list-user-name"></p>
			<p class="font-main list-date"></p></li>
		<li class="li-content"><a href="" class="font-main list-title"></a>
			<p class="font-main list-user-name"></p>
			<p class="font-main list-date"></p></li>
	</ul>
</div>
<div class="page-list">
	<div class="pagenation">
		<a href="#">&lt;</a> <a href="#">1</a> <a href="#">2</a> <a href="#">3</a>
		<a href="#">4</a> <a href="#">5</a> <a href="#">&gt;</a>
	</div>
</div>
<div class="search-container">
	<form action="" method="get">
		<div class="search-form">
			<select class="select-search" name="selectSearch">
				<option class="search-type-first" value="search-type-first"
					name="seachTypeFirst">제목</option>
				<option class="search-type-second" value="search-type-second"
					name="seachTypeSecond"></option>
			</select> <input class="input-search" type="text" name="search">
			<button type="button" class="button-search" data-search=""
				onclick="search(event)">
				<img src="./../../assets/img/search.jpg">
			</button>
		</div>
	</form>
</div>