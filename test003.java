package sample001;

public class test003 {
		public static void main(String[] args) {
			int sum =0;
			double average =0;
			for(int i=1; i<=20; i++){
			  sum = sum + i;
			  average =(double)sum / i;
			}
	   System.out.println("総和は" + sum + "、平均は" + average +"です。");
		}
	}
