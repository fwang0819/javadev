package ba.corder.kr.day8;

import javax.swing.JOptionPane;

public class hoimunpanbyul {


public static void main(String[] args) {
	String input =JOptionPane.showInputDialog("please input");
	int number =Integer.parseInt(input);
	int inputArr[]=new int[input.length()];
	
	for(int i=0; i< input.length(); i++) {
		int nmg= number%10;
		inputArr[i]=nmg;
				System.out.println("nmg:"+nmg+"I number: "+number);
				number= number / 10 ;
				
	}
	//	char inputArr[]= new char[input.length()];//���ڿ��� ���̸�ŭ�� �迭����
//	for(int i=0; i<input.length(); i++) {//���ڿ��� �ɰ��� char �迭�� �ֱ� 
//		inputArr[i] = input.charAt(i);
//	}
	boolean isPalindrome=true;//flag �� : ȸ������ �ƴ��� 
	for(int i=0; i<inputArr.length/2; i++) {// 1������ �迭�� ������ŭ ���� 
		if(inputArr[i] !=inputArr[inputArr.length-1-i]) {
			isPalindrome = false;// ���ѹ��̶� ���� ��Ī�� �ƴѰ� �߰ߵǸ� 
			break;//ȸ���̾ƴϴ�.

		}
	}
	if(isPalindrome) {
		System.out.println(input+"�� ȸ���Դϴ� .");
	}
	else {
		System.out.println(input+"�� ȸ���� �ƴմϴ�.");




	}
}			

}

