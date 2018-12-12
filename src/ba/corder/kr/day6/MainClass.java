package ba.corder.kr.day6;

public class MainClass {
	
/*public static void main(String[] args) {
	ThisTest object = new ThisTest();
	
	System.out.println("object.Age:" +object.Age);
	System.out.println("object.Speed:"+object.Speed);
	System.out.println("object.RobotName:"+object.RobotName);
    System.out.println("object.RobotNum:"+object.RobotNum);
}

*/		public static void main(String[] args) {
	Rectangle rec=new Rectangle();
	rec.setWidth(5);
	
	rec.calc();
	int recArea=rec.calc();
	System.out.println("≥–¿Ã:"+recArea);
}


		
}	
