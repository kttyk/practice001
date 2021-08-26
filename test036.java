package sample002;

public class test036 {
	public static void main(String[] args) {
		// 以下にソースコードを入力して下さい。//
		int month = 9;
		switch(month){
		  case 2:
		    System.out.println("28日です。");
		    break;
		  case 4: case 6: case 9: case 11:
		    System.out.println("30日です。");
		    break;
		  case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		    System.out.println("31日です。");
        break;		    
		}
	}
}
