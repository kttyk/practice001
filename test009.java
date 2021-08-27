package sample003;

public class test009 {
	public static void main(String[] args) {
		int sum = 0;
		int ave = 0;
		int[] height ={156,173,184,165,167};
		
		for(int i=0; i<height.length; i++){
		  sum = sum + height[i];
		  ave = sum / height.length;
		}
      System.out.println(ave);
      
	}
}