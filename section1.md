## Section 1

- gradle 또는 maven 은 의존성을 관리한다.
- spring boot library
  -  spring-boot-starter-web
    - spring-boot-starter-tomcat
    - spring-webmbvc
  - spring-boot-starter-thymeleaf: 타임리프 템플릿 엔진(view)
  - spring-boot-starter(공통): 스프링 부트 + 스프링 코어 + 로깅
    - spring-boot
      - spring-core
    - spring-boot-starter-logging
      - logback, slf4j
  - spring-boot-starter-test
    - junit5: 테스트 프레임워크
    - mockito: mock 라이브러리
    - assertj: 테스트 코드 작성을 더 편하게 해주는 라이브러리
    - spring-test: 스트링 통합 테스트 지원

### Thymeleaf
- controller 에서 리턴 값으로 문자열을 반환하면, 뷰 리졸버(`viewResolver`)가 화면을 찾아서 처리한다.
  - 스프링 부트 템플릿엔진 기본 viewName 매핑
  - `resources:templates/` + ${ViewName} + `.html`

### 빌드와 실행
- 빌드: `./gradlew build`
- 실행: `java -jar ${jar 파일}`
- 초기화: `./gradlew clean` 또는 `./bradlew clean build`