package sample003;

public class test039 {
	public static void main(String[] args) {
		int[] a ={1,2,3,4,5};
		int[] b ={1,2,3,4,5,6,7};

		
		for(int i=1; i<=a.length; i++){
		  for(int j =1; j<=b.length; j++){
		    if(((i * j) % 3 == 0) && (i == 3)) {
		         System.out.print(i * j);
		    }else if(((i * j) % 3 == 0) && (i > 3) && (i < j)) {
		    	 System.out.print(i * j);
		    } 
		  }
		}

	}
}