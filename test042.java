package sample003;

public class test042 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++){
		  if(i % 5 == 0){
		    sum += i;
		  }
		}
    System.out.println(sum);
	}
}