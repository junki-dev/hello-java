package hello.hello_spring;

import hello.hello_spring.repository.*;
import hello.hello_spring.service.MemberService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    //    private final DataSource dataSource;

//    @PersistenceContext
//    EntityManager em;

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    // JpaRepository 를 상속한 인터페이스에서 생성한 객체를 스프링이 자동으로 빈에 등록해주기 때문에 따로 등록해줄 필요가 없다.
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
//        return new JdbcTemlateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }

}
