# stackQueue 2 - [프린터](https://programmers.co.kr/learn/courses/30/lessons/42587)

## 문제 설명
* 인쇄를 요청한 문서가 몇 번째로 출력되는 지 구하기
1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
3. 그렇지 않으면 J를 인쇄합니다.

## Solution
* queue, priority queue, map 등등을 사용해 여러 방법을 시도해봤지만 문제를 해결할 수 없었다.
* [이 블로그](https://n1tjrgns.tistory.com/190)를 참고해 문제를 풀었다.
