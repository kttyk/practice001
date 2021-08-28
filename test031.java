package sample003;

public class test031 {
	public static void main(String[] args) {
		int[] a ={1,2,3};
		int[] b ={2,3,4};
		int[] c = new int[a.length];
		int i = 0, j=0, k=0;
		while(i<a.length && j<b.length){
		  if(a[i] < b[j]){
		    i++;
		  }else if(a[i] > b[j]) {
			j++;
		  }else {
			c[k] = a[i];
			i++;
			j++;
			k++;
		  }
		}
        for(int l=0; l<c.length;l++) {
        	System.out.print(c[l]);
        }
	}
}