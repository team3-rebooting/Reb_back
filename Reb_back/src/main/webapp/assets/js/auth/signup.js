
let dupliButton = document.querySelector(".button-no-duplication");
let noDupliP = document.querySelector(".p-no-duplication");
let dupliP = document.querySelector(".p-duplication");
let id = document.querySelector("input[name='id']");
let pw = document.querySelector("input[name='pw']");
let pwRe = document.querySelector("input[name='pwRe']");
let birth = document.querySelector("input[name='birth']");
let addressBasic = document.querySelector("input[name='addressBasic']");
let addressAdd = document.querySelector("input[name='addressAdd']");
let userName = document.querySelector("input[name='name']");
let nickName = document.querySelector("input[name='nickName']");
let gender = document.querySelector("input[name='gender']");
let email = document.querySelector("input[name='email']");
let phoneNumber = document.querySelector("input[name='phoneNumber']");
let injungPhone = document.querySelector(".input-cert");
let injunging = document.querySelector(".button-injunging");
let inputTerms = document.querySelectorAll(".input-terms");

const buttonBack = document.querySelector('.button-back');
const buttonSignUp = document.querySelector(".button-signup");
const buttonInjung = document.querySelector(".button-injung");
const inputEssential = document.querySelectorAll(".input-essential");
const retry = document.querySelector(".button-retry");

buttonBack.addEventListener('click',()=>{
  history.back();
});

const idRegex = /^[a-z0-9]{5,19}$/;
const pwRegex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[!@#$])[A-Za-z\d!@#$]{8,20}$/;
const emailRegex = /^[a-z0-9._%+\-]+@[a-z0-9.\-]+\.[a-z]{2,}$/;
let pwSameOrNo = true;

buttonSignUp.addEventListener("click", (e) => {
  
  if (confirm("회원가입 하시겠습니까?")) {
    let isWrite = true;
    for (let i = 0; i < inputEssential.length; i++) {
      if (!inputEssential[i].value) {
        isWrite = false;
        break;
      }
    }
    if (injungPhone.value !== '111111') {
      isWrite = false;
    }
    if (nickName.value === '가나다') {
      isWrite = false;
    }
    for (let z = 0; z < inputTerms.length; z++) {
      if (!inputTerms[z].checked) {
        isWrite = false;
        break;
      }
    }
    if(!pwSameOrNo){
      isWrite = false;
    }
    if (isWrite) {
      alert("회원가입 완료");
      location.href = "./../../main.html";
    } else {
      alert("필수 입력 확인해주세요");
    }
  } else {
    e.preventDefault();
  }
});



id.addEventListener('blur', () => {
  let nearWarning = id.closest(".div-signup");
  let warning = nearWarning.querySelector(".p-warning");
  if (!idRegex.test(id.value)) {
    warning.style.display = "block";
  } else {
    warning.style.display = "none";
  }
});

pw.addEventListener('blur', () => {
  let nearWarning = pw.closest(".div-signup");
  let warning = nearWarning.querySelector(".p-warning");
  if (!pwRegex.test(pw.value)) {
    warning.style.display = "block";
  } else {
    warning.style.display = "none";
  }
});

pwRe.addEventListener('blur',()=>{
  let nearWarning = pw.closest(".div-signup");
  let nosame = nearWarning.querySelector(".p-nosame");
  let same = nearWarning.querySelector(".p-same");
  if(pw.value.length !== 0){
    if(pw.value !== pwRe.value){
      nosame.style.display = "block";
      same.style.display = "none";
      pwSameOrNo = false;
    }
    else{
      nosame.style.display = "none";
      same.style.display = "block";
      pwSameOrNo = true;   
    }

  }
});

birth.addEventListener('blur', () => {
  let nearWarning = birth.closest(".div-signup");
  let warning = nearWarning.querySelector(".p-warning");
  if (!birth.value) {
    warning.style.display = "block";
  } else {
    warning.style.display = "none";
  }
});

addressBasic.addEventListener('blur', () => {
  let nearWarning = addressBasic.closest(".div-signup");
  let warning = nearWarning.querySelector(".p-warning");
  if (!addressBasic.value) {
    warning.style.display = "block";
  } else {
    warning.style.display = "none";
  }
});

userName.addEventListener('blur', () => {
  let nearWarning = userName.closest(".div-signup");
  let warning = nearWarning.querySelector(".p-warning");
  if (!userName.value) {
    warning.style.display = "block";
  } else {
    warning.style.display = "none";
  }
});

gender.addEventListener('blur', () => {
  let nearWarning = gender.closest(".div-signup");
  let warning = nearWarning.querySelector(".p-warning");
  if (!gender.value) {
    warning.style.display = "block";
  } else {
    warning.style.display = "none";
  }
});

nickName.addEventListener('blur', () => {
  let nearWarning = nickName.closest(".div-signup");
  let warning = nearWarning.querySelector(".p-warning");
  if (!nickName.value) {
    warning.style.display = "block";
  } else {
    warning.style.display = "none";
  }
});

phoneNumber.addEventListener('blur', () => {
  let nearWarning = phoneNumber.closest(".div-signup");
  let warning = nearWarning.querySelector(".p-warning");
  if (!phoneNumber.value) {
    warning.style.display = "block";
  } else {
    warning.style.display = "none";
  }
});

dupliButton.addEventListener('click', () => {
  if(nickName.value.length !== 0){
    if (nickName.value === '가나다') {
      noDupliP.style.display = 'none';
      dupliP.style.display = 'block';
    } else {
      noDupliP.style.display = 'block';
      dupliP.style.display = 'none';
    }
  }
});

buttonInjung.addEventListener('click', () => { 
    alert("인증번호 전송");
    phoneNumber.readOnly = true;
    phoneNumber.style.backgroundColor = "#d9d9d9";
    buttonInjung.disabled = true;
    buttonInjung.style.color = "#d9d9d9";
    injungPhone.readOnly = false;
    injungPhone.style.backgroundColor = "white";
    injunging.disabled = false;
    injunging.style.color = "white";
    retry.disabled = false;
    retry.style.color = "white";
});

injunging.addEventListener("click", () => {
  if (injungPhone.value === '111111') {
    injungPhone.readOnly = true;
    injungPhone.style.backgroundColor = "#d9d9d9";
    injunging.disabled = true;
    injunging.style.color = "#d9d9d9";
    alert("인증 성공");
  } else {
    alert("인증번호가 맞지 않습니다");
  }
});

retry.addEventListener('click', () => {
  phoneNumber.readOnly = false;
  phoneNumber.style.backgroundColor = "white";
  buttonInjung.disabled = false;
  buttonInjung.style.color = "white";
  injungPhone.readOnly = true;
  injungPhone.style.backgroundColor = "#d9d9d9";
  injungPhone.value = "";
  injunging.disabled = true;
  injunging.style.color = "#d9d9d9";
  retry.disabled = true;
  retry.style.color = "#d9d9d9";
  phoneNumber.value = "";
});


email.addEventListener('blur', () => {
  let nearWarning = email.closest(".div-signup");
  let warning = nearWarning.querySelector(".p-warning");
  if (!emailRegex.test(email.value)) {
    warning.style.display = "block";
  } else {
    warning.style.display = "none";
  }
});