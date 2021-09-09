package silver;

public class Silver1001 {
 int i = 0;
 static int num = 0;
 public void test() {
	 while(i < 3) {
		 i++;
		 num++;
	 }
 }
 
 public static void main(String[] args) {
	 Silver1001 a = new Silver1001();
	 Silver1001 b = new Silver1001();
	 a.test();
	 b.test();
	 System.out.println(a.num + ":" + b.num);
 }
}
