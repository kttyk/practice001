package sample002;

public class test047 {
	public static void main(String[] args) {
		// 以下にソースコードを入力して下さい。//
		int num = 25;
		if(num % 3 == 0){
		  System.out.println("3の倍数です。");
		}else if(num % 5 == 0){
		  System.out.println("5の倍数です。");
		}else if((num % 3 == 0)&&(num % 5 == 0)){
		  System.out.println("3の倍数かつ5の倍数です。");
		}else if((num % 3 != 0)&&(num % 5 != 0)){
		  System.out.println("3の倍数でも5の倍数でもありません。");
		}

	}
}
