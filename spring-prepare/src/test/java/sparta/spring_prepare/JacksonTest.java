package sparta.spring_prepare;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sparta.spring_prepare.response.Star;

public class JacksonTest {

    @Test
    @DisplayName("Object To JSON : get Method 필요") // 필요요구조건 Getter
    void test1() throws JsonProcessingException{
        Star star = new Star("Robbie", 95);

        ObjectMapper objectMapper = new ObjectMapper(); // Jackson라이브러리의 ObjectMapper
        String json = objectMapper.writeValueAsString(star); // 오브젝트를 json형태로 변환

        System.out.println("json = " + json);
    }
    @Test
    @DisplayName("JSON To Object : 기본 생성자 &(get OR set) Method 필요")
    void test2() throws JsonProcessingException {
        String json = "{\"name\":\"Robbie\",\"age\":95}"; // JSON 타입의 String

        ObjectMapper objectMapper = new ObjectMapper();
        Star star = objectMapper.readValue(json, Star.class);
        System.out.println("star.getName() = "+ star.getName());
        System.out.println("star = " + star.getAge());
    } // deserialize 역직렬화
}
