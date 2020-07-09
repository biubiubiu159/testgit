package lesson.konwledge.reflection;

public class Person {

	private int age;
	public String name;
	static String des = "海盗战天下第一";
	
	public Person() {};
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public static String getDes() {
		return des;
	}
	
	
	
}
