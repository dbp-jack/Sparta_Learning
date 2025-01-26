package sparta.spring_prepare;
import lombok.*;

@Getter
@Setter // lombok을 통해 쉽게 가능
//@NoArgsConstructor // 기본 생성자
//@AllArgsConstructor // 모든 필드를 가지고 있는 생성자
@RequiredArgsConstructor // 요구되는 필드들을 가지는 컨스트럭쳐 - final
public class Memo {
    private final String username;
    private String contents;

//    public Memo(String username, String contents) {
//        this.username = username;
//        this.contents = contents;
//    }
}

class Main{
    public static void main(String[] args) {
        Memo memo = new Memo("Robbert"); // 기본생성자를 컴파일해서 넣어주지 않아서 오류가 생긴다. - NoArgsConstructor
        System.out.println(memo.getUsername());
    }
}