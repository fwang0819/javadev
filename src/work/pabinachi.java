package work;

public class pabinachi {
	public static void main(String[] args) {
		
		int one =0; // 1씩증가되는 숫자가될 변수 
		int two =1;//i의 값이 누적되어 저장될 변수
		int three ;//j가 누적되어 저장될 변수 
		
		
		for(int i=0; i<=20; i++){
			if(i==1) {System.out.println("1번쨰의값"+one);
			
			}else if (i==2) {
				System.out.println("2번쨰의값"+two);
			}
			else {
				three=one+two;
				System.out.println(i+"번쨰의값:"+three);
						one=two;
						two=three;
				
				
			}
			
			
			System.out.println(one);
			three= one;
			one=two;
			two=three;
		}
	}

	}


