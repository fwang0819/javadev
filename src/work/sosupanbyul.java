package work;

import ba.coder.kr.day2.inputval;

public class sosupanbyul {
	public static void main(String[] args) {
		int sosupan= inputval.getint();
		int nanugi=2;
		while(sosupan%nanugi != 0){
            nanugi = nanugi+1;           
        }
       
        if(sosupan==nanugi){          
        	System.out.println("�Է¹�������:"+sosupan);
            System.out.println("�Ҽ�");
        }else{
            System.out.println("�Ҽ� �ƴ�");           
        }
    }
}
 
			
