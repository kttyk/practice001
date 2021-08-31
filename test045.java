package sample003;

public class test045 {
	public static void main(String[] args) {
		int count = 0;
		for(int i=1; i<32768; i++){
		  i *= 2;
		  count++;
		}
     System.out.println(count);
	}
}