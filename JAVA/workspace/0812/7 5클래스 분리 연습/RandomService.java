package workshop07;

import java.util.ArrayList;

public class RandomService {
	public ArrayList<Integer> makeRandomInt(ArrayList<Integer> list) {
		 for(int i = 0 ; i < 10; i++) {
	            int randomValue1 = (int) (Math.random() * 10);	         
	            list.add(randomValue1);	          
	        }
		return list;		
	}
	
	public void printArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		 for(int i = 0; i < 10; i++) {
	            int list1Value = list1.get(i);
	            int list2Value = list2.get(i);
	            
	            try {
	                System.out.print(list1Value + "/" + list2Value + " ");
	                System.out.println(list1Value / list2Value);
	                
	            } catch (Exception e) {
	                System.out.println("분모가 0입니다");
	            }
		 }
	}
}
