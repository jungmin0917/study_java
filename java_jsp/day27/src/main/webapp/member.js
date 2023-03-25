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
	
	// 아이디에 한글이 있으면 안 됨
	if(hangleCheck.test(form.id.value)){
		alert("아이디에 한글을 사용할 수 없습니다.");
		form.id.focus();
		return;
	}
	
	// 비밀번호 유효성을 정규식으로 검사해보자
	// 8자리 이상, 
	let pattern = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[\!\@\#\$\%\^\&\*\(\)]).{8,}$/ // 문자열이 적어도 하나 이상의 대문자를 포함하는지 확인. 정규식 객체 선언
	let hangleCheck = /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
	
	// 정규식 객체에는 test() 메소드가 있음. 주어진 문자열이 정규식 패턴과 일치하는지 여부를 불리언 값으로 반환함
	if(!pattern.test(form.password.value)){ 
		alert("비밀번호는 8자리 이상이어야 하며, 대문자/소문자/숫자/특수문자 모두 포함해야 합니다.");
		form.password.focus();
		return;
	}
	
	// 동일한 문자를 4번 연속으로 쓰지 못하게 하는 것
	if(/(.)\1\1\1/.test(form.password.value)){
		alert("같은 문자를 4번 이상 연속으로 사용하실 수 없습니다.");
		form.password.focus();
		return;
	}
	
	// 비밀번호 안에 아이디가 있는지 확인
	// haystack.search(needle) 과 같이 사용하면 되는데, 인수로는 일반 문자열이나 정규표현식이 온다
	// 찾는 문자열이 있을 시 찾은 인덱스를 반환하고, 없으면 -1을 반환한다
	if(form.password.value.search(form.id.value) !== -1){ // 찾았다는 뜻
		alert("비밀번호에 아이디를 포함할 수 없습니다.");
		form.password.focus();
		return;
	}
	
	// 비밀번호에 한글이 있으면 안 됨
	if(hangleCheck.test(form.password.value)){
		alert("비밀번호에 한글을 사용할 수 없습니다.");
		form.password.focus();
		return;
	}
	
	// 비밀번호에 공백문자를 포함할 수 없다.
	if(form.password.value.search(/\s/) !== -1){
		alert("비밀번호에 공백문자를 사용할 수 없습니다.");
		form.password.focus();
		return;
	}
	
	// 비밀번호와 비밀번호 확인이 같은지 확인
	if(form.password.value !== form.password_re.value){
		alert("비밀번호와 비밀번호 확인이 다릅니다.");
		form.password.focus();
		return;
	}

}