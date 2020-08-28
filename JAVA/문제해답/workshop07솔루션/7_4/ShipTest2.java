package workshop07.shop;

import java.util.ArrayList;

public class ShipTest2 {
    public static void main(String[] args) {
        Boat boat = new Boat("Boat01", 500);
        Cruise cruise = new Cruise("Cruise01", 1000);
        
        ArrayList<Ship> list = new ArrayList<Ship>();
        list.add(boat);
        list.add(cruise);
        
        System.out.println("shipName\tfuelTank");
        System.out.println("--------------------------");
        
        for(int i = 0; i < list.size(); i++) {
            Ship ship = list.get(i);
            System.out.println(ship.getShipName() + "\t" + ship.getFuelTank());
        }
        
        System.out.println();
        System.out.println("10 운항");
        
        System.out.println("shipName\tfuelTank");
        System.out.println("--------------------------");
        
        for(int j = 0; j < list.size(); j++) {
            Ship ship = list.get(j);
            
            //Boat인지 Cruise인지 판별
            if(ship instanceof Boat) {
                ship.sail(10); 	
            }else {
                
                ship.sail(15);
            }
            System.out.println(ship.getShipName() + "\t" + ship.getFuelTank());           
        }
        
        System.out.println();
        System.out.println("50 주유");

        System.out.println("shipName\tfuelTank");
        System.out.println("--------------------------");

        for(int k = 0; k < list.size(); k++) {
            Ship ship = list.get(k);
          //Boat인지 Cruise인지 판별
            if(ship instanceof Boat) {
            	 ship.refuel(20);	
            }else {
                
                ship.sail(30);
            }
            System.out.println(ship.getShipName() + "\t" + ship.getFuelTank());
        }
    }

}
