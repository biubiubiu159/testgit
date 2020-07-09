package lesson.konwledge.text;

import java.util.HashSet;
import java.util.Set;


public class SetTest {

	public static void main(String[] args) {
		//定义一个储存多个对象的容器
		Set s = new HashSet();//上溯造型
		
		s.add(123);
		SetTest st = new SetTest();
		s.add(st);
		s.add("tom");
		System.out.println(s);
		s.remove(123);
		System.out.println(s);
		System.out.println(s.contains("tom"));
		System.out.println(s.isEmpty());
		System.out.println(s);
		System.out.println(s.size());
		StringBuffer str = new StringBuffer("tt");
		StringBuffer str1 = new StringBuffer("tt");
		s.add(str);
		s.add(str1);
		System.out.println(s);
		
	}
}
