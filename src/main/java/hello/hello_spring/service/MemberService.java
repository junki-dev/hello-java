package hello.hello_spring.service;

import hello.hello_spring.domain.Member;
import hello.hello_spring.repository.MemberRepository;
import hello.hello_spring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

//    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * 회원 가입
     */
    public Long join (Member member) {
        // 중복 회원 검증
        /**
         * 이 방식도 가능하지만 validDuplicateMember 의 간소화된 방식이 많이 사용됨
         * result.orElseGet(); NOTE. 값이 있으면 주고, 없으면 default 값을 달라, 이 것도 많이 쓰임
         *
         * Optional<Member> result = memberRepository.findByName(member.getName());
         * result.ifPresent(m -> {
         *     throw new IllegalStateException("이미 존재하는 회원입니다.");
         * });
         */
        validDuplicateMember(member);

        memberRepository.save(member);
        return member.getId();
    }

    private void validDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    /**
     * 특정 회원 조회
     */
    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
