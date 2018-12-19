package work;

import ba.coder.kr.day2.inputval;

public class hoi {
	public static void main(String[] args) {
		int arr[]= new int[10]; 
		
		int shib=inputval.getint();
		System.out.println("10진수를 2진수로 변활할수="+ shib);
		int c=0;
		int mok=0;
		int nmg=0;
		
		do {
			mok=(int)shib/2;
			nmg=shib-mok*2;
			
			c=c+1;
			arr[c]=nmg;
			
			shib=mok;
			
		}while(mok!=0);
		
		for(int i=c; i>0;i--) {
			System.out.print(arr[i]+"");
			
		}
		
		
	}
}
