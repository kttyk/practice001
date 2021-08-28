package sample003;

public class test034 {
	public static void main(String[] args) {
		String str = "11184527181468";
		int count = 0;
		String[] num = str.split("");
		
		for(int i=0; i<num.length; i++){
		  if("5".equals(num[i])){
		    count++;
		  }
		}
        System.out.println(count);
	}
}