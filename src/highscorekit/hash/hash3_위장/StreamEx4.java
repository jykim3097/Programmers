package highscorekit.hash.hash3_위장;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx4 {

	public static void main(String[] args) {
		
		//배열로부터 스트림얻기
		String[] arr = {"jykim", "신사임당", "홍길동"};
		
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(s -> System.out.println(s));
	}
}
