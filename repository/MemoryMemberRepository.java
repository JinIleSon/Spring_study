package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence); // sequence 값에 따라 고유 아이디 1씩 증가해서 부여
        store.put(member.getId(), member); // Map<Long, Member> store의 형태에 따라 Key, Value 넣음
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id)); // Optional.ofNullable()을 사용. null 값이 생길 수 있으니 그것을 염두
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream() // store의 값을 하나씩 순회
                .filter(member -> member.getName().equals(name)) // 순회한 값을 member라는 매개변수에 매핑. member의 name과 같은지 확인
                .findAny(); // 같은 게 있으면 반환
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values()); // 모든 Member 반환
    }
}
