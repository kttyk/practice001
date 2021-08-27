package sample003;

public class test004 {
	public static void main(String[] args) {
	 int count = 0;
	 int sum = 0;
	 while(sum + count<=500) {
		 sum += count;
		 count++;
	 }
	 System.out.println(count - 1);
	 
	}
}