package ba.corder.kr.day7;

public class ArrayLength {
		public static void main(String[] args) {
			int arr[]= {10,20,30,40,50};
			int i;
			System.out.println("�迭�� ���Ұ� ���");
			for(i=0; i<arr.length;i++) {
				System.out.println("arr["+i+"]="+arr[i]);
			}
			int length=arr.length;
			System.out.println("�迭�Ǳ���:"+length);
		}
}
