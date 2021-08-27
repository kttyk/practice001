package sample003;

public class test013 {
	public static void main(String[] args) {
		int students = 0;
		int points = 0;
		int[]score={65,52,84,39,95,76};
		for(int i=0; i<score.length; i++){
		  
		if(score[i] <= 60){
		  students++;
		  points += score[i];
		
		}
		}
     System.out.println("60点以下の生徒は" + students +"人でその点数の合計は" + points + "点です。");
	}
}