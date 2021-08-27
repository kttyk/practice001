package sample003;

public class test020 {
	public static void main(String[] args) {
		String str = "programing";
		int count = 0;
		String[] n = str.split("");
		
		for(int i=0; i<n.length; i++){
		  if("a".equals(n[i])){
		    count++;
		  }
		}
        System.out.println(count);
	}
}