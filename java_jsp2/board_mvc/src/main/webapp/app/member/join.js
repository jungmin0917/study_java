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

let id_check = false; // 아이디 중복 검사 통과 여부

function formSubmit(){
	var form = document.joinForm;
	
	if(!form.memberId.value){
		alert("아이디를 입력해주세요");
		return;
	}
	
	if(!id_check){
		alert("아이디 중복 검사를 통과해주세요");
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
	id_check = false; // 중복 검사 통과했는지
	
	if(id == ""){
		$("#idCheck_text").text("");
		return;
	}
	
	$.ajax({
		// 반드시 memberId로 (해당 컨트롤러에서 받기로 한 키값으로) 보낼 것!!!
		url: contextPath + "/member/MemberCheckIdOk.me?memberId=" + id,
		type: "GET",
		dataType: "JSON",
		success: function(res){
			// dataType을 JSON으로 지정하면, 자동으로 콜백 함수에 전달하여 파싱되므로, 별도로 JSON.parse()를 할 필요가 없다
			if(res.status == "not-ok"){ // 이미 존재함
				$("#idCheck_text").html("이미 존재하는 아이디입니다").css("color", "red");
			}else{
				$("#idCheck_text").html("사용 가능한 아이디입니다").css("color", "blue");
				id_check = true;
			}
		},
		error: function(err){
			console.log(err);
		}
	});
}

// keyup으로 해야 시간에 맞게 쓸 수 있다
$("body").on("keyup", "#memberId", function(){
	let id_val = $(this).val();
	
	checkId(id_val);
});









