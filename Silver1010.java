package silver;

public class Silver1010 {

	public static void main(String[] args) {
	  String[] str = new String[2];
	  str[0] = "1";
	  str[1] = "2";
	  int i = 0;
	  for(String s : str) {
		  str[i].concat("e" + i);
		  i++;
	  }
	  for(i = 0; i< str.length; i++) {
		  System.out.println(str[i]);
	  }

	}

}
