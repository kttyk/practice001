package sample003;

public class test019 {
	public static void main(String[] args) {
		  int min = 0;
			int a = 6;
			int b = 12;
			min = Math.min(a,b);
			
			for(int i=1; i <= min; ++i){
			  if(0 == (a % i)){
			    if(0 == (b % i)){
			      System.out.print(i);
			    }
			  }
			}
	     
		}
	}