package stream._5매핑;

import java.util.Arrays;
import java.util.List;

public class FlatMapEx {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("java8 lamda", "stream mapping");
		strList.stream()
			   .flatMap(data -> Arrays.stream(data.split(" ")))
			   .forEach(word -> System.out.println(word));
		
		System.out.println();
		
		List<String> intList = Arrays.asList("10, 20, 30", "40, 50, 60");
		intList.stream()
			   .flatMap(data -> Arrays.stream(data.split(",")))
			   .forEach(num -> System.out.println(Integer.parseInt(num.trim())));
		
		// trim() : 문자열 맨 앞이나 맨 뒤에 있는 공백 제거, 문자열 중간에 있는 공백은 제거하지 않는다(replace 이용)
	}
}
