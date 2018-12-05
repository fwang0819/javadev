package ba.coder.kr.day2;

public class work6 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double aVal= inputval.getDouble();

		double bVal= inputval.getDouble();
		double cVal =inputval.getDouble();
		
		double dVal =inputval.getDouble();
		
		double eVal =inputval.getDouble();
		System.out.println("1과목점수는"+aVal+"입니다");
		System.out.println("2과목점수는"+bVal+"입니다");
		System.out.println("3과목점수는"+cVal+"입니다");
		System.out.println("4과목점수는"+dVal+"입니다");
		System.out.println("5과목점수는"+eVal+"입니다");
		System.out.println("1~5과목의합계는"+(aVal+bVal+cVal+dVal+eVal)+"입니다");
		System.out.println("1~5과목의평균은"+((aVal+bVal+cVal+dVal+eVal)/5)+"입니다");
	}

}
