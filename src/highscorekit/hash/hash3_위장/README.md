# Hash 3 - [위장](https://programmers.co.kr/learn/courses/30/lessons/42578)

## 문제 설명
* 스파이가 매일 다른 옷을 조합해 옷을 입는 방법을 구하여라
* 스파이는 한 개 이상의 옷을 입는다

## Solution 1 - 내 풀이

1. 이중배열의 두번째 행 값을 key 값으로 해 같은 key일 때 갯수를 세어 value 값을 넣는다
	* 이 때 key가 첫번째 값을 저장하기 위해 [Hash1](https://github.com/jykim3097/Programmers/tree/main/src/highscorekit/hash/hash1_%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80%EB%AA%BB%ED%95%9C%EC%84%A0%EC%88%98)에서 알게 된 getOrDefault 함수를 사용해서 값을 저장했다.
	* 여기까지가 그냥 준비과정이라는 것을...^^
2. 모든 경우의 수를 따지는 방법이 도저히 생각나지 않았다..
	* 처음에는 value 값을 모두 더하고 거기에 모든 value값을 곱한 값을 더한다고 생각했는데
	* 모든 경우의 수를 따진 것이 아니었다. 그래서 모든 경우의 수를 따져 식을 만들어보니
	* value를 모두 곱한 값의 약수가 경우의 수라고 생각했고,
	* **약수의 합 * 2 - 1** 이라는 식을 만들었다.
3. 그런데 약수의 합을 이용한 게 그 전에 제출했던 것보다 정확성이 더 떨어졌다...
	* 반례) 모든 value가 1일 때 1의 약수이기 때문에 오답이 된다
4. 거의 하루를 고민하고 답을 확인했다.
5. 포인트는 각 옷 별로 +1('안 입는 옷'을 포함)을 해 곱하고 그 값에 -1(아무것도 안 입는 경우)을 하는 것
	* 수학적 지식을 이렇게 활용하다니 적재적소에 적당한 개념을 활용해야한다는 것을 체감했다

## Solution2 - Stream을 사용한 코드
* https://programmers.co.kr/learn/courses/30/lessons/42578/solution_groups?language=java
* 스트림으로 한 줄에 끝내버리는 코드..,, respect,, 😲😱
* [Stream 공부](https://github.com/jykim3097/Programmers/tree/main/src/stream)