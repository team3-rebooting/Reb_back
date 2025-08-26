$(document).ready(function(){
	let $fileInput = $('#file');
	let $fileList = $('.file-list');
	let $cnt = $('.cnt');
	let cnt = 0;
	
	console.log($fileInput);
	
	// 기존 이미지 삭제 기능
	$(".delete-file-btn").on("click", function(){
		let fileName = $(this).data("filename");
		let confirmDelete = confirm("정말로 이 이미지를 삭제하시겠습니까?");
		
		if(confirmDelete){
			$(this).closest(".img-box").remove();
			$("<input>")
				.attr("type", "hidden")
				.attr("name", "deletedFiles")
				.val(fileName)
				.appendTo("#update-form");
		}
	});
	
	// 새 파일 추가 및 미리보기
	$fileInput.on('change', function(){
		let files = this.files;
		
		$fileList.html('');
		
		if(files.length > 1){
			alert("파일은 최대 1개까지만 첨부 가능합니다.");
			let dt = new DataTransfer();
		}	
		)
	})
})