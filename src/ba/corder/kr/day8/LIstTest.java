package ba.corder.kr.day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LIstTest {
	public static void main(String[] args) {
		List<Integer>ls = new ArrayList<Integer>();
		for(int i=1; i<10; i++) {
			ls.add(i);
			
		}
			
			int sum=0;
			int max=0;
				for(int i=0;i<ls.size(); i++)
				sum=sum+ls.get(i);
				if(ls.get(i)>max)
					max=ls.get(i);
				System.out.println("배열의합계"+sum);
				System.out.println("배열의평균"+(double)sum/ls.size());
				
//		ls.add("1");
//		ls.add("2");
//		ls.add("3");
//		ls.add("4");
//		ls.add("5");
//		ls.add("6");
//		ls.add("7");
//		ls.add("8");
//		ls.add("9");
		//1부터 9까지 입력하는 반복문 
//		for(int i=0; i<ls.size(); i++) {
//			System.out.println(i+":"+ls.get(i).toString());
//		}
		//일반적인 for문
//		for(int i=0; i<ls.size(); i++) {
//			System.out.println("ls.get(i)"+ls.get(i));
//		}
		//향상된 for문
//		for(int num : ls ) {
//			System.out.println("num:"+num);
//		}
//		List<String>ls=new ArrayList <String>();
//		ls.add("HI");
//		ls.add("Have");
//		ls.add("a nice day");
//		
//		for(int i=0; i<ls.size(); i++) {
//			System.out.println(i+":"+ls.get(i).toString());
//		}
//		System.out.println();
//		
//		ls.add(3,"Every day~");
//		for(int i=0; i<ls.size(); i ++ )
//			System.out.println(i+":"+ls.get(i).toString());
//		System.out.println();
//		
//		ls.remove(0);
//		for(int i=0; i<ls.size(); i++)
//			System.out.println(i+":"+ls.get(i).toString());
//		System.out.println();
//		Iterator<String>iter=ls.iterator();
//				while(iter.hasNext()) {
//					System.out.println(iter.next());
//				}
//		ls.clear();
//		if(ls.isEmpty()) {
//			System.out.println("list empty");
		}
	}

