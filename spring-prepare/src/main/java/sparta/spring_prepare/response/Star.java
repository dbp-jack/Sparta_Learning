package sparta.spring_prepare.response;

import lombok.Getter;

@Getter
public class Star {
    String name;
    int age;

    public Star(String name, int age) { // 생성자
        this.name = name;
        this.age = age;
    }
    public Star(){}
}

