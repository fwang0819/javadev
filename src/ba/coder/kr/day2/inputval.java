package ba.coder.kr.day2;

import javax.swing.JOptionPane;

public class inputval {

	public static int getint() {
		String input =		JOptionPane.showInputDialog("�Է�");
		int result =Integer.parseInt(input);
		
        return result ;
        
	}
	public static double getDouble(){
		String input =		JOptionPane.showInputDialog("�Է�");
		double result =Double.parseDouble(input);
		return result ;
		
	}
}
