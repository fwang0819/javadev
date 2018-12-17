package work;

public class suyeol {
	public static void main(String[] args) {

		int i =0; // 1씩증가되는 숫자가될 변수 
		int j =1;//i의 값이 누적되어 저장될 변수
		int k =1;//j가 누적되어 저장될 변수 
		do {
			i++;
			j=i+j;
			k=k+j;
		}while(i<19);
		System.out.println(k);
	}
}
