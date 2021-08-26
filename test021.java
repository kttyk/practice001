package sample002;

public class test021 {
	public static void main(String[] args) {
		// 以下にソースコードを入力して下さい。//
		int age = 25;
		String memberFrag = "非会員";
		if((age>=20)&&(memberFrag == "会員")){
		  System.out.println("1,200円です。");
		}else if((age>=20)&&(memberFrag == "非会員")){
		  System.out.println("1,500円です。");
		}else if((age<20)&&(memberFrag == "会員")){
		  System.out.println("700円です。");
		}else if((age<20)&&(memberFrag == "非会員")){
		  System.out.println("900円です。");
		}
	}
}