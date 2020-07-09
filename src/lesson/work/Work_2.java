package lesson.work;

import java.util.Random;
import java.util.Scanner;

//猜数字游戏
public class Work_2 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        Random r = new Random();
        int i = r.nextInt(10);
		int guess = sc.nextInt();
        while(guess != i) {
        	if(guess > i) {
        		System.out.println("big");
        	}
        	else if(guess < i) {
        		System.out.println("small");
        	}
        	guess = new Scanner(System.in).nextInt();
        }
        System.out.println("congratulation");
	}

}
