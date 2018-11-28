package ba.coder.kr.day2;

import javax.swing.JOptionPane;

public class inputval {

	public static int getint() {
		String input =		JOptionPane.showInputDialog("입력");
		int result =Integer.parseInt(input);
		
        return result ;
        
	}
	public static double getDouble(){
		String input =		JOptionPane.showInputDialog("입력");
		double result =Double.parseDouble(input);
		return result ;
		
	}
}
