package lesson.konwledge.text;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("tom");
		ls.add(123);
		ls.add(new ListTest());
		System.out.println(ls);
		ls.add(0,"Jom");
		System.out.println(ls);
		ls.remove(3);
		System.out.println(ls);
		System.out.println(ls.get(1));
		System.out.println(ls.isEmpty());
		
	}

}
