package sample003;

public class test026 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++){
		  if(i % 5 == 0){
		    sum = sum + i;
		  }
		}
     System.out.println(sum);
	}
}