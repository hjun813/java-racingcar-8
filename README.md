# java-racingcar-precourse

1. 자동차
     - 각 자동차는 이름을 가진다
     - 5자 이하만 허용, 초과시 IllegalArgumentException 발생

2. 이동
     - 0~9 사이의 무작위 값이 4이상이면 전진
     - 전진시 위치 1 증가

3. 입력값
     - "," 값으로 이름 구분
     - pobi,woni,jun
     - 시도할 횟수 입력
     - 사용자 잘못된 값 입력시 IllegalArgumentException 발생
  
4. 경주
     - 입력 받은 값만큼 라운드 실행
     - 가장 멀리 전진한 자동차가 우승자
     - 우승자는 여러명일수 있다

추가사항
- JUnit 5와 AssertJ를 이용하여 정리한 기능 목록이 정상적으로 작동하는지 테스트 코드로 확인한다.
- camp.nextstep.edu.missionutils에서 제공하는 Randoms 및 Console API를 사용하여 구현해야 한다
    - Random 값 : camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()
    - 사용자가 입력하는 값 : camp.nextstep.edu.missionutils.Console의 readLine()
