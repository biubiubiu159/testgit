package lesson.konwledge.text;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//equals()方法判断两个字符串内容是否相等
		String str1 = "xxx";
		String str2 = "xxx";
		System.out.println(str1.equals(str2));
		
		//equalsIgnoreCase()方法判断两个字符串是否相等，忽略大小写
		String str3 = "Xxx";
		String str4 = "xxx";
		System.out.println(str3.equalsIgnoreCase(str4));
		
		//toUpperCase()方法将String对象中的字符都转化成为大写
		String str5 = "Ass";
		System.out.println(str5.toUpperCase());
		
		//toLowerCase()转化为小写
		
		//charAt(int)返回指定索引处的char值
		String str6 = "agsjj";
		System.out.println(str6.charAt(1));
		
		//substring(int begian）返回一个从begin开始的新字符串
		String str7 = "hduaydiuwo";
		System.out.println(str7.substring(2));
		
		//substring(int begin, int end)返回一个从begin开始到end-1结束的字符串
		String str8 = "hiahwdiwoue";
		System.out.println(str8.substring(2, 8));
		
		//concat()将指定字符串连接到该字符串换结尾
		String str9 = "sss";
		String str10 = str9.concat("bbb");
		System.out.println(str10);
		
		//
	}

}
