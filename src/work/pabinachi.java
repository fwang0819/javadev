package work;

public class pabinachi {
	public static void main(String[] args) {
		
		int one =0; // 1�������Ǵ� ���ڰ��� ���� 
		int two =1;//i�� ���� �����Ǿ� ����� ����
		int three ;//j�� �����Ǿ� ����� ���� 
		
		
		for(int i=0; i<=20; i++){
			if(i==1) {System.out.println("1�����ǰ�"+one);
			
			}else if (i==2) {
				System.out.println("2�����ǰ�"+two);
			}
			else {
				three=one+two;
				System.out.println(i+"�����ǰ�:"+three);
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


