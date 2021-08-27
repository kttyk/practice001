package sample003;

public class test028 {
	public static void main(String[] args) {
		int a = 8;
		int b = 12;
		int c = 0;
		
		while((c = a%b) != 0 ){
		  a = b;
		  b = c;
		}
    System.out.println(b);
	}
}