package workshop07_5;

import java.util.ArrayList;

public class ListTest03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		
		
		for(int i=0; i<10; i++) {
			list1.add((int)(Math.random()*10));
			list2.add((int)(Math.random()*10));
			
			try {
				System.out.println(list1.get(i)+"/" +list2.get(i)+ " " + list1.get(i) / list2.get(i));
			} catch (Exception e) {
				System.out.println("분모가 0입니다");
			}
			

		}
		
		}
		
	}


