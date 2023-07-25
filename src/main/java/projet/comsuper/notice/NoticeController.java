package projet.comsuper.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoticeController {

    @GetMapping("/noticewrite")
    public String noticeWrite() {
        return "notice/notice-write";
    }

    @GetMapping("/noticelist")
    public String noticeList() {
        return "notice/notice-list";
    }
}
