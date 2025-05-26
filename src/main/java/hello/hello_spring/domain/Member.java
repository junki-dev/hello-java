package hello.hello_spring.domain;

import jakarta.persistence.*;

@Entity
public class Member {

    // DB가 알아서 아이디를 생성해주는 전략을 아이덴티티 전략이라 한다.
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
