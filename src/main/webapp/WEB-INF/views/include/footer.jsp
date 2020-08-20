<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- footer -->
<footer class="main__footer">
	<div class="footer__comp-info">
		<div>(주)FarmCompany &copy; Copyright <span class="currYear"></span></div>
		<div>회사주소: 서울특별시 강남구 테헤란로 10길 9 그랑프리 빌딩 4F</div>
		<div>대표전화: 010-0309-7005</div>
		<div>문의메일: everyonesFarm@gmail.com</div>
	</div>
	<div class="footer__terms">
		<span>이용약관</span><span>개인정보처리방침</span><span>이메일 무단수집 거부</span><span>공지사항&자주묻는질문</span>
	</div>
</footer>

<script type="text/javascript">
/* 현재 년도를 가져와서 보여준다. */
var currYear = new Date().getFullYear()
document.querySelector(".currYear").innerHTML = currYear
</script>
</body>
</html>