package ba.corder.kr.day7;

import javax.swing.JOptionPane;

public class ArrayTest2 {
	public static void main(String[] args) {
		
		String str[]= {"황","세","현","천","재"};
		String res="";
		int i;
		for(i=0;i<str.length;i++) {
			res=res+str[i]+"\n";
					}
		System.out.println(res);
		JOptionPane.showMessageDialog(null,"배열의원소의갑\n"+res);
	}
}
