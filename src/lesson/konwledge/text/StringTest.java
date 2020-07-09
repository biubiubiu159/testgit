package lesson.konwledge.text;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String对象的创建
		String s1 = "tom";//StringBuffer不可以这样创建
		String s2 = new String("tom");
		System.out.println(s2.hashCode());
		String s3 = new String();
		
		//s1、s2声明方式不一样
		String s11 = "tom";
		String s22 = new String("tom");
		System.out.println(s1 == s11);//s1、s11只创建了一个对象
		System.out.println(s2 == s22);//s2、s22创建了两个对象
		
		//StringBuffer的创建
		StringBuffer sb1 = new StringBuffer();
		sb1.append("tom");
		StringBuffer sb2 = new StringBuffer("tom");
		StringBuffer sb3 = new StringBuffer(s1);
		
		//判断字符串的值是否相等
		System.out.println(s1.equals(s2));
		//判断字符串地址是否相等
		System.out.println(s1 == s2);
		
		//String 不可改变的Unicode序列
		//当字符串修改后，s2的哈希码值改变
		System.out.println(s2.hashCode());
		s2 = s2 + "123";
		System.out.println("s2 = "+s2);
		System.out.println(s2.hashCode());
		
		//StringBuffer可改变Unicode序列
		System.out.println(sb1.hashCode());
		sb1.append("123");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		//通过StringBuffer进行字符串操作，再最后转换回String，实现对内存的节省
		String restult = sb1.toString();
		
	}

}
