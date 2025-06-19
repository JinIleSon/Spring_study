package hello.hello_spring.domain;

public class Member {

    private Long id; // 시스템이 알아서 지정
    private String name; // 사용자가 정함

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
