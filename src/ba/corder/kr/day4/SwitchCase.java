package ba.corder.kr.day4;

import ba.coder.kr.day2.inputval;

public class SwitchCase {

	public static void main(String[] args) {
		int in_Num;
		in_Num=inputval.getint();		
		
		switch(in_Num){
			case 1:
				System.out.println("������ȸ�� �����ϼ˽��ϴ�"); break;
			case 2:
				System.out.println("��������������ϼ̽��ϴ�"); break;
			case 3:
				System.out.println("�����Ա��� �����ϼ̽��ϴ�"); break;
			case 4:
				System.out.println("��ü�� �����ϼ˽��ϴ�"); break;
			default :
				System.out.println("��ȣ�� �߸������̽��ϴ�. ."); break;
				
		}
	}
}
