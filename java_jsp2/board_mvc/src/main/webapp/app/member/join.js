/**
 *  회원가입
 */
 
// 전체 동의 버튼 눌렀을 때
$("body").on("click", "#term", function(){
	if($(this).is(":checked")){ // 방금 체크가 된 거라면
		$(".terms").prop("checked", true);
	}else{ // 방금 체크가 풀린 거라면
		$(".terms").prop("checked", false);
	}
});

$("body").on("click", ".term-detail a", function(){
	$("#" + $(this).data("href")).css("display", "block");
});

function formSubmit(){
	var form = document.joinForm;
	
	if(!form.memberId.value){
		alert("아이디를 입력해주세요");
		return;
	}
	
	check = false; // 체크 안 한게 있는지
	$.each($(".terms"), function(index, item){
		if(!$(item).is(":checked")){ // 
			check = true; // 약관 중 하나라도 체크 안 한 것이 있으면
		}
	});
	
	if(check){
		alert("이용약관에 동의해주세요");
		return;
	}
	
	form.submit();
}

// ajax로 
function checkId(id){
	if(id == ""){
		$("#idCheck_text").text("");
	}
	
	$.ajax({
		url: contextPath + "/member/MemberCheckIdOk.me?id=" + id,
		type: "GET",
		data: {
			
		},
		datatype: "JSON",
		success: function(res){
			if(res.status == "not-ok"){ // 이미 존재함
				
			}else{
				
			}
		},
		error: function(err){
			console.log(err);
		}
	});
}










