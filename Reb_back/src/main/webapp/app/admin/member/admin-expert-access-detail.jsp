<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin/member/admin-expert-access-detail.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
	rel="stylesheet">
<title>수업 디테일</title>
</head>
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/member/admin-expert-access-detail.js"></script>

<body class="font-menu">
	<!-- 헤더 -->
	<header>
		<!-- 수업 목록 이동 -->
		<a
			href="${pageContext.request.contextPath}/admin/expertListOk.ad?page=1">
			<!-- 사이드 로고 --> <img
			src="${pageContext.request.contextPath}/assets/img/team_logo.png"
			alt="사이트 로고 사진">
		</a>
	</header>
	<!-- 반려 모달 뒷배경 -->
	<div id="modal-background">
		<!-- 반려 모달 영역 -->
		<div id="cancel-modal">
			<!-- 반려 모달 입력 -->
			<div id="cancel-modal-in">
				<!-- 반려 모달 제목 -->
				<p>승인 취소 사유</p>
				<!-- 반려 모달 입력 영역 -->
				<form action="#" method="get" id="cancel-input">
					<!-- 반려 모달 입력 -->
					<textarea name="modal" placeholder="사유 입력" id="return-message"></textarea>
					<!-- 반려 모달 등록 버튼 -->
					<button type="button" id="submit"
						data-member-number="${expert.memberNumber}">등록</button>
				</form>
			</div>
			<!-- 반려 모달 닫기 버튼 -->
			<button type="button" id="close-modal">X</button>
		</div>
	</div>
	<!-- 메인 -->
	<main>
		<!-- 메인 영역 -->
		<div id="main-container">
			<!-- 메인 컨테이너 영역 -->
			<div class="expert-detail-container">
				<!-- 제목, 목록 영역 -->
				<div id="detail-container-list">
					<!-- 제목 -->
					<p class="pagetitle">전문가 상세 정보</p>
					<!-- 목록 이동 버튼 -->
					<button type="button" class="back-list">목록</button>
				</div>
			</div>
			<!-- 내용 영역 -->
			<div class="div-detail-area">
				<div class="main-expert-info">
					<p class="main-expert-info-title">전문가 기본정보</p>
					<div>
						<p>이름 :</p>
						<p>
							<c:out value="${expert.memberName}" />
						</p>
					</div>
					<div>
						<p>성별 :</p>
						<p>
							<c:out value="${expert.memberGender eq 'M' ? '남자' : '여자'}" />
						</p>
					</div>
					<div>
						<p>전화번호 :</p>
						<p>
							<c:out value="${expert.memberPhoneNumber}" />
						</p>
					</div>
					<div>
						<p>이메일 :</p>
						<p>
							<c:out value="${expert.memberEmail}" />
						</p>
					</div>
					<div class="main-expert-list-file">
						<p>첨부파일 :</p>
						<c:forEach var="file" items="${expert.fileExpertList}">
							<a
								href="${pageContext.request.contextPath}/file/download.file?fileSystemName=${file.getFileSystemName()}&fileOriginalName=${file.getFileOriginalName()}">
								<button type="button" class="file">다운로드</button>
							</a>
						</c:forEach>
					</div>
				</div>
			</div>
			<div class="main-expert-info">
				<p class="main-expert-info-title">전문가 자격증 정보</p>
				<div>
					<p>
						<c:out value="${expert.expertLicenseInfo}" />
					</p>
				</div>

			</div>
			<div class="main-expert-info">
				<p class="main-expert-info-title">전문가 경력 정보</p>
				<div>
					<p>
						<c:out value="${expert.expertCareer}" />
					</p>
				</div>

			</div>
			<div id="div-admin-detail-button-delete">
				<!-- 삭제 반려 버튼 -->
				<button class="button-cancel" type="button"
				data-member-number="${expert.memberNumber}">승인 취소</button>
			</div>
		</div>
	</main>
	<footer></footer>
</body>

</html>