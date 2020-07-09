package lesson.konwledge.text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClassDateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
		c.set(2222, 1, 22);
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
		
	    SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    System.out.println(sp.format(now));
	    
	    Date d = null;
		try {
			d = sp.parse("2020-07-01 08:30:30");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(d);
	    
	}

}
