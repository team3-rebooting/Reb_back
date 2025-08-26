<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 전문가 인증 첨부파일 등록 -->
<form action="/myPage/expertFileUploadOk.my" method="post"
	id="form-expert-file-upload" enctype="multipart/form-data">
	<div id="expert-file-upload-middle">
		<label for="input-expert-file" id="label-expert-file"
			class="font-main"> 첨부파일 </label>
		<!-- 첨부 파일 이름 -->
		<input type="text" readonly id="input-expert-file" name="expertFile"
			class="font-main">
		<!-- 첨부 파일 불러오기 버튼 -->
		<label for="input-expert-file-search" id="label-expert-file-search"
			class="font-main">...</label> <input type="file"
			name="expertFileSearch" id="input-expert-file-search"
			class="font-main">
	</div>
	<!-- 등록 버튼 -->
	<div id="expert-file-upload-bottom">
		<button type="submit" id="button-expert-file-upload" class="font-main"
			name="expertFileUpload">등록</button>
	</div>
</form>

<script
	src="${pageContext.request.contextPath}/assets/js/mypage/expert-file-upload.js"></script>