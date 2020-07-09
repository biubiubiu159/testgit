package lesson.konwledge.text;


public class StaticTest {

	//static 的属性可以被所有对象共享
	public static int age1;
	public int age2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age1 = 5;
        StaticTest t1 = new StaticTest();
        StaticTest t2 = new StaticTest();
        System.out.println(t1.age1);
        System.out.println(t2.age1);
	}

}
