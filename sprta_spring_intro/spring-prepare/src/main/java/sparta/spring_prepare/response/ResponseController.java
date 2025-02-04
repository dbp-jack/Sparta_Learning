package sparta.spring_prepare.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // view 반환
@RequestMapping("/response")
public class ResponseController {
    // Content-Type : text/html
    // Response Body
    //{"name":"Robbie","age":95}
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson(){
        return "{\"name\":\"Robbie\",\"age\":95}"; // 자바에서 없기에 JSON형태는 JS이다.
    }
    // [Response header]
    // Content-Type : application.json
    // [Response Body]
    // {"name":"Robbie","age":95}
    @GetMapping("/josn/class")
    @ResponseBody // html이 아니라 데이터를 반환하려고 하는거다라고 알려주고 있다.
    public Star helloClassJson(){ // 커 + e
        return new Star("Robbie" , 95); // 스프링 내부에서 자발적으로 자바 객체를 json형태로 반환 해준다.
    }
}
