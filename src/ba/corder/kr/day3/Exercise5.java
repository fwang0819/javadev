package ba.corder.kr.day3;

import ba.coder.kr.day2.inputval;

public class Exercise5 {

	public static void main(String[] args) {
		Exercise5 exr= new Exercise5();
//		exr.practice04();
		exr.practice03();
		
	}
	public void practice04() {
		System.out.println("0���� 10������ ���� �Է��Ͻÿ�.");
		int input=inputval.getint();
		if(input>0&&input<=10) {
			System.out.println(("�����Դϴ�"));
		}

		else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
	


	}	
	public void practice03() {
		System.out.println("2�����������Է��ϼ���.");
	
		int input01=inputval.getint();
		int input02=inputval.getint();
		
		if(input01==input02) {
			System.out.println("�μ��� �����ϴ�.");
		}
		else if(input01>input02) {
			System.out.println(input02+"����"+input01+"�̴�Ů�ϴ�.");
		}
		else if(input01<input02) {
			System.out.println(input01+"����"+input02+"�̴�Ů�ϴ�.");
		}
	}
		
}
