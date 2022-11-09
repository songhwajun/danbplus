<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 
	메뉴 밝게:  <nav class="sb-sidenav accordion sb-sidenav-light" id="sidenavAccordion">
	메뉴 어둡게: <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
 -->
<nav class="sb-sidenav accordion sb-sidenav-light" id="sidenavAccordion">
    <div class="sb-sidenav-menu">
        <div class="nav">
        	<!-- ============================================================================================================================= -->
            <!-- ===================================================== 메인 START ============================================================= -->
            <!-- ============================================================================================================================= -->
            <div class="sb-sidenav-menu-heading">Core</div>
            <a class="nav-link" href="/">
                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                메인
            </a>
        	<!-- ============================================================================================================================= -->
            <!-- ====================================================== 메인 END ============================================================== -->
            <!-- ============================================================================================================================= -->
            
            
            <div class="sb-sidenav-menu-heading">Front Test</div>
            <a class="nav-link" href="#" data-bs-toggle="collapse" data-bs-target="#frontTest" aria-expanded="false" aria-controls="frontTest">
                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                Front
                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
            </a>
            <div class="collapse show" id="frontTest" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                <nav class="sb-sidenav-menu-nested nav">
                    <a class="nav-link" href="userLogin">로그인</a>
                    <a class="nav-link" href="/userPasswordModify">비밀번호 변경</a>
                    <a class="nav-link" href="/userModify">정보수정</a>
                    <a class="nav-link" href="/sign">[관리자] 회원등록</a>
                </nav>
            </div>
            
            
            <!-- ============================================================================================================================= -->
            <!-- ==================================================== 사용자 START ============================================================= -->
            <!-- ============================================================================================================================= -->
            <div class="sb-sidenav-menu-heading">사용자</div>
            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#userVacation" aria-expanded="false" aria-controls="userVacation">
                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                휴가
                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
            </a>
            <div class="collapse" id="userVacation" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                <nav class="sb-sidenav-menu-nested nav">
                    <a class="nav-link" href="/login">휴가관리</a>
                    <a class="nav-link" href="#">휴가신청</a>
                    <a class="nav-link" href="#">휴가 변경/취소</a>
                </nav>
            </div>
            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#userCash" aria-expanded="false" aria-controls="userCash">
                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                지출결의서
                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
            </a>
            <div class="collapse" id="userCash" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                <nav class="sb-sidenav-menu-nested nav">
                    <a class="nav-link" href="#">지출결의서 내역</a>
                    <a class="nav-link" href="#">지출결의서 신청</a>
                </nav>
            </div>
            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#userNotice" aria-expanded="false" aria-controls="userNotice">
                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                공지사항
                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
            </a>
            <div class="collapse" id="userNotice" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                <nav class="sb-sidenav-menu-nested nav">
                    <a class="nav-link" href="#">공지사항 등록</a>
                </nav>
            </div>
            <!-- ============================================================================================================================= -->
            <!-- ===================================================== 사용자 END ============================================================== -->
            <!-- ============================================================================================================================= -->
            
            <!-- ============================================================================================================================= -->
            <!-- ==================================================== 승인자 START ============================================================= -->
            <!-- ============================================================================================================================= -->
            <div class="sb-sidenav-menu-heading">승인자</div>
            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#aprvVacation" aria-expanded="false" aria-controls="aprvVacation">
                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                휴가
                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
            </a>
            <div class="collapse" id="aprvVacation" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                <nav class="sb-sidenav-menu-nested nav">
                    <a class="nav-link" href="#">휴가승인/반려</a>
                    <a class="nav-link" href="#">휴가부여</a>
                </nav>
            </div>
            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#aprvCash" aria-expanded="false" aria-controls="aprvCash">
                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                지출결의서
                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
            </a>
            <div class="collapse" id="aprvCash" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                <nav class="sb-sidenav-menu-nested nav">
                    <a class="nav-link" href="#">지출결의서 승인/반려</a>
                </nav>
            </div>
            <!-- ============================================================================================================================= -->
            <!-- ===================================================== 승인자 END ============================================================== -->
            <!-- ============================================================================================================================= -->
            
            <!-- ============================================================================================================================= -->
            <!-- ==================================================== 관리자 START ============================================================= -->
            <!-- ============================================================================================================================= -->
            <div class="sb-sidenav-menu-heading">관리자</div>
            <a class="nav-link" href="#">
                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                회원등록
            </a>
            <a class="nav-link" href="#">
                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                권한부여
            </a>
            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#adminMenuMgt" aria-expanded="false" aria-controls="adminMenuMgt">
                <div class="sb-nav-link-icon"><i class="fas fa-book-open"></i></div>
                메뉴관리
                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
            </a>
            <div class="collapse" id="adminMenuMgt" aria-labelledby="headingTwo" data-bs-parent="#sidenavAccordion">
                <nav class="sb-sidenav-menu-nested nav">
                    <a class="nav-link" href="#">메뉴 노출여부</a>
                </nav>
            </div>
            <!-- ============================================================================================================================= -->
            <!-- ===================================================== 관리자 END ============================================================== -->
            <!-- ============================================================================================================================= -->
            
            <!-- ============================================================================================================================= -->
            <!-- ==================================================== DEMO START ============================================================= -->
            <!-- ============================================================================================================================= -->
            <div class="sb-sidenav-menu-heading">DEMO</div>
            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#demo_1" aria-expanded="false" aria-controls="demo_1">
                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                demo1
                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
            </a>
            <div class="collapse" id="demo_1" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                <nav class="sb-sidenav-menu-nested nav">
                    <a class="nav-link" href="#">layout-static</a>
                    <a class="nav-link" href="#">layout-sidenav-light</a>
                </nav>
            </div>
            <!-- demo1 END -->
            <!-- demo2 START -->
            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#demo_2" aria-expanded="false" aria-controls="demo_2">
                <div class="sb-nav-link-icon"><i class="fas fa-book-open"></i></div>
                demo2
                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
            </a>
            <div class="collapse" id="demo_2" aria-labelledby="headingTwo" data-bs-parent="#sidenavAccordion">
                <nav class="sb-sidenav-menu-nested nav">
                    <a class="nav-link" href="#">layout-static</a>
                </nav>
                <nav class="sb-sidenav-menu-nested nav accordion" id="sidenavAccordionPages">
                    <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#pagesCollapseAuth" aria-expanded="false" aria-controls="pagesCollapseAuth">
                        Authentication
                        <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                    </a>
                    <div class="collapse" id="pagesCollapseAuth" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordionPages">
                        <nav class="sb-sidenav-menu-nested nav">
                            <a class="nav-link" href="#">Login</a>
                            <a class="nav-link" href="#">Register</a>
                            <a class="nav-link" href="#">Forgot Password</a>
                        </nav>
                    </div>
                    <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#pagesCollapseError" aria-expanded="false" aria-controls="pagesCollapseError">
                        Error
                        <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                    </a>
                    <div class="collapse" id="pagesCollapseError" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordionPages">
                        <nav class="sb-sidenav-menu-nested nav">
                            <a class="nav-link" href="error/401.jsp">401 Page</a>
                            <a class="nav-link" href="error/404.jsp">404 Page</a>
                            <a class="nav-link" href="error/500.jsp">500 Page</a>
                        </nav>
                    </div>
                </nav>
            </div>
            <!-- demo2 END -->
            <div class="sb-sidenav-menu-heading">Addons</div>
            <a class="nav-link" href="charts.jsp">
                <div class="sb-nav-link-icon"><i class="fas fa-chart-area"></i></div>
                Charts
            </a>
            <a class="nav-link" href="tables.jsp">
                <div class="sb-nav-link-icon"><i class="fas fa-table"></i></div>
                Tables
            </a>
            <!-- ============================================================================================================================= -->
            <!-- ===================================================== DEMO END ============================================================== -->
            <!-- ============================================================================================================================= -->
        </div>
    </div>
    <div class="sb-sidenav-footer">
        <div class="small">Logged in as:</div>
        Start Bootstrap
    </div>
</nav>
