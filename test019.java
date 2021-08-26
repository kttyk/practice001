package sample002;

public class test019 {
	public static void main(String[] args) {
		// 以下にソースコードを入力して下さい。//
		int year = 2022;
		if(year % 4 == 0){
		  System.out.println("うるう年です。");
		}else if(year % 100 != 0){
		  System.out.println("うるう年ではありません。");
		}else if(year % 400 == 0){
		  System.out.println("うるう年です。");
		}
	}
}
