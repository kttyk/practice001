package sample003;

public class test001 {
	public static void main(String[] args) {
		double money = 10000;
		double tax = 0.05;
		for(int i=1; i<=10; i++){
		  money *= tax + 1;
		}
        System.out.println("10年後は" + money + "です。");
	}
}
