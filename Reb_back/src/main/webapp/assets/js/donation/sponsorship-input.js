const moneyButtons = document.querySelectorAll('.div-money-button');
const inputMoney = document.querySelector("#input-donation-money");


document.querySelector("#button-cancle-donation").addEventListener('click', ()=>{
    cancelDonation();
});

document.querySelector("#button-ok-donation").addEventListener('click', ()=>{
    okDonation();
});

moneyButtons.forEach((m) => {
    m.addEventListener('click', (e) => {
        const pushed = e.target.value;

        moneyButtons.forEach((item) => {
            item.style.backgroundColor = '#f59d85';
            item.value = item.value.split('-')[0];
        })
        

        if (!pushed.includes('-pushed')) {
            m.style.backgroundColor = '#F38A6E';
            inputMoney.value = '';
            inputMoney.setAttribute('disabled', true);
            e.target.value = pushed + '-pushed';
        } else {
            e.target.value = '';
            m.style.backgroundColor = '#f59d85';
            inputMoney.removeAttribute('disabled');

            e.target.value = pushed.split('-')[0];
        }
    })
});

function okDonation(){

    let money = 0;

    if(inputMoney.getAttribute('disabled')){
        moneyButtons.forEach((item) => {
            if(item.value.includes('pushed')){
                money = item.value.split('-')[0];
            }
        })
    }else{
        if(inputMoney.value !== '')
            money = inputMoney.value;
    }

    if(money === 0){
        alert('후원 금액을 선택 또는 입력해주세요.');
        return;
    }

    const confirmMsg = 
`${money}원 후원을 선택하셨습니다.
후원하시겠습니까?`;

    if(confirm(confirmMsg)){
        movePage('sponsorship-complete.html');
    }
}

function cancelDonation(){
    if(confirm(`정말로 취소하시겠습니까?`))
        movePage('./../../main.html');
}

function movePage(href) {
    location.href = href;
}