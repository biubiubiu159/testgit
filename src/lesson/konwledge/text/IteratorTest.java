package lesson.konwledge.text;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//迭代器iterator的使用

public class IteratorTest {

	public static void main(String[] args) {
		Set s = new HashSet();
		for(int i = 0; i < 6; i++) {
			s.add(i);
		}
		Iterator it =  s.iterator();
		while(it.hasNext()) {
			int i = (int)it.next();
			System.out.println(i);
		}
		s.add(9);//重新添加之后要重新迭代
		Iterator it1 =  s.iterator();
		while(it1.hasNext()) {
			int i = (int)it1.next();
			System.out.println(i);
		}
		
	}

}
