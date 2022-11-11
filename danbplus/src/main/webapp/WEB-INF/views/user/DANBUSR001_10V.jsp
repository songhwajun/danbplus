<%@ page pageEncoding="UTF-8"%>
<main>
    <div class="container-fluid px-4">
        <h1 class="mt-4">휴가관리</h1>
        <ol class="breadcrumb mb-4">
            <li class="breadcrumb-item"><a href="#">사용자</a></li>
            <li class="breadcrumb-item active">휴가</li>
        </ol>
        <div class="card mb-4">
            <div class="card-body">
            	홍길동님의 남은 휴가는 <span style="color: #dc3545;">15일</span> 입니다.
            </div>
        </div>
        <div class="card mb-4">
            <div class="card-header">
                <i class="fas fa-table me-1"></i>
                회원의 휴가를 관리합니다.
		        <button type="button" class="btn btn-primary btn-sm float-end" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@mdo">휴가신청</button>
            </div>
            <div class="card-body">
                <table id="datatablesSimple">
                    <thead>
                        <tr>
                        	<th>Name</th>
                            <th>Position</th>
                            <th>Office</th>
                            <th>Age</th>
                        </tr>
                    </thead>
                    <!-- 
                    <tfoot>
                        <tr>
                        	<th>휴가구분</th>
                            <th>휴가일</th>
                            <th>휴가신청 등록일</th>
                            <th>승인여부</th>
                        </tr>
                    </tfoot>
                     -->
                    <tbody>
                        <tr>
                        	<td>연차</td>
                        	<td>2022.09.26 ~ 2022.09.27</td>
                        	<td>2022.09.10 10:39:02</td>
                        	<td>대기</td>
                        </tr>
                        <tr>
                        	<td>연차</td>
                        	<td>2022.08.01 ~ 2022.08.02</td>
                        	<td>2022.07.28 12:05:22</td>
                        	<td>승인</td>
                        </tr>
                        <tr>
                        	<td>오전반차</td>
                        	<td>2022.07.15 ~ 2022.07.15</td>
                        	<td>2022.07.28 09:31:01</td>
                        	<td>승인</td>
                        </tr>
                        <tr>
                        	<td>오전반차</td>
                        	<td>2022.07.02 ~ 2022.07.02</td>
                        	<td>2022.06.05 17:59:55</td>
                        	<td>승인</td>
                        </tr>
                        <tr>
                        	<td>오전반차</td>
                        	<td>2022.04.28 ~ 2022.04.28</td>
                        	<td>2022.04.27 14:40:42</td>
                        	<td>승인</td>
                        </tr>
                        <tr>
                        	<td>연차</td>
                        	<td>2022.09.26 ~ 2022.09.27</td>
                        	<td>2022.09.10 10:39:02</td>
                        	<td>대기</td>
                        </tr>
                        <tr>
                        	<td>연차</td>
                        	<td>2022.08.01 ~ 2022.08.02</td>
                        	<td>2022.07.28 12:05:22</td>
                        	<td>승인</td>
                        </tr>
                        <tr>
                        	<td>오전반차</td>
                        	<td>2022.07.15 ~ 2022.07.15</td>
                        	<td>2022.07.28 09:31:01</td>
                        	<td>승인</td>
                        </tr>
                        <tr>
                        	<td>오전반차</td>
                        	<td>2022.07.02 ~ 2022.07.02</td>
                        	<td>2022.06.05 17:59:55</td>
                        	<td>승인</td>
                        </tr>
                        <tr>
                        	<td>오전반차</td>
                        	<td>2022.04.28 ~ 2022.04.28</td>
                        	<td>2022.04.27 14:40:42</td>
                        	<td>승인</td>
                        </tr>
                        <tr>
                        	<td>연차</td>
                        	<td>2022.09.26 ~ 2022.09.27</td>
                        	<td>2022.09.10 10:39:02</td>
                        	<td>대기</td>
                        </tr>
                        <tr>
                        	<td>연차</td>
                        	<td>2022.08.01 ~ 2022.08.02</td>
                        	<td>2022.07.28 12:05:22</td>
                        	<td>승인</td>
                        </tr>
                        <tr>
                        	<td>오전반차</td>
                        	<td>2022.07.15 ~ 2022.07.15</td>
                        	<td>2022.07.28 09:31:01</td>
                        	<td>승인</td>
                        </tr>
                        <tr>
                        	<td>오전반차</td>
                        	<td>2022.07.02 ~ 2022.07.02</td>
                        	<td>2022.06.05 17:59:55</td>
                        	<td>승인</td>
                        </tr>
                        <tr>
                        	<td>오전반차</td>
                        	<td>2022.04.28 ~ 2022.04.28</td>
                        	<td>2022.04.27 14:40:42</td>
                        	<td>승인</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</main>

<!-- 휴가신청 팝업 (모달) -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">휴가신청</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <form>
          <div class="mb-3">
            <div class="form-check form-check-inline">
			  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="1">
			  <label class="form-check-label" for="inlineRadio1">연차</label>
			</div>
			<div class="form-check form-check-inline">
			  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="2">
			  <label class="form-check-label" for="inlineRadio2">반차</label>
			</div>
          </div>
          <div class="mb-3 row">
		    <label for="staticEmail" class="col-sm-2 col-form-label">휴가일</label>
		    <div class="col-sm-10">
                <input class="form-control" id="inputBrth" type="date" placeholder="2022-11-09"/>
		    </div>
		  </div>
		  <div class="mb-3 row">
		    <label for="inputPassword" class="col-sm-2 col-form-label">사유</label>
		    <div class="col-sm-10">
	          <textarea class="form-control" id="message-text"></textarea>
		    </div>
		  </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">취소</button>
        <button type="button" class="btn btn-primary">신청하기</button>
      </div>
    </div>
  </div>
</div>