package sparta.spring_prepare.response;

import lombok.Getter;

@Getter
//@Setter
public class Star {
    String name;
    int age;

    public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Star(){} // 기본 생성자
}

