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
        	System.out.println("입력받은숫자:"+sosupan);
            System.out.println("소수");
        }else{
            System.out.println("소수 아님");           
        }
    }
}
 
			
