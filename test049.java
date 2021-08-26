package sample002;

public class test049 {
	public static void main(String[] args) {
		// 以下にソースコードを入力して下さい。//
		 int age = 20;
		 int day = 1;
		 boolean studentFrag = false;
		 if(day == 1){
		   System.out.println("1,100円");
		 }else if(studentFrag){
		   System.out.println("1,800円");
		 }else if((age >= 18)&&(studentFrag != false)){
		   System.out.println("1,500円");
	   }else if((age < 18)&&(studentFrag != false)){
		   System.out.println("1,000円");
		 }

	}
}
