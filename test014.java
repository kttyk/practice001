package sample002;

public class test014 {
	public static void main(String[] args) {
	int income = 5000000;
	if(income >= 40000000){
	  System.out.println("税率は45%、控除金額は479万6,000円です。");
	}else if((income>=18000000)&&(income<40000000)){
	  System.out.println("税率は40%、控除金額は279万6,000円です。");
	}else if((income>=9000000)&&(income<18000000)){
	  System.out.println("税率は33%、控除金額は153万6,000円です。");
	}else if((income>=6950000)&&(income<9000000)){
	  System.out.println("税率は23%、控除金額は63万6,000円です。");
	}else if((income>=3300000)&&(income<6950000)){
	  System.out.println("税率は20%、控除金額は42万7,500円です。");
	}else if((income>=1950000)&&(income<3300000)){
	  System.out.println("税率は10%、控除金額は9万7,500円です。");
	}else if(income<1950000){
	  System.out.println("税率は5%、控除金額は0円です。");
	}
}
}
