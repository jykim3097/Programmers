package highscorekit.hash.hash3_위장;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
			new Student("홍길동", 90),
			new Student("신사임당", 100)
		);
		
		Stream<Student> stream = list.stream();
		
		stream.forEach( s -> {
			System.out.println("이름 : " + s.getName());
			System.out.println("성적 : " + s.getScore());
		});
	}
}
