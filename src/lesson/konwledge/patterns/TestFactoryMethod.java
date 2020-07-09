package lesson.konwledge.patterns;

//工厂方法设计模式
public class TestFactoryMethod {

	public static void main(String[] args) {
		Factory makeJuice = new JuiceFactory();
		Factory makeInstantNoodles = new InstantNoodlesFactory();
		
		makeJuice.getWork().doWork("orange");
		makeJuice.getWork().doWork("农夫山泉");
		makeJuice.getWork().doWork("apple");
		
		makeInstantNoodles.getWork().doWork("康师傅");
		makeInstantNoodles.getWork().doWork("汤达人");
		makeInstantNoodles.getWork().doWork("合味道");
		
		
	}
	
}

interface Factory{
	Work getWork();
}

interface Work{
	void doWork(String str);
}

class MakeJuice implements Work{

	@Override
	public void doWork(String juice) {
		// TODO Auto-generated method stub
		if(juice.equals("orange")) {
			System.out.println("制作橙汁");
		}else if(juice.equals("apple")) {
			System.out.println("制作苹果汁");
		}else {
			System.out.println("制作不知名饮料");
		}
	}
	
}


class JuiceFactory implements Factory{

	@Override
	public Work getWork( ) {
		// TODO Auto-generated method stub
		return new MakeJuice();
	}
	
}

class MakeInstantNoodles implements Work{

	@Override
	public void doWork(String brand) {
		// TODO Auto-generated method stub
		if(brand.equals("康师傅")) {
			System.out.println("生产康师傅牛肉面");
		}else if(brand.equals("汤达人")) {
			System.out.println("生产汤达人豚骨煮面");
		}else {
			System.out.println("生产的是康帅傅啦");
		}
	}
	
}

class InstantNoodlesFactory implements Factory{

	@Override
	public Work getWork() {
		// TODO Auto-generated method stub
		return new MakeInstantNoodles();
	}
	
}



