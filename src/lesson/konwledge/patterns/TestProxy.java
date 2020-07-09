package lesson.konwledge.patterns;

public class TestProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//抽象主题
interface Subject{
	void Request();
}

//真实主题
class RealSubject implements Subject{

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		System.out.println("访问真实主题");
	}
	
}

//代理
class Ploxy implements Subject{

	private RealSubject realSubject = null;
	@Override
	public void Request() {
		// TODO Auto-generated method stub
		if(realSubject == null) {
			realSubject = new RealSubject();
			preRequest();
			realSubject.Request();
			postRequest();
		}
		
	}
	public void preRequest() {
		System.out.println("预处理");
	}
	public void postRequest() {
		System.out.println("后续处理");
	}
}



