document.addEventListener("DOMContentLoaded", function () {
    // notice 버튼 클릭 이벤트 리스너
    const noticeButton = document.getElementById("top-menu__notice");
    noticeButton.addEventListener("click", function () {
        // 공지게시판 목록으로 이동
        window.location.href = "notice-list.html";
    });
});
