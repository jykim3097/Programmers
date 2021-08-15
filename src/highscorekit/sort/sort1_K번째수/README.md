# 정렬(sort) 1 - [K번째 수](https://programmers.co.kr/learn/courses/30/lessons/42748)

## 문제 설명
* 연산 : 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구한다.
* 매개변수 : 배열 array와 [i, j, k]를 원소로 가진 2차원 배열 commands
* return : commands에 원소에 대해 연산을 적용했을 때 나온 결과를 배열에 담아 출력

## 내 풀이 설명
* 이중 배열 commands 안에 있는 1차원 배열의 두번째 원소에서 첫번째 원소를 뺀 값으로 새 배열을 만든다.
* 새 배열에 연산에 따른 array 값을 넣고 정렬한 후 세 번 째 값을 출력한다.
* 처음에는 String의 메서드인 substring 같은 함수가 있지 않을까 했는데, 직접 만들어봤다.
* 정확성 테스트뿐이라 가볍게 통과했지만, 이중for문을 쓰는 방법 밖에 생각나지 않았다.

## 다른 사람의  풀이
* 핵심 : **Arrays의 copyOfRange**를 사용하는 것이다.
* Arrays.copyOfRange(기준 배열, 시작 index, 끝 index)

## 내 풀이와 다른 사람 풀이 비교
* 두 코드 다 정확성 테스트는 통과했지만, copyOfRange를 사용하는 것이 약 0.2ms 더 빠르게 실행됐다.