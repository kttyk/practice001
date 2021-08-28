package sample003;

public class test035 {
	public static void main(String[] args) {
	int[]point ={65,52,84,39,95,76};
	String[] people ={"山田","田中","鈴木","山下","松井","武田"};
	int min = point[0];
	 for(int i=0; i<point.length; i++){
	   if(min > point[i])min = point[i];
	 } 
	 System.out.println(min);
	}
}