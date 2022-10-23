# 1 주차 기능 요구사항

## 1단계 - 웹 요청 / 응답 처리

- [x] 웹 요청 / 응답 처리로 입출력 추가
- [x] 예약 생성
    - [x] restdocs 테스트 추가
- [x] 예약 목록 조회
    - [x] restdocs 테스트 추가
- [x] 예약 삭제
    - [x] restdocs 테스트 추가
- [x] 기존 콘솔 애플리케이션 리팩터링
- [x] 예외 처리
- [x] 예약 생성 시 날짜와 시간이 똑같은 예약이 이미 있는 경우 예약을 생성할 수 없다.

## 2단계 - 데이터베이스 적용

- [x] 메모리 대신 데이터베이스 적용

## 3단계 - 테마 확장 기능

### 기능 요구사항

- [x] restdocs 테스트 추가
- [x] 테마를 관리 기능 추가
- [x] 테마별 스케줄 관리 기능 추가
    - [x] 스케쥴 생성 로직 작성
    - [x] 스케쥴 조회 로직 작성
    - [x] 스케쥴 삭제 로직 작성
- [x] 추가된 테마와 스케줄에 따라 기존에 구현된 예약을 리팩터링
    - [x] restdocs 수정
    - [x] 예약 저장 로직 수정
        - [x] 등록된 스케쥴이 없다면 예외가 발생한다
        - [x] 예약하려는 시간과 스케쥴이 다르면 예외가 발생한다
    - [x] 예약 목록 조회 로직 수정
        - [x] 등록된 스케쥴일 없다면 예외가 발생한다.
- [ ] 예약과 관련된 예외 상황을 처리
    - [x] 예약 등록을 하려는 날짜와 시간에 이미 등록되어있으면 예약을 등록을 실패한다.
    - [x] 예약이 없는 경우에도 빈 응답 값을 응답한다.
    - [x] 예약이 존재하지 않는 경우 예약 삭제를 실패한다.
    - [ ] 예약과 관계있는 스케줄 혹은 테마는 수정 및 삭제가 불가능하다

- [ ] 스케쥴과 관련된 예외
    - [x] 테마는 스케쥴을 다르게 설정할 수 있어야한다.
    - [x] 스케쥴 저장 시 테마가 존재하지 않으면 예외가 발생한다.
    - [x] 스케쥴 조회시 테마가 존재하지 않으면 예외가 발생한다.

### 프로그래밍 요구사항

- [ ] 예약과 테마 등 도메인 설계를 자유롭게 한다.
- [ ] 도메인 설계로 인해 생성되는 객체와 데이터베이스의 테이블의 스키마는 일치하지 않아도 된다.
- [ ] 계층을 고려한 리팩터링을 한다.
