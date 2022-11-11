<%@ page pageEncoding="UTF-8"%>
<h2>DANBPOP001_10V</h2>

<button type="button" class="btn btn-primary btn-sm float-end" data-bs-toggle="modal" data-bs-target="#exampleModal2" data-bs-whatever="@mdo">휴가변경/취소</button>
<button type="button" class="btn btn-primary btn-sm float-end" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@mdo">휴가신청</button>


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
                <input class="form-control float-start w-50" id="inputBrth" type="date" placeholder="2022-11-09"/>
                <input class="form-control float-end w-50" id="inputBrth" type="date" placeholder="2022-11-09"/>
		    </div>
		    
		    
		    
		    <div class="col-sm-10">
			    <div class="form-floating">
	                <input class="form-control" id="startDt" type="date" placeholder="시작일"/>
	                <label for="startDt">시작일</label>
	            </div>
			    <div class="form-floating">
	                <input class="form-control" id="endDt" type="date" placeholder="종료일"/>
	                <label for="endDt">종료일</label>
	            </div>
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

<!-- 휴가변경/취소 팝업 (모달) -->
<div class="modal fade" id="exampleModal2" tabindex="-1" aria-labelledby="exampleModal2Label" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModal2Label">휴가신청</h5>
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
			  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="2" checked="checked">
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