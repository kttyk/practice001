package sample003;

public class test032 {
	public static void main(String[] args) {
		  
		int[] num ={12,24,18,35,21};
			for(int i=0; i < num.length - 1; i++){
		   for(int j=i + 1; j < num.length; j++){
		   if(num[i] > num[j]){
		     int a = num[i];
		     num[i] = num[j];
		     num[j] = a;
		    }
		  }
		}
		for(int i=0; i<num.length; i++){
     System.out.print(num[i] + ",");
	  }
	}
}