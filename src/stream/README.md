# Stream
* 출처 : 이것이 자바다, 한빛미디어
* 배열을 포함한 컬렉션의 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 **반복자**
	* 람다식 : 함수적 스타일
	* [StreamEx1](https://github.com/jykim3097/Programmers/blob/main/src/stream/_1%ED%8A%B9%EC%A7%95/StreamEx1.java)

## 반복자 스트림 (Stream의 foreach)
* **Consumer 함수적 인터페이스** 타입의 매개값을 가진다
* 매개 값은 있지만 리턴 은 없다

## 스트림의 특징
### 1. 람다식으로 요소를 처리한다 [StreamEx2](https://github.com/jykim3097/Programmers/blob/main/src/stream/_1%ED%8A%B9%EC%A7%95/StreamEx2.java)
### 2. 내부 반복자를 사용해 *병렬 처리*가 쉽다
* 외부 반복자 : 개발자가 코드로 직접 컬렉션의 요소를 반복해서 가져오는 코드 
	* index를 이용하는 for문이나 Iterator를 이용하는 while문
* 내부 반복자 : 컬렉션 내부에서 요소를 반복시키고, 개발자는 처리해야할 코드만 제공하는 코드 패턴
* 순차적인 외부 반복자보다 요소들을 **병렬 작업**하게 하는 내부 반복자가 효율적이다
#### 병렬 처리란
* 한 가지 작업을 서브 작업으로 나누고, 서브 작업들을 분리된 스레드에서 병렬적으로 처리하는 것
* "여러 개의 스레드가 요소들을 부분적으로 합하고 이 부분 합을 최종 결합해서 전체 합을 생성한다"
* [StreamEx3](https://github.com/jykim3097/Programmers/blob/main/src/stream/_1%ED%8A%B9%EC%A7%95/StreamEx3.java)
	* [이중 콜론 연산자](#이중-콜론-연산자)
	* [ForkJoinPool](https://m.blog.naver.com/2feelus/220732310413)
		1. 큰 업무를 작은 단위의 업무로 쪼갠다
		2. 부모 쓰레드로부터 처리로직을 복사해 새로운 쓰레드에서 쪼개진 업무를 수행한다(**Fork**)
		3. 2를 반복하다가 특정 쓰레드에서 더 이상 fork가 일어나지 않고 업무가 완료되면 그 결과를 부모 쓰레드에서 **Join**해 값을 취합한다
		4. 3을 반복하다가 최초에 ForkJoinPool을 생성한 쓰레드로 값을 리턴해 작업을 완료한다		
### 3. 중간, 최종 처리 작업을 수행한다
* 중간 처리에서는 *매핑, 필터링, 정렬* 수행
* 최종 처리에서는 *반복, 카운팅, 평균, 총합 등의 집계 처리* 수행
* [StreamEx4](https://github.com/jykim3097/Programmers/blob/main/src/stream/_1%ED%8A%B9%EC%A7%95/StreamEx4.java)

## 스트림의 종류
* java.util.stream 패키지에는 스트림 API가 있는데,
* BaseStream 인터페이스를 상속하는 자식 인터페이스(Stream, IntStream, LongStream, DoubleStream)가 있다
* BaseStream에는 모든 스트림에서 사용할 수 있는 공통 메서드들만 정의되어 있고 직접 사용되지는 않는다.
* 자식 스트림이 직접적으로 사용되는데
	* Stream : 객체 요소 처리하는 스트림
	* IntStream, LongStream, DoubleStream 은 각각 기본 타입인 int, long, double 요소를 처리하는 스트림
* [StreamEx5](https://github.com/jykim3097/Programmers/blob/main/src/stream/_2%EC%A2%85%EB%A5%98/StreamEx5.java)

### 배열로부터 스트림 얻기
* Arrays.stream(array) 사용

### 숫자 범위로부터 스트림 얻기
* IntStream.rangeClosed(1,100);
* 전역변수로 선언된 변수는 초기화하지 않아도 0으로 초기화된다.

## 스트림 파이프라인

### 중간처리와 최종처리
* 스트림은 중간처리와 최종처리를 **파이프라인**으로 해결한다
* 파이프라인 : 여러 개의 스트림이 연결되어 있는 구조, 최종 처리를 제외하고는 모두 중간 처리 스트림이다.
* 중간 처리 메서드가 중간 처리 스트림을 리턴한다
* 리턴 타입이 스트림이라면 중간 처리 메서드이고, 리턴 타입이 기본 타입이거나 OptionalXXX라면 최종 처리 메서드이다.
* [pipelineEx](https://github.com/jykim3097/Programmers/blob/main/src/stream/_3%ED%8C%8C%EC%9D%B4%ED%94%84%EB%9D%BC%EC%9D%B8/StreamPipelineEx.java)

### 필터링
* 필터링 메서드 : distinct(), filter()
	* 모든 스트림이 가지고 있는 공통 메서드
* distinct() : 중복 제거 메서드
	* Object.equals(Object)가 true이면 동일한 객체로 판단하고 중복 제거
* filter() : 조건 필터링
	* 매개값이 true를 리턴하는 요소만 필터링
* 중복을 제거하고 필터링 할 수 있다.
* [filteringEx](https://github.com/jykim3097/Programmers/blob/main/src/stream/_4%ED%95%84%ED%84%B0%EB%A7%81/FilteringEx.java)

### 매핑
* 중간 처리 기능, 스트림의 요소를 다른 요소로 대체하는 작업
* flatXXX(), mapXXX(), asDoubleStream(), asLongStream(), boxed()
* [flatXXX()](https://github.com/jykim3097/Programmers/blob/main/src/stream/_5%EB%A7%A4%ED%95%91/FlatMapEx.java) : 요소를 대체하는 복수 개의 요소로 구성된 새로운 스트림 리턴
* mapXXX() : 요소를 대체하는 요소로 구성된 새로운 스트림 리턴
* asDoubleStream(), asLongStream()
	* IntStream, LongStream의 int요소, long요소를 double 요소로 변환해서 DoubleStream을 생성한다
* boxed() : int, long, double 요소를 Integer, Long, Double 요소로 박싱해서 Stream을 생성한다
* [asDoubleStreameAndBoxedEx](https://github.com/jykim3097/Programmers/blob/main/src/stream/_5%EB%A7%A4%ED%95%91/AsDoubleStreamAndBoxedEx.java)

### 정렬
* 요소가 최종 처리되기 전에 중간 단계에서 요소를 정렬해서 최종 처리 순서를 변경할 수 있다.


## 이중 콜론 연산자
* :: - 메소드 참조 표현식(Method Reference expression)
* [인스턴스] :: [메소드명(또는 new)]
* 참조 : [이중 콜론 연산자](http://yoonbumtae.com/?p=2776)