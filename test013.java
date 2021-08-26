package sample002;

public class test013 {
	public static void main(String[] args) {
		// 以下にソースコードを入力して下さい。//
    boolean employeeFrag = true;
    boolean marriedFrag = true;
    if((employeeFrag)&&(marriedFrag)){
      System.out.println("住宅手当と配偶者手当が支給されます。");
    }else if(employeeFrag){
      System.out.println("住宅手当が支給されます。");
    }else{
      System.out.println("手当はありません。");
    }
	}
}
