package sparta.spring_prepare.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/html")
public class HtmlController {

    private static long visitCount = 0;

    @GetMapping("/static-hello")
    public String hello() {
        return "hello.html";
    } // 1. 타임리프를 주석하면 알 수 있다. 2. url에 직접 접근
    @GetMapping("/redirect")
    public String htmlStatic(){
        return "redirect:/hello.html"; // 직접 보면 html/redirect으로 보인다. status code : 300
    }
    @GetMapping("/templates")
    public String htmlTemplates(){
        return "hello";
    } // 동적 템플릿
    @GetMapping("/dynamic")
    public String htmlDynamic(Model model){
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-visit";
    }


}
