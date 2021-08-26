package sample002;

public class test015 {
	public static void main(String[] args) {
		// 以下にソースコードを入力して下さい。//
    int num1 =9;
    int num2 =12;
    if(num1 % 3 == 0){
      num1 /= 3;
    }else {
      num1 /= 2;
    }
    if(num2 % 5 == 0){
      num2 /= 5;
    }else {
      num2 /= 2;
    }
    if((num1 + num2) % 3 == 0){
      System.out.println((num1 + num2) * 3);
    }else {
      System.out.println((num1 + num2) * 5);
    }
	}
}

