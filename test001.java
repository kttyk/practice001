package sample001;

import java.util.Scanner;

public class test001{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("あなたのお名前は？");
		String name = s.next();
		System.out.println("身長は？");
		double a = s.nextDouble();
		System.out.println("体重は？");
		double b = s.nextDouble();
		double bmi = b / (a/100 * a/100);
		System.out.println("BMIは" + bmi + "です。" );
		
	}
}
