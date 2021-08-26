package sample002;

public class test030 {
	public static void main(String[] args) {
		// 以下にソースコードを入力して下さい。//
		int age = 25;
		String gender = "男性";
		if((age >= 20)&&(gender == "女性")){
		  System.out.println("成人女性です。");
		}else if((age >= 20)&&(gender == "男性")){
		  System.out.println("成人男性です。");
		}else if(age < 20){
		  System.out.println("未成年です。");
		}
	}
}
