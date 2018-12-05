package ba.corder.kr.day4;

import ba.coder.kr.day2.inputval;

public class SwitchCase {

	public static void main(String[] args) {
		int in_Num;
		in_Num=inputval.getint();		
		
		switch(in_Num){
			case 1:
				System.out.println("예금조회를 선택하셧습니다"); break;
			case 2:
				System.out.println("예금출금을선택하셨습니다"); break;
			case 3:
				System.out.println("예금입금을 선택하셨습니다"); break;
			case 4:
				System.out.println("이체를 선택하셧습니다"); break;
			default :
				System.out.println("번호를 잘못누르셨습니다. ."); break;
				
		}
	}
}
