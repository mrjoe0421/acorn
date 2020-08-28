package workshop07;

import java.util.ArrayList;

public class ListTest03 {
public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        RandomService test= new RandomService();
        list1 = test.makeRandomInt(list1);
        list2 = test.makeRandomInt(list2);
        test.printArrayList(list1, list2);
               }
  

}
