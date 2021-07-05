package highscorekit.hash.hash3_위장;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Iterator;

public class StreamEx1 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동", "홍길자", "신사임당");
		
		// Iterator 반복자를 사용하는 방법
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) System.out.println(iterator.next());
		
		// Stream을 통한 람다식을 사용하는 방법
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}
}
