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
		System.out.println("�ѽ��������"+(count-1)+"�Դϴ�.");
		System.out.println("���������� �հ��"+sum+"�Դϴ�.");
		System.out.println("���������� �����"+average+"�Դϴ�.");
	}
	
		
}
