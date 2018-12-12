package ba.corder.kr.day6;

public class ThisTest {
	public int Speed;
	public int Age;
	public String RobotName;
	public String RobotNum;

	public ThisTest() {
		this(0,0,"","");
		
	}

	
	public ThisTest(int Age,String RobotName,String RobotNum) {
		this.Age=Age;
		this.RobotNum=RobotNum;
		this.RobotName=RobotName;
	}
	public ThisTest(int Age,int Speed,String RobotName,String RobotNum) {
		this.Age=Age;
		this.Speed=Speed;
		this.RobotNum=RobotNum;
		this.RobotName=RobotName;
	}


	public int getSpeed() {
		return Speed;
	}


	public void setSpeed(int speed) {
		Speed = speed;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public String getRobotName() {
		return RobotName;
	}


	public void setRobotName(String robotName) {
		RobotName = robotName;
	}


	public String getRobotNum() {
		return RobotNum;
	}


	public void setRobotNum(String robotNum) {
		RobotNum = robotNum;
	}
	
}		 

