package stream._3파이프라인;

public class Member {

	public static int Female = 0;
	public static int Male = 1;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public int getSex() {
		return sex;
	}
	
	public int getAge() {
		return age;
	}
	
}
