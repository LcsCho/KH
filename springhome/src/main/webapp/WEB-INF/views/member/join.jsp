<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<script src="/js/memberJoin.js"></script>
<script>

</script>

<form action="join" method="post" autocomplete="off" onsubmit="return checkForm();">
	<div class="container w-500">
        <div class="row">
            <h1>회원 가입</h1>
        </div>
        <div class="row left">
            <!-- 
                라벨에는 for를 이용하여 특정 대상을 연결시킬 수 있다 
                for="대상ID"
                체크박스 등도 선택하게 만들 수 있다(디자인적으로 활용)
            -->
            <label for="id-input">
            	아이디 
            	<i class="fa-solid fa-asterisk red"></i>
           	</label>
            <input type="text" name="memberId" class="form-input w-100"
                        id="id-input"
                        placeholder="영문 소문자+숫자 5~20자 이내" onblur="checkMemberId();">
            <div class="success-feedback">멋진 아이디입니다!</div>
            <div class="fail-feedback">아이디가 형식에 맞지 않습니다</div>
        </div>
        <div class="row left">
            <label>
            	비밀번호 
            	<i class="fa-solid fa-asterisk red"></i>
           	</label>
            <input type="password" name="memberPw" class="form-input w-100"
                        placeholder="영문 대소문자+숫자+특수문자 반드시 포함 8~16자" onblur="checkMemberPw1();">
            <div class="success-feedback">올바른 비밀번호 형식입니다</div>
            <div class="fail-feedback">잘못된 비밀번호 형식입니다</div>
        </div>
               <div class="row left">
            <label>
            	비밀번호 확인
            	<i class="fa-solid fa-asterisk red"></i>
           	</label>
            <input type="password" name="memberPwCheck" class="form-input w-100"
                        placeholder="비밀번호를 다시 입력해주세요" onblur="checkMemberPw2();">
            <div class="success-feedback">비밀번호가 일치합니다</div>
            <div class="fail-feedback">비밀번호가 일치하지 않습니다</div>
            <div class="fail2-feedback">비밀번호를 먼저 작성하십시오</div>
        </div>
        <div class="row left">
            <label>
	            닉네임 
	            <i class="fa-solid fa-asterisk red"></i>
            </label>
            <input type="text" name="memberNickname" class="form-input w-100"
                        placeholder="한글 또는 숫자 2~10자 이내" onblur="checkMemberNickname();">
            <div class="success-feedback">올바른 닉네임 형식입니다</div>
            <div class="fail-feedback">잘못된 닉네임 형식입니다</div>
        </div>
        <div class="row left">
            <label>이메일</label>
            <input type="text" name="memberEmail" class="form-input w-100"
                        placeholder="testuser@kh.com" onblur="checkMemberEmail();">
            <div class="fail-feedback">이메일 형식이 잘못되었습니다</div>
        </div>
        <div class="row left">
            <label>연락처</label>
            <input type="tel" name="memberContact" class="form-input w-100"
                        placeholder="- 제외하고 입력" onblur="checkMemberContact();">
            <div class="fail-feedback">전화번호 형식이 올바르지 않습니다</div>
        </div>
        <div class="row left">
            <label>생년월일</label>
            <input type="date" name="memberBirth" class="form-input w-100" onblur="checkMemberBirth();">
        	<div class="fail-feedback">잘못된 날짜를 선택하셨습니다</div>
        </div>
        <div class="row left">
            <label class="mb-10" style="display: block;">주소</label>
            <input type="text" class="form-input" name="memberPost" placeholder="우편번호" style="width:8em;"
            onblur="checkMemberAddress();">
            <button type="button" class="btn">
            	<i class="fa-solid fa-magnifying-glass"></i>
            	검색
            </button>
            <input type="text" class="form-input w-100 mt-10" name="memberAddr1" placeholder="기본주소" onblur="checkMemberAddress();">
            <input type="text" class="form-input w-100 mt-10" name="memberAddr2" placeholder="상세주소" onblur="checkMemberAddress();">
        	<div class="fail-feedback">모든 주소를 작성해주세요</div>
        </div>
        <div class="row">
            <button type="submit" class="btn btn-positive w-100">
            	<i class="fa-solid fa-right-to-bracket"></i>
            	회원가입
            </button>
        </div>
    </div>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>