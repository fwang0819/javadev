package ba.corder.kr.day3;

import ba.coder.kr.day2.inputval;

public class Homework {
	public static void main(String[] args) {

		double num1;


		num1=inputval.getDouble();


		if(num1>0 && num1%2==0){
			System.out.println(num1+"=양수이면서 짝수입니다 .");

		}else if(num1<0 && num1%2==0)
		{
			System.out.println(num1+"=음수이면서 짝수입니다 .");
		}else if(num1>0 && num1%2==1) {
			System.out.println(num1+"=양수이면서 홀수입니다 .");
		}else if(num1<0 && num1%2==1) {

			System.out.println(num1+"=음수이면서 짝수입니다 .");

		}

	}


}


