package ba.corder.kr.day3;

import ba.coder.kr.day2.inputval;

public class Exercise5 {

	public static void main(String[] args) {
		Exercise5 exr= new Exercise5();
//		exr.practice04();
		exr.practice03();
		
	}
	public void practice04() {
		System.out.println("0부터 10까지의 수를 입력하시오.");
		int input=inputval.getint();
		if(input>0&&input<=10) {
			System.out.println(("정답입니다"));
		}

		else {
			System.out.println("틀렸습니당.");
		}
	


	}	
	public void practice03() {
		System.out.println("2개의정수를입력하세요.");
	
		int input01=inputval.getint();
		int input02=inputval.getint();
		
		if(input01==input02) {
			System.out.println("두수는 같습니다.");
		}
		else if(input01>input02) {
			System.out.println(input02+"보다"+input01+"이더큽니다.");
		}
		else if(input01<input02) {
			System.out.println(input01+"보다"+input02+"이더큽니다.");
		}
	}
		
}
