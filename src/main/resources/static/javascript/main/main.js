document.addEventListener("DOMContentLoaded", function () {
    // Log_Out 버튼 클릭 이벤트 리스너
    const logOutButton = document.getElementById("top-menu__logout");
    logOutButton.addEventListener("click", function () {
        // index.html로 이동
        window.location.href = "main/main.html";
    });
});
