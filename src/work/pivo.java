package work;

import ba.coder.kr.day2.inputval;

public class pivo {
public static void main(String[] args) {
		int sum;
		int one =1;
		int two =1;
		int three ;
		int num= 20;
				
		for(int i=1; i<=num; i++){
			if(i==1) {System.out.println("1�����ǰ�:"+one);
			
			}else if (i==2) {
				System.out.println("2�����ǰ�"+two);
			}
			else {
				  three=one+two;
				System.out.println(i+"�����ǰ�:"+three);
						one=two;
						two=three;
			sum=one+two+three;
			System.out.println(sum-1);
				
			}
			
			
	
	
		}
}
}

	




