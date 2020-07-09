package lesson.work;

//this关键字的使用
class P{
	private int age = 5;
	public void show() {
		int age = 4;
		System.out.println(this.age);
		System.out.println(age);
	}
}
public class Work_3 {

	public static void main(String[] args) {
        P p = new P();
        p.show();
	}

}
