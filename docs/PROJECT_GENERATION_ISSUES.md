# 프로젝트 생성 중 발생 이슈 요약

본 문서는 `README.md` 기반으로 Spring Boot 프로젝트를 생성/초기 검증하는 과정에서 **실제로 발생했던 문제**와 **해결 방법**을 기록합니다.

---

## 1) Maven 미설치(PowerShell에서 `mvn` 인식 실패)

- **증상**
  - PowerShell에서 `mvn` 실행 시 `CommandNotFoundException` 발생
- **원인**
  - 로컬 환경에 Maven이 설치되어 있지 않거나, 설치되어 있어도 PATH에 등록되지 않음
- **조치**
  - Maven Wrapper 추가 후 `mvnw.cmd`로 빌드 가능하게 구성
  - Wrapper 관련 파일:
    - `mvnw`, `mvnw.cmd`
    - `.mvn/wrapper/maven-wrapper.jar`
    - `.mvn/wrapper/maven-wrapper.properties`
- **빌드 명령**
  - `mvnw.cmd -DskipTests compile`

---

## 2) `pom.xml` 오타로 인한 POM 파싱 실패

- **증상**
  - `Malformed POM ... Unrecognised tag: 'scope' ...` 오류로 빌드 중단
- **원인**
  - `<parent>` 섹션 내부에 허용되지 않는 `<scope>import</scope>` 태그가 들어가 XML 구조가 깨짐
- **조치**
  - `pom.xml`의 `<parent>` 내부 `<scope>` 태그 제거

---

## 3) Lombok 생성자 + 수동 생성자 중복(`ErrorResponse`)

- **증상**
  - `Duplicate method ErrorResponse(String, String) in type ErrorResponse`
- **원인**
  - `ErrorResponse`에 `@AllArgsConstructor`가 `(String, String)` 생성자를 생성하는데,
    동일 시그니처의 수동 생성자가 추가로 존재해서 충돌
- **조치**
  - `ErrorResponse(String code, String message)` 수동 생성자 제거
  - Lombok이 생성하는 생성자만 유지
- **대상 파일**
  - `src/main/java/basemarkdown/system/exception/ErrorResponse.java`

---

## 4) 최종 검증 결과

- **컴파일 검증**
  - `mvnw.cmd -DskipTests compile` 성공

