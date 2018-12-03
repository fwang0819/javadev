package ba.corder.kr.day3;

import ba.coder.kr.day2.inputval;

public class elseif {

	public static void main(String[] args) {
		int JumSu;
		char HakJum;
		JumSu=inputval.getint();

		if(JumSu>90) {
			HakJum='a';
		}else if (JumSu>80) {
			HakJum='b';
		}else if(JumSu>70) {
			HakJum='c';

		}
		else if(JumSu>60) {
			HakJum='d';
		}
		else  {
			HakJum='f';

		}
		System.out.println("취득한학점은"+HakJum+"입니다.");
	}
}

