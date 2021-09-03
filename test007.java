package sample001;

public class test007 {
	public static void main(String[] args) {
		int year = 0;
		double tax = 1.05;
		for(int i=10000; i<=20000; i++){
		  i *= tax;
		  year++;
		}
    System.out.println("20000円を超えるのは" + year + "年後です。");
	}
}
