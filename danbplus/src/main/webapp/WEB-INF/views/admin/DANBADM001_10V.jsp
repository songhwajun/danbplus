<%@ page pageEncoding="UTF-8"%>
<h2>DANBADM001_10V</h2>
<div id="layoutAuthentication">
    <div id="layoutAuthentication_content">
        <main>
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-lg-5">
                        <div class="card shadow-lg border-0 rounded-lg mt-5">
                            <div class="card-header"><h3 class="text-center font-weight-light my-4">회원등록</h3></div>
                            <div class="card-body">
                                <form>
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="inputName" type="text" placeholder="김단비"/>
                                        <label for="inputName">이름</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="inputId" type="text" placeholder="danb"/>
                                        <label for="inputId">아이디</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="inputPassword" type="password" placeholder="danb1235!!"/>
                                        <label for="inputPassword">비밀번호</label>
                                    </div>
                                    <div class="form-floating mb-3">
	                                    <select class="form-select" id="inputTeam">
							                <option value="1">개발1팀</option>
							                <option value="2">개발2팀</option>
							                <option value="3">운영팀</option>
						              	</select>
                                        <label for="inputTeam">소속</label>
                                    </div>
                                    <div class="form-floating mb-3">
	                                    <select class="form-select" id="inputRank">
							                <option value="1">인턴</option>
							                <option value="2">사원</option>
							                <option value="3">대리</option>
							                <option value="4">과장</option>
							                <option value="5">차장</option>
							                <option value="6">부장</option>
							                <option value="7">이사</option>
							                <option value="8">사장</option>
						              	</select>
                                        <label for="inputRank">직급</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="inputCompanyDt" type="date" placeholder="2022-11-09"/>
                                        <label for="inputCompanyDt">입사일</label>
                                    </div>
                                    <a class="btn btn-primary w-100 " href="#">가입하기</a>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>
</div>