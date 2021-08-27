package sample003;

public class test030 {
	public static void main(String[] args) {
		int count = 0;
		int[] num ={2,5,8,5,5};
		for(int i=0; i<num.length; i++){
		  if(num[i] == 4){
		    count++;
		  }
		}
      System.out.println(count);
	}
}