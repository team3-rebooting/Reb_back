document.addEventListener("DOMContentLoaded", () => {
    const moneyButtons = document.querySelectorAll('.div-money-button');
    const inputMoney = document.querySelector("#input-donation-money");

    moneyButtons.forEach((btn) => {
        btn.addEventListener('click', () => {
            moneyButtons.forEach(b => b.style.backgroundColor = '#f59d85');
            btn.style.backgroundColor = '#F38A6E';
            inputMoney.value = btn.value;
        });
    });

    document.querySelector("#button-ok-donation").addEventListener('click', async() => {
        let money = parseInt(inputMoney.value);
        if(!money || money <= 0){
            alert("후원 금액을 선택 또는 입력해주세요.");
            return;
        }

		try {
			//보내는 정보
		    const res = await fetch('/donation/readyOk.do', {
		        method: 'POST',
		        headers: {'Content-Type':'application/x-www-form-urlencoded'},
		        body: 'amount=' + money
		    });
			//받는 정보
		    const data = await res.json();
		    if (data.next_redirect_pc_url) {
		        window.location.href = data.next_redirect_pc_url;
		    } else {
		        alert('결제 준비 실패');
		    }
		} catch (err) {
		    console.error(err);
		    alert('결제 준비 중 오류가 발생했습니다.');
		}
    });

    document.querySelector("#button-cancle-donation").addEventListener('click', () => {
        if(confirm('정말로 취소하시겠습니까?')){
            window.location.href = '/';
        }
    });
});
