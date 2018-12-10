package ba.corder.kr.day5;

import javax.swing.JOptionPane;

import ba.coder.kr.day2.inputval;

public class mainclass {
	public static void main(String[] args) {

		sungjuk rec=new sungjuk();
		sungjuk rec2=new sungjuk();
		
		
		
		rec.Std_num=JOptionPane.showInputDialog("학번");
		rec.Std_name=JOptionPane.showInputDialog("이름");

		rec.eng=inputval.getint();
		rec.kor=inputval.getint();
		rec.mat=inputval.getint();
		System.out.println(rec.Std_num+rec.Std_name+"의성적입니다");
		rec.Sum();
		rec.Ave();
		
		rec2.Std_num=JOptionPane.showInputDialog("학번");
		rec2.Std_name=JOptionPane.showInputDialog("이름");

		rec2.eng=inputval.getint();
		rec2.kor=inputval.getint();
		rec2.mat=inputval.getint();
		System.out.println(rec2.Std_num+rec2.Std_name+"의성적입니다");
		rec2.Sum();
		rec2.Ave();


	}
}
