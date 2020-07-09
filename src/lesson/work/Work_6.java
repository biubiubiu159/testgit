package lesson.work;

import java.util.Scanner;

public class Work_6 {

	public static void main(String[] args) {
		String str = new Scanner(System.in).next();
		System.out.println(str);
		StringBuffer sb1 = new StringBuffer(str);
		sb1.delete(3,7);
		sb1.insert(3,"****");
		str = sb1.toString();
		System.out.println(str);
		
	}

}
