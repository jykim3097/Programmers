# Hash 1 - 완주하지 못한 선수

## Solution 1
* 이중 for문을 사용해 정확성 테스트는 통과했으나 효율성에서 all 실패가 떴다
	* O(n) x O(n) 이기 때문에 너무나 당연한 결과
* 먼저 정렬을 하면 자리 비교만 하면 되기 때문에 효율성 테스트를 통과할 수 있었다

### JAVA Arrays.sort()
* Arrays.sort()의 매개변수가 **기본형 타입(Primitive type)이라면 dual pivot quiksort**가 이루어지고,
* **참조형 타입(Reference type)이라면 mergesort**가 이루어진다.
* 이 경우는 배열(참조형 타입)이므로 시간 복잡도는 아래와 같다
* O(nlogn) + O(nlogn) + O(n) = O(n)

## Solution 2
* title이 hash이기 때문에 hashCode()를 사용해서 풀어봤는데(ㅋㅋ)
* HashMap으로 푸는 방식이 있어서 공부해봤다.

### HashMap 특징 복습
* key와 value로 구성된 Entity 객체를 저장하는 구조를 가지고 있는 자료구조
* 값은 중복 저장될 수 있지만 키는 중복 저장될 수 없다
	* 기존 키와 같은 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대치된다
* 값 추가 : put(key, value)
* 값 삭제 : remove(key)
	* 모든 값 삭제 : clear()
* 값 출력
	* key로 value 얻기 : get(key)
	* entrySet() 또는 keySet() 활용
	* 전체 출력 시 Iterator 사용 가능