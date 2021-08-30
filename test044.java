package sample003;

public class test044 {
	public static void main(String[] args) {
	    int ave = 0;
	    int sum = 0;
	    int[] num ={55,45,80};
  	    for(int i=0; i<num.length; i++){
	      sum += num[i];
	      ave = sum / num.length;
	    }
	   System.out.println(ave);

	}
}