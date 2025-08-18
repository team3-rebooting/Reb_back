<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 프로필 사진 첨부파일 등록 -->
<form action="" method="post">
    <div id="profile-pic-upload-middle">
        <label for="input-profile-pic-file" id="label-profile-pic" class="font-main">
            첨부파일
        </label>
        <!-- 프로필 사진 이름 -->
        <input type="text" name="profilePic" id="input-profile-pic-file" class="font-main">
        <!-- 프로필 사진 첨부파일 불러오기 버튼 -->
        <label for="input-profile-pic-search" id="label-profile-pic-search" class="font-main" >...</label>
        <input type="file" name="profilePicSearch" id="input-profile-pic-search" class="font-main" onchange="loadImage(event)" accept="image/*">
    </div>
    <!-- 프로필 사진 등록 버튼 -->
    <div id="profile-pic-upload-bottom">
        <button type="button" id="button-profile-pic-upload"  class="font-main" name="profilePicUpload" onclick="saveImage()">등록</button>
    </div>
</form>