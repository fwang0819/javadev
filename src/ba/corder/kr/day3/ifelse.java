package ba.corder.kr.day3;
import javax.swing.JOptionPane;

public class ifelse {
	public static void main (String[]args) {
		int dat;
		String inputData = JOptionPane.showInputDialog("�����");
		dat=	Integer.parseInt(inputData);
		if(dat%10==0)
		{System.out.println(dat+"=10�ǹ���Դϴ�.");
		}
		else {
			System.out.println(dat+"=10�ǹ�����ƴմϴ�.");

		}


	}
}
