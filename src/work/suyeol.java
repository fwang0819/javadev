package work;

public class suyeol {
	public static void main(String[] args) {

		int i =0; // 1�������Ǵ� ���ڰ��� ���� 
		int j =1;//i�� ���� �����Ǿ� ����� ����
		int k =1;//j�� �����Ǿ� ����� ���� 
		do {
			i++;
			j=i+j;
			k=k+j;
		}while(i<19);
		System.out.println(k);
	}
}
