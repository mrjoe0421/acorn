
public class TestPet {
	public Pet createPet(int num) {
		Pet p =null;
		if(num==1) {
			p=new Cat("야옹이", 3, "암놈");
		}else if (num==2) {
			p=new Dog("강아지", 10, "암놈", "검정");
		}else if (num==3) {
			p=new Fish("붕어", 10, "암놈", 2.5);
		}
		return p;
	}
	public void petPrint(Pet p) {
		
		 if(p instanceof Cat) {
			Cat c = (Cat)p;
			//System.out.println(c.printInfo());
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
		Pet p = test.createPet(1);
		 if(p instanceof Cat) {
				Cat c = (Cat)p;
				//System.out.println(c.printInfo());
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
		Pet c= new Cat("야옹이", 3, "암놈"); 
		Pet d= new Dog("강아지", 10, "암놈","검정");
		Pet f= new Fish("븡어", 10, "암놈",2.5);
		Pet[] pets = new Pet[3];
		pets[0]= c;
		pets[1]= d;
		pets[2]= f;
		
		TestPet test = new TestPet(); //객체 생성
		//test.petPrint(c);
		test.arrPrint(pets);
	}
}
