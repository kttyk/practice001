package sample001;

public class test011 {
	public static void main(String[] args) {
		int ave =0;
		int sum =0;
		int[] height ={156,173,184,165,167};
		for(int i=0; i<height.length; i++){
		sum = sum + height[i];
		ave = sum / height.length;
		}
		System.out.println(ave);
	}
}
