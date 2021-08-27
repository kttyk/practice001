package sample003;

public class test024 {
	public static void main(String[] args) {
		
		int[] score = {65,52,84,39,95,76};
		int max = score[0];
		
    for(int i=0; i<score.length; i++){
      max = Math.max(max,score[i]);
      
    }
    System.out.println(max);
	}
}