package crud.curd.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // 제목은 반드시 입력해야 함
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT") // 내용은 반드시 입력해야 하고, TEXT 타입
    private String content;

    @Column(nullable = false)
    private String author;
    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
