package sparta.spring_prepare.request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello/request")
public class RequestController {
    @GetMapping("/form/html")
    public String helloForm(){
        return "hello-request-form";
    }
    // GET http://localhos:8080/hello/request/star/Robbie/age/95
    // 경로에다가 이렇게 데이터를 넣는다...
    @GetMapping("/star/{name}/age/{age}")
    @ResponseBody
    public String helloRequestPath(@PathVariable String name, @PathVariable int age) { // URL 경로에 포함된 값을 변수로 받아오기 위해 사용하는 어노테이션 - 프론트와 소통해야 한다.
        return String.format("Hello, @PathVariable.<br> name = %s, age = %d", name, age);
    }
    // GET http://localhost:8080/hello/request/form/param?name=Robbie&age=95
    @GetMapping("/form/param")
    @ResponseBody
    public String helloGetRequestParam(@RequestParam(required = false) String name, @RequestParam int age){ // name에 값을 안넣어도 된다.
        return String.format("Hello, @RequestParam.<br> name = %s, age = %d", name, age);
    }

    // POST http://localhost:8080/hello/request/form/param
    // Header
    // Content type : application/x-www-form-urlencoded
    // Body
    // name=Robbie&age-95
    @PostMapping("/form/param")
    @ResponseBody
    public String helloPostRequestParam(@RequestParam String name, @RequestParam int age){
        return String.format("Hello, @RequestParam.<br> name = %s, age = %d", name, age);
    } // html form tag로 받는 방식

    // POST http://localhost:8080/hello/request/form/model
    // Header
    // Content type : application/x-www-form-urlencoded
    // Body
    // name=Robbie&age=95 쿼리스트링 방식

    @PostMapping("/form/model")
    @ResponseBody
    public String helloRequestBodyForm(@ModelAttribute Star star){
        return String.format("Hello, @ModelAttribute.<br> (name = %s, age = %d)", star.name, star.age);
    }

    //GET http://localhos:8080/hello/request/form/param/model?name=Robbie&age=65
    @GetMapping("/form/param/model")
    @ResponseBody
    public String helloRequestParam(@ModelAttribute Star star){
        return String.format("Hello, @ModelAttribute.<br> (name = %s, age = %d)", star.name, star.age);
    }
    //GET http://localhos:8080/hello/request/form/json
    // Header
    // Content type : application/json
    // Body
    // {"name":"Robbie","age":95}
    @GetMapping("/form/json")
    @ResponseBody
    public String helloPostRequestJson(@RequestBody Star star){ // json형태로 받아오려면 RequestBody로 해야 한다.
        return String.format("Hello, @ModelAttribute.<br> (name = %s, age = %d)", star.name, star.age);
    }
}
