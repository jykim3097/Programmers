package highscorekit.hash.hash3_위장;

import java.util.Arrays;
import java.util.List;

public class StreamEx3 {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
			new Student("홍길동", 80),
			new Student("신사임당", 90),
			new Student("jykim", 100)
		);
		
		double avg = list.stream()
						 .mapToInt(Student :: getScore) // 학생 객체를 점수로 매핑하는 중간 처리
						 .average() // 평균을 구하는 최종 처리
						 .getAsDouble();
		
		System.out.println(avg);
	}
}
