package ba.corder.kr.day3;

import ba.coder.kr.day2.inputval;

public class Homework {
	public static void main(String[] args) {

		double num1;


		num1=inputval.getDouble();


		if(num1>0 && num1%2==0){
			System.out.println(num1+"=����̸鼭 ¦���Դϴ� .");

		}else if(num1<0 && num1%2==0)
		{
			System.out.println(num1+"=�����̸鼭 ¦���Դϴ� .");
		}else if(num1>0 && num1%2==1) {
			System.out.println(num1+"=����̸鼭 Ȧ���Դϴ� .");
		}else if(num1<0 && num1%2==1) {

			System.out.println(num1+"=�����̸鼭 ¦���Դϴ� .");

		}

	}


}


