package projet.comsuper.free;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FreeController {

    @GetMapping("/freewrite")
    public String freeWrite() {
        return "free/free-write";
    }

    @GetMapping("/freelist")
    public String freeList() {
        return "free/free-list";
    }
}
