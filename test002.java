package sample002;

public class test002 {
	public static void main(String[] args) {
		// 以下にソースコードを入力して下さい。//
  double bmi = 28;
  if(bmi<18.5){
    System.out.println("低体重");
  }else if(bmi<25){
    System.out.println("普通体重");
  }else if(bmi<30){
    System.out.println("肥満(1度)");
  }else if(bmi<35){
    System.out.println("肥満(2度)");
  }else if(bmi<40){
    System.out.println("肥満(3度)");
  }else if(bmi>=40){
    System.out.println("肥満(4度)");
  }
	}
}
