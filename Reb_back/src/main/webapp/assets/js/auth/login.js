const findIdModal = document.querySelector(".p-findid");
const closeFindIdModal = document.querySelector(".button-id-x");
const idModal = document.querySelector(".modal-id-background");

const idModalEnd = document.querySelector(".modal-id-end-background");
const pwModalEnd = document.querySelector(".modal-pw-end-background");
const goLoginIdBtn = document.querySelector(".button-modal-find-end-id");
const goLoginPwBtn = document.querySelector(".button-modal-find-end-pw");
const buttonIdFind = document.querySelector(".button-modal-find-id");

const findPwModal = document.querySelector(".p-findpw");
const closeFindPwModal = document.querySelector(".button-pw-x");
const pwModal = document.querySelector(".modal-pw-background");
const buttonPwFind = document.querySelector(".button-modal-find-pw");

const loginBtn = document.querySelector(".button-login");

const inputModalNameId = document.querySelector(".input-modal-name-id");
const inputModalPnId = document.querySelector(".input-modal-pn-id");
const inputModalNamePw = document.querySelector(".input-modal-name-pw");
const inputModalPnPw = document.querySelector(".input-modal-pn-pw");
const inputModalIdPw = document.querySelector(".input-modal-id-pw");

const inputPhoneNumberId = document.querySelector("input[name='modalIdPhoneInjung']");
const idPhoneNumber = document.querySelector("input[name='modalIdPhone']");
const buttonInjung = document.querySelector(".button-injung-id");
const buttonInjungDoId = document.querySelector(".button-injung-do-id");
const buttonRetryId = document.querySelector(".button-retry-id");

const inputPhoneNumberPw = document.querySelector("input[name='modalPwPhoneInjung']");
const pwPhoneNumber = document.querySelector("input[name='modalPwPhone']");
const buttonInjungPw = document.querySelector(".button-injung-pw");
const buttonInjungDoPw = document.querySelector(".button-injung-do-pw");
const buttonRetryPw = document.querySelector(".button-retry-pw");


findIdModal.addEventListener('click', () => {
  idModal.style.display = "flex";
});

closeFindIdModal.addEventListener('click', () => {
  idModal.style.display = "none";
});

buttonIdFind.addEventListener('click', () => {
  if (inputModalNameId.value === '홍길동' && inputModalPnId.value === '01011112222'&& inputPhoneNumberId.value === '111111') {
    idModal.style.display = "none";
    idModalEnd.style.display = "flex";
    inputModalNameId.value = "";
    inputModalPnId.value = "";
    inputModalPnId.style.backgroundColor = 'white';
    inputModalPnId.readOnly = false;
    buttonInjung.style.backgroundColor = '#F38A6E';
    buttonInjung.style.color = 'white';
    buttonInjung.disabled = false;
    inputPhoneNumberId.value = "";
  }
  else {
    alert("올바르지 못한 이름 혹은 전화번호입니다");
    inputModalNameId.value = "";
    inputModalPnId.value = "";
    idPhoneNumber.readOnly = false;
    idPhoneNumber.style.backgroundColor = "white";
    buttonInjung.disabled = false;
    buttonInjung.style.backgroundColor = "#F38A6E";
    buttonInjung.style.color = "white";
    buttonInjungDoId.disabled = true;
    buttonInjungDoId.style.color = "black";
    buttonInjungDoId.style.backgroundColor = "#d9d9d9"
    buttonRetryId.disabled = true;
    buttonRetryId.style.color = "black";
    buttonRetryId.style.backgroundColor = "#d9d9d9";
    idPhoneNumber.value = "";
    inputPhoneNumberId.readOnly = true;
    inputPhoneNumberId.style.backgroundColor = "#d9d9d9";
    inputPhoneNumberId.value = "";
  }
});

//여기부터 pw 모달

goLoginIdBtn.addEventListener('click', () => {
  idModalEnd.style.display = "none";
});
goLoginPwBtn.addEventListener('click', () => {
  pwModalEnd.style.display = "none";
});


findPwModal.addEventListener('click', () => {
  pwModal.style.display = "flex";
});

closeFindPwModal.addEventListener('click', () => {
  pwModal.style.display = "none";
});

buttonPwFind.addEventListener('click', () => {
  if (inputModalNamePw.value === '홍길동' && inputModalPnPw.value === '01011112222' && inputModalIdPw.value === 'user') {
    pwModal.style.display = "none";
    pwModalEnd.style.display = "flex";
    inputModalNamePw.value = "";
    inputModalPnPw.value = "";
    inputModalPnPw.style.backgroundColor = 'white';
    inputModalPnPw.readOnly = false;
    buttonInjungPw.style.backgroundColor = '#F38A6E';
    buttonInjungPw.style.color = 'white';
    buttonInjungPw.disabled = false;
    inputPhoneNumberPw.value = "";
    inputModalIdPw.value = "";
  }
  else {
    alert("올바르지 못한 이름 혹은 전화번호 혹은 아이디입니다");
    inputModalNamePw.value = "";
    inputModalPnPw.value = "";
    inputModalIdPw.value = "";
    pwPhoneNumber.readOnly = false;
    pwPhoneNumber.style.backgroundColor = "white";
    buttonInjungPw.disabled = false;
    buttonInjungPw.style.backgroundColor = "#F38A6E";
    buttonInjungPw.style.color = "white";
    buttonInjungDoPw.disabled = true;
    buttonInjungDoPw.style.color = "black";
    buttonInjungDoPw.style.backgroundColor = "#d9d9d9"
    buttonRetryPw.disabled = true;
    buttonRetryPw.style.color = "black";
    buttonRetryPw.style.backgroundColor = "#d9d9d9";
    pwPhoneNumber.value = "";
    inputPhoneNumberPw.readOnly = true;
    inputPhoneNumberPw.style.backgroundColor = "#d9d9d9";
    inputPhoneNumberPw.value = "";
  }
});

loginBtn.addEventListener('click', (e) => {
  let inputId = document.querySelector(".input-id").value;
  let inputPw = document.querySelector(".input-pw").value;
  if (inputId.length === 0 || inputPw.length === 0) {
    alert("로그인 실패");
    e.preventDefault();
  }
  else if (inputId === 'user' && inputPw === '1234') {
    location.href = "./../../main.html";
  }
  else {
    alert("로그인 실패");
    e.preventDefault();
  }
});


buttonInjung.addEventListener('click', () => {
  if (inputModalPnId.value.length !== 0) {
    alert("인증번호 전송");
    idPhoneNumber.readOnly = true;
    idPhoneNumber.style.backgroundColor = "#d9d9d9";
    buttonInjung.disabled = true;
    buttonInjung.style.color = "black";
    buttonInjung.style.backgroundColor = "#d9d9d9";
    inputPhoneNumberId.readOnly = false;
    inputPhoneNumberId.style.backgroundColor = "white";
    inputPhoneNumberId.disabled = false;
    buttonInjungDoId.disabled = false;
    buttonInjungDoId.style.color = "white";
    buttonInjungDoId.style.backgroundColor = "#F38A6E"
    buttonRetryId.disabled = false;
    buttonRetryId.style.color = "white";
    buttonRetryId.style.backgroundColor = "#F38A6E";
  }
  else{
    alert("올바른 전화번호 입력방식이 아닙니다");
  }
});

buttonInjungDoId.addEventListener("click", () => {
  if (inputPhoneNumberId.value === '111111') {
    inputPhoneNumberId.readOnly = true;
    inputPhoneNumberId.style.backgroundColor = "#d9d9d9";
    buttonInjungDoId.disabled = true;
    buttonInjungDoId.style.color = "black";
    buttonInjungDoId.style.backgroundColor = "#d9d9d9"
    alert("인증 성공");
  } else {
    alert("인증번호가 맞지 않습니다");
  }
});

buttonRetryId.addEventListener('click', () => {
  idPhoneNumber.readOnly = false;
  idPhoneNumber.style.backgroundColor = "white";
  buttonInjung.disabled = false;
  buttonInjung.style.backgroundColor = "#F38A6E";
  buttonInjung.style.color = "white";
  buttonInjungDoId.disabled = true;
  buttonInjungDoId.style.color = "black";
  buttonInjungDoId.style.backgroundColor = "#d9d9d9"
  buttonRetryId.disabled = true;
  buttonRetryId.style.color = "black";
  buttonRetryId.style.backgroundColor = "#d9d9d9";
  idPhoneNumber.value = "";
  inputPhoneNumberId.readOnly = true;
  inputPhoneNumberId.style.backgroundColor = "#d9d9d9";
  inputPhoneNumberId.value = "";
});


buttonInjungPw.addEventListener('click', () => {
  if (inputModalPnPw. value.length !== 0) {
  alert("인증번호 전송");
  pwPhoneNumber.readOnly = true;
  pwPhoneNumber.style.backgroundColor = "#d9d9d9";
  buttonInjungPw.disabled = true;
  buttonInjungPw.style.color = "black";
  buttonInjungPw.style.backgroundColor = "#d9d9d9";
  inputPhoneNumberPw.readOnly = false;
  inputPhoneNumberPw.style.backgroundColor = "white";
  inputPhoneNumberPw.disabled = false;
  buttonInjungDoPw.disabled = false;
  buttonInjungDoPw.style.color = "white";
  buttonInjungDoPw.style.backgroundColor = "#F38A6E"
  buttonRetryPw.disabled = false;
  buttonRetryPw.style.color = "white";
  buttonRetryPw.style.backgroundColor = "#F38A6E";
  }
  else{
    alert("올바른 전화번호 입력방식이 아닙니다");
  }
});

buttonInjungDoPw.addEventListener("click", () => {
  if (inputPhoneNumberPw.value === '111111') {
    inputPhoneNumberPw.readOnly = true;
    inputPhoneNumberPw.style.backgroundColor = "#d9d9d9";
    buttonInjungDoPw.disabled = true;
    buttonInjungDoPw.style.color = "black";
    buttonInjungDoPw.style.backgroundColor = "#d9d9d9"
   
    alert("인증 성공");
  } else {
    alert("인증번호가 맞지 않습니다");
  }
});

buttonRetryPw.addEventListener('click', () => {
  pwPhoneNumber.readOnly = false;
  pwPhoneNumber.style.backgroundColor = "white";
  buttonInjungPw.disabled = false;
  buttonInjungPw.style.backgroundColor = "#F38A6E";
  buttonInjungPw.style.color = "white";
  buttonInjungDoPw.disabled = true;
  buttonInjungDoPw.style.color = "black";
  buttonInjungDoPw.style.backgroundColor = "#d9d9d9"
  buttonRetryPw.disabled = true;
  buttonRetryPw.style.color = "black";
  buttonRetryPw.style.backgroundColor = "#d9d9d9";
  pwPhoneNumber.value = "";
  inputPhoneNumberPw.readOnly = true;
  inputPhoneNumberPw.style.backgroundColor = "#d9d9d9";
  inputPhoneNumberPw.value = "";
});