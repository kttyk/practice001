 package sample003;

public class test016 {
	public static void main(String[] args) {
		String str = "12345234112345";
		int count = 0;
		
		String[] num = str.split("");
		for(int i=0; i<num.length; i++){
		  if("2".equals(num[i])){
		    count++;
		  }
		}
      System.out.println(count);
	}
}