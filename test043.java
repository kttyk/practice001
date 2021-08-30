package sample003;

public class test043 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		do{
		  sum = sum + num;
		  num++;
		  if(sum >= 3){
		     System.out.print(sum + ",");
		  }
		}while(num <= 10);

	}
}