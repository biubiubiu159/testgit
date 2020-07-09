package lesson.konwledge.text;

public class ObjectTest {

	public static void main(String[] args) {
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		
		System.out.println(o1);
		System.out.println(o1.toString());//返回类名 @hashCode
		System.out.println(o1.hashCode());//返回哈希吗
		System.out.println(o2.hashCode());
		
		System.out.println(o2.equals(o1));//比较引用的值是否相等
		System.out.println(o1 == o2);
		
	}

}
