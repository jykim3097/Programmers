package stream._3파이프라인;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineEx {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.Male, 30),
				new Member("홍길자", Member.Female, 25),
				new Member("이순신", Member.Male, 50),
				new Member("이순자", Member.Female, 34)
				);
		
		double ageAvg = list.stream()
							.filter(f -> f.getSex() == Member.Female)
							.mapToInt(Member::getAge)
							.average()
							.getAsDouble();
		
		System.out.println("여자 회원의 평균 나이 : " + ageAvg);
	}
}
