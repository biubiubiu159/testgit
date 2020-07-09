package lesson.work;

import java.util.Scanner;

//递归算法求阶乘
public class Work_1 {

	private static Scanner sc;
	public static int Fac(int x) {
		if(x == 1) {
			return 1;
		}
		else {
			return x*Fac(x-1);
		}
	}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println(Fac(n));
	}

}
