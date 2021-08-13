package stream._2종류;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import stream._1특징.Student;

public class StreamEx5 {

	public static int sum;
	
	public static void main(String[] args) {
		
		//컬렉션으로부터 스트림 얻기
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
				);
		
		Stream<Student> stream = studentList.stream();
		stream.forEach(s -> System.out.println(s.getName()));
		
		System.out.println("---------");
		
		//배열로부터 스트림얻기
		String[] arr = {"jykim", "신사임당", "홍길동"};
		
		Stream<String> arrStream = Arrays.stream(arr);
		arrStream.forEach(s -> System.out.println(s));
		
		System.out.println("---------");
		
		//숫자 범위로부텉 스트림 얻기
		//1부터 100까지 합을 구하기 위해 IntStream의 rangeClosed() 메서드 이용
		IntStream intStream = IntStream.rangeClosed(1, 100);
		intStream.forEach(i -> sum += i);
		System.out.println(sum);
	}
}
