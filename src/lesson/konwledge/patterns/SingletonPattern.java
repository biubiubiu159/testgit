package lesson.konwledge.patterns;

//单例模式
public class SingletonPattern {

	//私有的构造方法
	private SingletonPattern() {
		
	}
	
	//静态对象
	private static SingletonPattern st = new SingletonPattern();
	
	//返回创造的对象
	public static SingletonPattern getOj() {
		return st;
	}
	

}
