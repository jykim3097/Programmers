# Hash 2 - [전화번호 목록](https://programmers.co.kr/learn/courses/30/lessons/42577)

## Solution
* hash로 푸는 법이 아무리 생각해도 안 떠올라서 일단 맞추고 보자는 생각으로 아는대로 풀었다.

### 문제 설명
* 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는 지 확인하려고 한다
* 접두어가 있으면 false, 없으면 true를 리턴한다

### 내 풀이 설명
1. sort로 전화번호를 String 상태로 정렬한다
2. 그러면 앞, 뒤 두자리만 비교한 후에 한 개만 떠도 false를 리턴하면 된다
3. 그래서 앞에 있는 값이 뒤의 값에 포함되면 false를 리턴하게 했다.
    
* 맨 처음 제출했던 코드는 아래와 같은데, 
```
import java.util.Arrays;

public class Solution {

	public boolean solution(String[] phone_book) {

	Arrays.sort(phone_book);

	for(int i=0; i<phone_book.length-1; i++) {
		if(phone_book[i+1].contains(phone_book[i])) {
			return false;
		}
	}
	return true;
	}
}

```
* 정확성 13번에서 실패가 떴다
* 반례) sort를 해서 {7, 47} 이라는 결과가 나왔을 때 접두어가 아니지만 포함하고 있기 때문에 false를 리턴한다
* 그래서 뒤의 값을 앞의 값의 길이만큼 앞에부터 잘라 두 값이 같으면 false를 리턴하도록 처리했다.