<%@ page pageEncoding="UTF-8"%>
<div id="layoutAuthentication">
    <div id="layoutAuthentication_content">
        <main>
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-lg-5">
                        <div class="card shadow-lg border-0 rounded-lg mt-5">
                            <div class="card-header"><h3 class="text-center font-weight-light my-4">회원 정보수정</h3></div>
                            <div class="card-body">
                                <form>
                                    <div class="form-floating mb-3">
                                        <input class="form-control" disabled="disabled" id="inputEmail" type="text" placeholder="id" value="danb111"/>
                                        <label for="inputEmail">ID</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                       <!--  <input class="form-control" id="inputGender" type="text" placeholder="여성" /> -->
	                                    <select class="form-select" id="inputGender" required="">
							                <option value="1">남성</option>
							                <option value="2">여성</option>
						              	</select>
                                        <label for="inputGender">성별</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="inputBrth" type="date" placeholder="2022-11-09"/>
                                        <label for="inputBrth">생년월일</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="inputPhone" type="tel" placeholder="010-0000-0000"/>
                                        <label for="inputPhone">휴대폰번호</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="inputEmail" type="email" placeholder="email@danbplus.com"/>
                                        <label for="inputEmail">개인 이메일</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="inputEamil2" type="email" placeholder="email@danbplus.com"/>
                                        <label for="inputEamil2">사내 이메일</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="inputCompanyDt" type="date" disabled="disabled" value="2022-11-09" />
                                        <label for="inputCompanyDt">입사일</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="inputCompanyModifyDt" type="date" placeholder="정규직 전환일"/>
                                        <label for="inputCompanyModifyDt">정규직 전환일</label>
                                    </div>
                                    <button class="w-100 btn btn-primary btn-lg" type="submit">수정하기</button>
                                </form>
                                <div class="small mt-3 text-muted">
                                	※ 입사일, 정규직 전환일은 최초 1회만 변경이 가능하며, 이후 변경을 원하실 경우 <u>관리자에게 문의</u>바랍니다.
								</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>
</div>