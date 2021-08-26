package sample002;

public class test017 {
	public static void main(String[] args) {
		// 以下にソースコードを入力して下さい。//
    String hobby = "テニス";
    switch(hobby){
      case "ゲーム": case "お絵かき": case "お料理":
        System.out.println("あなたはインドア派でしょう。");
        break;
      case "ウォーキング": case "テニス": case "BBQ":
        System.out.println("あなたはアウトドア派でしょう。");
        break;
    }
	}
}
