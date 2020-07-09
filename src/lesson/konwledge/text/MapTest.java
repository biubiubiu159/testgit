package lesson.konwledge.text;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(0, "tom");
		m.put(1, "jom");
		m.put(2, "jun");
		
		System.out.println(m.get(2));
		
		m.put(2, "iii");
		System.out.println(m.get(2));
		
		System.out.println(m);
		
		Set sk = m.keySet();
		
		Iterator it = sk.iterator();
		
		while(it.hasNext()) {
			Object key = it.next();
			Object value = m.get(key);
			System.out.println(key+":"+value);
		}
	}

}
