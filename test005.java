package sample003;

public class test005 {
	public static void main(String[] args) {
		  int sum = 0;
			for(int i=1; i<=50; i++){
			   if(i % 3 != 0){
			   sum += i;
			   }
			}
	      System.out.println(sum);
		}
	}