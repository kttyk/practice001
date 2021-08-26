package sample002;

public class test007 {
	public static void main(String[] args) {
		// 以下にソースコードを入力して下さい。//
    boolean employeeFrag = true;
    boolean marriedFrag = false;
    if((employeeFrag)&&(marriedFrag == true)){
      System.out.println("住宅手当と配偶者手当が支給されます。");
    }else if(employeeFrag){
      System.out.println("住宅手当が支給されます。");
    }else{
      System.out.println("手当はありません。");
    }
	}
}
