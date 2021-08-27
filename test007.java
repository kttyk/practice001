package sample003;

public class test007 {
	public static void main(String[] args) {
		int i = 1;
		int count =0;
		while(i < 32768){
		  i *= 2;
		  i++;
		  count++;
		}
   System.out.println(count);
	}
}