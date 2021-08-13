package stream._4필터링;

import java.util.Arrays;
import java.util.List;

public class FilteringEx {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동", "홍길자", "김자바", "홍길자", "유자바");
		
		list.stream()
			.distinct()
			.forEach(name -> System.out.println(name));
		
		System.out.println();
		
		list.stream()
			.filter(name -> name.startsWith("홍"))
			.forEach(name -> System.out.println(name));
		
		System.out.println();
		
		list.stream()
			.distinct()
			.filter(name -> name.startsWith("홍"))
			.forEach(name -> System.out.println(name));
	}
}
