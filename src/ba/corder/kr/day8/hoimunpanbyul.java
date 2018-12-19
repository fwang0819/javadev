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
	//	char inputArr[]= new char[input.length()];//문자열의 길이만큼의 배열길이
//	for(int i=0; i<input.length(); i++) {//문자열을 쪼개어 char 배열에 넣기 
//		inputArr[i] = input.charAt(i);
//	}
	boolean isPalindrome=true;//flag 값 : 회문인지 아닌지 
	for(int i=0; i<inputArr.length/2; i++) {// 1차원의 배열의 반절만큼 돌기 
		if(inputArr[i] !=inputArr[inputArr.length-1-i]) {
			isPalindrome = false;// 단한번이라도 서로 대칭이 아닌게 발견되면 
			break;//회문이아니다.

		}
	}
	if(isPalindrome) {
		System.out.println(input+"은 회문입니다 .");
	}
	else {
		System.out.println(input+"은 회문이 아닙니다.");




	}
}			

}

