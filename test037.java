package sample003;

public class test037 {
	public static void main(String[] args) {
		int sum = 0;
		double average = 0;
		for(int i=0; i<=20; i++){
		  sum += i;
		  average = (double)sum / i;
		 
		}
    System.out.println("総和は" + sum + "、平均は" + average + "です。");
	}
}