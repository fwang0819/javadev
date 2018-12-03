package ba.corder.kr.day3;
import javax.swing.JOptionPane;

public class ifelse {
	public static void main (String[]args) {
		int dat;
		String inputData = JOptionPane.showInputDialog("갑잆력");
		dat=	Integer.parseInt(inputData);
		if(dat%10==0)
		{System.out.println(dat+"=10의배수입니다.");
		}
		else {
			System.out.println(dat+"=10의배수가아닙니다.");

		}


	}
}
