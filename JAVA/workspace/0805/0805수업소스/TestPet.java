
public class TestPet {
	public Pet[] createPetArr() {
		Pet c= new Cat("야옹이", 3, "암놈"); 
		Pet d= new Dog("강아지", 10, "암놈","검정");
		Pet f= new Fish("븡어", 10, "암놈",2.5);
		Pet[] pets = new Pet[3];
		pets[0]= c;
		pets[1]= d;
		pets[2]= f;
		return pets; //pet의 배열
	}
	public Pet createPet(int num) {
		Pet p=null;
		if(num==1) {v
			p= new Cat("야옹이",3,"암놈");
		}else if(num==2) {
			p=new Dog("강아지", 10, "암놈","검정");
		}else if(num==3) {
			p= new Fish("븡어", 10, "암놈",2.5);
		}
	}
	public void petPrint(Pet p) {
		
		 if(p instanceof Cat) {
			Cat c = (Cat)p;
			System.out.println(c.printInfo());
			System.out.println(c.getGender());
		}else if(p instanceof Dog) {
			Dog d = (Dog)p;
			System.out.println(d.getColor());
		}else if(p instanceof Fish) {
			Fish f = (Fish)p;
			System.out.println(f.getTailSize());
		}else {
			System.out.println("잘못된 데이터");
		}
		 
	}
	
	public void arrPrint(Pet [] pets) {
		for(Pet p : pets) {
			System.out.println(p.printInfo());
		}
	}
	
	public static void main(String[] args) {
		
		TestPet test= new TestPet();
		Pet [] pets=test.createPetArr();
		test.arrPrint(pets);
		
	}
}
