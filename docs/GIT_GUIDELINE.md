# Git Guideline
변수 정의는 `/README.md`를 참고합니다.

## 변수 정의
- `/README.md` 기준 플레이스홀더 사용

## 브랜치 전략
- main: 안정 배포용
- develop: 다음 배포 개발용
- feature/*: 기능 개발
- hotfix/*: 긴급 버그 수정

## 커밋 메시지 규칙
- [FEAT], [FIX], [DOC], [STYLE], [REFACTOR], [TEST], [CHORE]
- 예시: [FEAT] 데이터 품질 검증 서비스 구현

## PR 규칙
- 리뷰어 최소 1인 지정
- 모든 테스트 통과 후 병합
- 커밋 메시지와 PR 제목 일치

## 태그/릴리즈
- 릴리즈 태그: v{MAJOR}.{MINOR}.{PATCH}
- GitHub Release Notes 작성