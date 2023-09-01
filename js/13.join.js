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

function checkMemberPw() {
    var input = document.querySelector("[name=memberPw]");
    var regex = /^[A-Za-z0-9!@#$]{8,16}$/;

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
    return result1 && result2; 
}