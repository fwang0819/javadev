package ba.corder.kr.day5;

import ba.coder.kr.day2.inputval;

public class whileex {
	public static void main(String[] args) {
		int jum=1;
		int sum=0;
		int count=0;
		double average=0;
		
		while(jum!=0) {
			jum=inputval.getint();
			System.out.println(jum);
			sum=sum+jum;
			count++;
			
					
		}
		average=(double)sum/(count-1);
		System.out.println("총시험과목은"+(count-1)+"입니다.");
		System.out.println("시험점수의 합계는"+sum+"입니다.");
		System.out.println("시험점수의 평균은"+average+"입니다.");
	}
	
		
}
