package ba.corder.kr.day5;

public class sungjuk {
	public String Std_num;
	public int kor,eng,mat;
	public String Std_name;
	public int Sum() {
		System.out.println("�հ��"
				+(kor+eng+mat)+"�Դϴ�");
		return kor+eng+mat;

	}
	public void Ave()
	{
		System.out.println("�����"+(Sum()/3)+"�Դϴ�");
	}
}
