package lesson.konwledge.text;

public class StringChangeTest {

	public static void main(String[] args) {
		
		//字符串转化为基本数据类型 xxxparse()方法
		String str = "300";
		int i = Integer.parseInt(str);
		System.out.println(i);
		double d = Double.parseDouble(str);
		System.out.println(d);
		
		//基本数据类型转换成字符串   toString()方法
		String s = Integer.toString(i);
		System.out.println(s);
		String ss = Double.toString(d);
		System.out.println(ss);
		}

}
