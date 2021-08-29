package sample003;

public class test038 {
	public static void main(String[] args) {
		int year = 0;
		int i = 10000;
		double tax = 1.05;
		while(i<=20000){
		  i *= tax;
		  i++;
		  year++;
		}
      System.out.println("20000円を超えるのは" + year + "年後です。");
	}
}