package sparta.spring_prepare.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // @ResponseBody를 따로 달지 않아도 자동으로 다 적용해준다.\
@RequestMapping("/response/rest")
public class ResponseRestController {
    // Content-Type : text/html
    // Response Body
    //{"name":"Robbie","age":95}
    @GetMapping("/json/string")
    public String helloStringJson(){
        return "{\"name\":\"Robbie\",\"age\":95}"; // 자바에서 없기에 JSON형태는 JS이다.
    }
    // [Response header]
    // Content-Type : application.json
    // [Response Body]
    // {"name":"Robbie","age":95}
    @GetMapping("/json/class")
    public Star helloClassJson(){ // 커 + e
        return new Star("Robbie" , 95); // 스프링 내부에서 자발적으로 자바 객체를 json형태로 반환해준다.
    }
}
