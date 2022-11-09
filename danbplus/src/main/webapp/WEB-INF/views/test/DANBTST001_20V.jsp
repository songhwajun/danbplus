<%@ page pageEncoding="UTF-8"%>
<div id="layoutAuthentication">
    <div id="layoutAuthentication_content">
        <main>
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-lg-5">
                        <div class="card shadow-lg border-0 rounded-lg mt-5">
                            <div class="card-header"><h3 class="text-center font-weight-light my-4">비밀번호 변경 (1회한정)</h3></div>
                            <div class="card-body">
                                <form>
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="inputEmail" type="email" placeholder="name@example.com" />
                                        <label for="inputEmail">ID</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="inputPassword" type="password" placeholder="password" />
                                        <label for="inputPassword">Password</label>
                                    </div>
                                    <div class="d-flex align-items-center justify-content-between mt-4 mb-0">
                                        <a class="btn btn-primary" href="login.jsp">Password Change</a>
                                        <a class="btn btn-outline-secondary" href="login.jsp">No Change</a>
                                    </div>
                                </form>
                                <div class="small mt-3 text-muted">
                                	※ 최초 로그인시에만 노출되는 페이지입니다.<br>
                                	※ 이후 변경을 원하실 경우 <u>관리자에게 문의</u>바랍니다.
								</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>
</div>