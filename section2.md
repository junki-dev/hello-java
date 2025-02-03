## Section 2

- 정적 컨텐츠: 파일을 서버에서 브라우저로 그대로 내려주는 것
  - [공식 문서: 정적 컨텐츠](https://docs.spring.io/spring-boot/reference/web/reactive.html#web.reactive.webflux.static-content)
- 템플릿 엔진: JSP, PHP 와 같이 HTML 을 서버에서 동적으로 바꿔서 내리는 것
- @ResponseBody
  - HTTP 의 Body 에 문자 내용을 직접 반환
  - `viewResolver` 대신에 `HttpMessageConverter` 가 동작
  - 기본 문자처리: `StringHttpMessageConverter`
  - 기본 객체처리: `MappingJackson2HttpMessageConverter`
  - byte 처리 등 기타 여러 HttpMessageConverter 가 내장돼있음
  > 참고: 클라이언트의 HTTP Accept 헤더와 서버의 컨트롤러 반환 타입 정보를 조합해서 `HttpMessageConverter` 가 선택된다.