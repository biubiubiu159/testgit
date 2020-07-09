package lesson.work;
//抽象类和接口
class Person{
	private String name;
	private int age;
	private String sex;
	
	public Person(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public void getinfo() {
		System.out.println(name+"-"+age+"-"+sex);
	}
	public void sayHello() {
		System.out.println("hello");
	}
	
}

interface Consumer{
	public abstract void useCredit();
}

class Student extends Person implements Consumer{
	private String school;
	public Student(String name, int age, String sex, String school) {
		super(name, age, sex);
		this.school = school;
	}
	public void study() {
		System.out.println(school);
	}
	public void useCredit() {
		System.out.println("4.0");
	}
	public void getinfo() {
		System.out.println("测试成功");
	}
	
} 

public class Work_4 {

	public static void main(String[] args) {
		Person st = new Student("东东",20,"男", "东东大学");//先向上塑造
		st.getinfo();
		((Student) st).study();
		((Consumer) st).useCredit();
		Student s = (Student)st;//再向下塑造
		Person p = s;
		p.getinfo();//多态
	}
}
