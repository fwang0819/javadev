package ba.corder.kr.day8;

import ba.coder.kr.day2.inputval;

public class first {	
	
	public static void main(String[] args) {
		int A[]= new int[10];
		int B= inputval.getint();
		int BB= B;
		int C=-1;
		int MOK=B;
			
		while(MOK !=0) {
			C =C+1;
					MOK=(int)(B/2);
			int NMG=MOK %2;
			
			A[C]=NMG;
			B=MOK;
		}
		System.out.println("BB:"+BB);
		
		for(int i=C; i>-1; i--) {
			System.out.print(A[i]);
			
		}
	}

}
