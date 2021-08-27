package sample003;

public class test023 {
	public static void main(String[] args) {
		int count = 0;
		int i = 100;
		while(i % 2 == 0){
		  i /= 2;
		  count++;
		}
     System.out.println(count);
	}
}