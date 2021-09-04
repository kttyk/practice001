package sample001;
import java.util.Scanner;

public class test012 {
   public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  int wincount =0;
	  int drawcount =0;
	  int losecount =0;
	  
	  String[] texts = {"グー","チョキ","パー"};
	  System.out.println("じゃんけん大会のはじまりです。");
	  
	  boolean playing = true;
	  
	  while(playing) {
		  System.out.println("何だす");
		  System.out.println("[0]グー[1]チョキ[2]パー[9]やめる");
		  
		  int command = s.nextInt();
		  if(command == 9) {
			  playing = false;
			  continue;
		  }
		  int comp =(int)(Math.random() *3);
		  
		  System.out.println("あなたは" + texts[command] + " / COMは" + texts[comp]);
		  
		  if(comp == command) { drawcount++; }
		  else if((comp + 3 - command) % 3  == 1){ wincount++; }
		  else { losecount++; }
		  System.out.println("現在のスコアは" + wincount + "勝" + losecount + "負け" + drawcount +"引き分けでした。");
	  }
	  System.out.println("ゲーム終わり");
	  System.out.println("最終のスコアは" + wincount + "勝" + losecount + "負け" + drawcount +"引き分けでした。");

   }
}
