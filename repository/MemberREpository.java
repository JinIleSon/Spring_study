package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 저장소에 저장
    Optional<Member> findById(Long id); // Optional의 용도는 null을 감싸서 출력하기 위함
    Optional<Member> findByName(String name); // 저장소에서 Id(위), Name을 찾아옴
    List<Member> findAll(); // findAll()하면 모든 리스트를 반환
}
