## Section 6

### AOP 가 필요한 상황
- 모든 메소드의 호출 시간을 측정해야 하는 상황
- 공통 관심사(cross-cutting concern) vs 핵심 관심 사항(core concern)

### AOP(Aspect Oriented Programming) 
- 동작 방식
- AOP 적용 전 의존 관계
  - helloController -> memberService
  - helloController -> (프록시)memberService -- joinPoint.proceed() -> (실제)memberService