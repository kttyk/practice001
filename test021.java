package sample003;

public class test021 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int[] score={80,70,72,82,91,62,50,44,23,98,78,43};
		 for(int i=0; i<score.length; i++){
		 if(score[i] >= 80){
		   num1++;
		 }else if(score[i] <= 60){
		   num2++;
		 }
		 }
		  System.out.println("80点以上は" + num1 + "人です");
      System.out.println("60点以下は" + num2 + "人です");
	}
}