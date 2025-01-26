package sparta.spring_prepare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "스프링 입문, 컨트롤러까지 왔다."; // view정보 전달
    }
    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return "GET Method 요청";
    }
    @PostMapping("/post")
    @ResponseBody
    public String post(){
        return "POST Method 요청";
    }
    @PutMapping("/put")
    @ResponseBody
    public String put(){
        return "PUT Method 요청";
    }
    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        return "DELETE Method 요청";
    }
}
