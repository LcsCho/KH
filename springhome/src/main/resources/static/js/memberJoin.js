function checkMemberId() {
	var input = document.querySelector("[name=memberId]");

	var regex = /^[a-z0-9]{5,20}$/;

	input.classList.remove("success", "fail");
	if (regex.test(input.value)) {
		input.classList.add("success");
		return true;
	}
	else {
		input.classList.add("fail");
		return false;
	}
}

function checkMemberPw1() {
	var input = document.querySelector("[name=memberPw]");
	var regex = /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,16}$/;

	input.classList.remove("success", "fail");
	if (regex.test(input.value)) {
		input.classList.add("success");
		return true;
	}
	else {
		input.classList.add("fail");
		return false;
	}
}
function checkMemberPw2() {
	var pw = document.querySelector("[name=memberPw]");
	var pwCheck = document.querySelector("[name=memberPwCheck");

	//var isValid = 비밀번호가 1글자이상 입력되어 있고 두 입력값이 같으면;
	var isValid = pw.value.length >= 1 && pw.value == pwCheck.value;

	pwCheck.classList.remove("success", "fail", "fail2");
	if (pw.value.length == 0) {
		pwCheck.classList.add("fail2");
	}
	else if (isValid) {
		pwCheck.classList.add("success");
	}
	else {
		pwCheck.classList.add("fail");
	}
}

function checkMemberNickname() {
	var input = document.querySelector("[name=memberNickname]");
	var regex = /^[가-힣0-9]{2,10}$/;

	input.classList.remove("success", "fail");
	if (regex.test(input.value)) {
		input.classList.add("success");
		return true;
	}
	else {
		input.classList.add("fail");
		return false;
	}
}

// 폼 검사는 기존 검사 함수를 불러 결과를 받아 반환하도록 구현
function checkForm() {
	// return checkMemberId() && checkMemberPw();
	var result1 = checkMemberId();
	var result2 = checkMemberPw();
	var result3 = checkMemberNickname();
	return result1 && result2 && result3;
}