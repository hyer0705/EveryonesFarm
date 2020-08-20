/**
 * 이미지 슬라이더 javascript
 */

/* 이미지 슬라이더 이벤트 */

// 리스트 항목 불러오기
$(document).ready(function(){
	var $slider_list = $("ul#slider li")
// console.log($slider_list)
	
// dot 항목 불러오기
	var $dot_list = $("div#slider-dots div.dot")
// console.log($dot_list)
	
// 리스트 항목 슬라이더 박스에서 안보이게 슬라이더 박스의 width 만큼 오른쪽으로 밀기
	$slider_list.css("left", $("div#sliderbox").css("width"))
// 새로고침시 첫번째 항목 슬라이더 박스에 보이게 하기
	$slider_list.eq(0).css("left", 0)
	
// 새로고침시 첫번째 항목 dot green 색으로 보이게 하기
	$dot_list.eq(0).css("background", "#E2CC6C")
	
// 클릭하는 동안에는 자동으로 슬라이드 되는 것 막기 포함
	var sliderClick = function(){
		$("div#sliderbox").click()
	}
	
// 3초마다 자동으로 슬라이드 넘어가기
	var tid = setInterval(sliderClick, 3000)
	
// 현재 슬라이드
	var curSlide = 0
	$("div#sliderbox").on("click", function(){
		
		// 클릭이 될 때마다 타이머 제거
		clearInterval(tid)
		
		// 타이머 다시 등록
		tid = setInterval(sliderClick, 3000)
		
		var nextSlide = curSlide + 1
		nextSlide %= $slider_list.length
		
		// 다음에 보여져야할 슬라이드를 오른쪽으로 보내기!
		$slider_list.eq(nextSlide).css("left", $("div#sliderbox").css("width"))
		
		$slider_list.eq(curSlide).animate({"left": "-=" + $("div#sliderbox").css("width")})
		$slider_list.eq(nextSlide).animate({"left": "-=" + $("div#sliderbox").css("width")})
		
		$dot_list.eq(curSlide).css("background", "#ccc")
		$dot_list.eq(nextSlide).css("background", "#E2CC6C")
		
		curSlide++
		curSlide %= $slider_list.length
	})
})
