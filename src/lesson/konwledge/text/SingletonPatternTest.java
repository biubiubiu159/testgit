package lesson.konwledge.text;

//单例模式
public class SingletonPatternTest {

	//私有的构造方法
	private SingletonPatternTest() {
		
	}
	
	//静态对象
	private static SingletonPatternTest st = new SingletonPatternTest();
	
	//返回创造的对象
	public static SingletonPatternTest getOj() {
		return st;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonPatternTest st;
		st = getOj();
	}

}
