function login() {
    // 여기에 로그인 처리 로직을 작성하세요.
    alert('로그인 처리');
}

function toggleLoginForm() {
    var form = document.getElementById('login-form');
    form.style.display = form.style.display === 'block' ? 'none' : 'block';
}

function checkUserId() {
    var username = document.getElementById('username').value;
    fetch('/checkUserid?username=' + encodeURIComponent(username)) // GET 요청 사용
        .then(response => response.json())
        .then(data => {
            var resultDiv = document.getElementById('usernameResult');
            if (data.isAvailable) {
                resultDiv.textContent = '사용 가능한 ID입니다.';
                resultDiv.style.color = 'green';
            } else {
                resultDiv.textContent = '이미 존재하는 ID입니다.';
                resultDiv.style.color = 'red';
            }
        })
        .catch(error => {
            console.error('Error:', error);
        });
}
