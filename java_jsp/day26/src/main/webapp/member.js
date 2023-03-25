/**
 * 회원가입 유효성 검사 js파일 작성
 */

var form = document.joinForm; // "document.name명" 으로 해당 DOM 객체 가져올 수 있음 

function join(){
	// 값이 있을 때 true, 값이 없을 때 false
	if(!form.id.value){ // joinForm의 id라는 name 속성의 value를 가져오라는 것
		// 아이디 입력하지 않았을 때
		alert("아이디를 입력해주세요"); // alert() : 문자열 인수를 받아 브라우저에 경고창 띄워주는 함수
		form.id.focus();
		return; // 현재 함수를 벗어나겠다는 뜻
	}
	
	if(form.id.value.length < 4 || form.id.value.length > 16){
		alert("아이디는 4자 이상, 16자 이하로 입력해주세요");
		form.id.focus();
		return;
	}
	
	if(!form.name.value){
		alert("이름을 입력해주세요");
		form.name.focus();
		return;
	}
	
	if(!form.password.value){
		alert("비밀번호를 입력해주세요");
		form.password.focus();
		return;
	}
}