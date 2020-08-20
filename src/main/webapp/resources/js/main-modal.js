/**
 * 모달창 구현 - 이용약관, 개인정보처리방침, 이메일 무단수집 거부
 */

/* 모달창 구현~ */

// GET the modal
var modal = document.getElementById("termsOfUseModal")

// GET the modal
var pmodal = document.getElementById("privacyPolicyModal")
var emodal = document.getElementById("emailModal")

// GET the button that opens the modal
var btn = document.getElementById("termsOfUse")

// GET the button that opens the modal
var pbtn = document.getElementById("privacyPolicy")
var ebtn = document.getElementById("emailModalBtn")

// GET the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0]

var pspan = document.getElementsByClassName("close")[1]
var espan = document.getElementsByClassName("close")[2]

// When the user clicks on the button, open the modal
btn.onclick = function() {
	modal.style.display = "block"
}

pbtn.onclick = function() {
	pmodal.style.display = "block"
}

ebtn.onclick = function() {
	emodal.style.display = "block"
}

// When the user clicks on <span> (x), close the modal
span.onclick = function(){
	modal.style.display = "none"
}

pspan.onclick = function(){
	pmodal.style.display = "none"
}
espan.onclick = function(){
	emodal.style.display = "none"
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(e){
	if(e.target == modal){
		modal.style.display ="none"
	} else if(e.target == pmodal){
		pmodal.style.display ="none"
	} else if(e.target == emodal) {
		emodal.style.display ="none"
	}
}