package ba.corder.kr.day7;

import javax.swing.JOptionPane;

public class ArrayTest2 {
	public static void main(String[] args) {
		
		String str[]= {"Ȳ","��","��","õ","��"};
		String res="";
		int i;
		for(i=0;i<str.length;i++) {
			res=res+str[i]+"\n";
					}
		System.out.println(res);
		JOptionPane.showMessageDialog(null,"�迭�ǿ����ǰ�\n"+res);
	}
}
