package ba.corder.kr.day7;

public class choiso {
	public static void main(String[] args) {
		int array[]= {70,80,60,90,70};
		int i;
		int max=0;
		for(i=0;i<array.length;i++) {
			if(array[i]>max)
				max=array[i];


		}
		System.out.println(max);
		int min=max;
		for(i=0;i<array.length;i++) {
			if(array[i]<min)
				min=array[i];


		}
		System.out.println(min);
	
	}
}






