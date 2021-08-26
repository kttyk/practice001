package sample002;

public class test048 {
	public static void main(String[] args) {
		// 以下にソースコードを入力して下さい。//
		int age = 15;
		int day = 25;
		boolean studentFrag = true;
		if(day == 1){
		  System.out.println("1,100円");
		}else if(studentFrag != true){
		  System.out.println("1,800円");
		}else if((age >= 18)&&(studentFrag)){
		  System.out.println("1,500円");
		}else if((age < 18)&&(studentFrag)){
		  System.out.println("1,000円");
		}

	}
}