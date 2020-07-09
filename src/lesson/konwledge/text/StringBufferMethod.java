package lesson.konwledge.text;

public class StringBufferMethod {

	public static void main(String[] args) {
		//capacity() 返回当前容量
		StringBuffer sb1 = new StringBuffer("sshh");
		System.out.println(sb1.capacity());
		//length() 返回字符串长度
		System.out.println(sb1.length());
		//reverse() 将此字符串用其反转形式取代
		StringBuffer sb2 = new StringBuffer(sb1.reverse());
		System.out.println(sb2);
		//setCharAt(int, char) 将索引处的字符改为char
		sb1.setCharAt(1, 'b');
		System.out.println(sb1);
		//delete(int begin, int end) 删除
		//charAt(int index) 查找
		//toString() 把StringBuffer转化为String
		//addend() 追加
		//insert(int index, String str) 插入
		//replcae(int begin, int end, String str)用str代替begin到end-112
		StringBuffer sb = new StringBuffer("123456789");
		sb.replace(1, 4, "432");
		System.out.println(sb);
	}

}
