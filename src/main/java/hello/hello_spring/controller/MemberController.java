package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private MemberService memberService;
//    @Autowired private final MemberService memberService; // [DI] 필드 주입 방식

    // [DI] 세터 주입 방식, public 하게 노출돼서 중간에 변경이 가능해서 권장하지 않음
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }

    // [DI] 생성자 주입 방식
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


}
