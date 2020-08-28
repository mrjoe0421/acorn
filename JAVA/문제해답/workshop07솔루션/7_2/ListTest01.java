package workshop07;

import java.util.ArrayList;

public class ListTest01 {
    public static void main(String args[]){
       // int size = Integer.parseInt(args[0]);
        int size= 10;
        MakeList makeList = new MakeList();
        makeList.makeArrayList(size);
        
        ArrayList<Integer> list = null;
        
        list = makeList.getList();

        for(int inx = 0; inx<list.size(); inx++){
            System.out.print(list.get(inx) + " ");
        }

        System.out.println();
        System.out.println("평균 : " + makeList.getAverage());
    }

}
