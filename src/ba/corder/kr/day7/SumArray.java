package ba.corder.kr.day7;

public class SumArray {
		public static void main(String[] args) {
			int array[]= {20,50,77,98,46,13,24,65,64,51};
			int sum=0;
			for(int i=0;i<array.length; i++)
			sum=sum+array[i];
			System.out.println("배열의합계"+sum);
			System.out.println("배열의평균"+(double)sum/array.length);
			
			
				
				
		}
}
