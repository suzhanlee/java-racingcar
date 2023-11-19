# 자동차 경주 게임

## 기능

초간단 자동차 경주 게임을 구현한다.
주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

## 기능 목록 정의
* [x] : 구분자를 이용해 문자열을 구분한다.
* [x] : 쉼표를 구분자로 가지는 문자열을 전달할 경우 구분자를 기준으로 분리한 각 숫자의 합 반환
* [x] : 콜론를 구분자로 가지는 문자열을 전달할 경우 구분자를 기준으로 분리한 각 숫자의 합 반환
* [x] : 문자열 앞부분에 // 와 \n 사이의 문자를 커스텀 구분자로 사용한다.
* [x] : 빈 문자열 혹은 null을 입력한 경우 0을 반환
* [x] : 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.
  * [x] : 양수 값 객체를 만들어 유효성 검증을 처리한다.
* [x] : 숫자 하나를 문자열로 입력한 경우 숫자를 반환한다.
* ## 🛠 기능 구현 목록

* `RacingCar`: 레이싱 카
    * [x] : 0에서 9 사이의 random 값이 4이상일 경우이면 전진한다.

* `RacingGame` : 경주차 게임
    * [x] : 자동차 경주 게임을 실행한다.

* `NumberOfAttempts` : 남은 경주 횟수
    * [x] : 남은 경주 횟수를 계산한다.
    * [x] : 남은 경주 횟수가 양수가 아닌데, 경주를 시작하려 하면 예외를 던진다.

* `RacingGameResult` : 경주 게임 결과를 알려준다.
    * [x] : 게임 실행 결과를 알려준다.

* `InputView`
    * [x] : 경주할 자동차 수를 입력한다.
    * [x] : 경주를 시도할 횟수를 입력한다.

* `OutputView`
    * [x] : 게임 실행 결과를 알려준다.

* `RacingGameController`
    * [x] : 자동차 경주 게임의 전반적인 협력을 관리한다.

* `Configuration`
    * [x] : 객체들의 의존성을 관리한다.

* `Application`
    * [x] : 애플리케이션을 실행한다.