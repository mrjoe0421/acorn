
public class TestPet {

	public static void main(String[] args) {
		Cat c =new Cat("고양이",10);
		System.out.println(c);
		Pet c1 = new Cat("고양이",10);
		System.out.println(c1);
		Movement c2= new Cat("고양이", 10);
		System.out.println(c2);
		c2.cry();
		
		Dog d = new Dog("하루", 2, "블랙");
		System.out.println(d);
		
		Movement[] mov = new Movement[2];
		mov[0]= c;
		mov[1]= d;
		for(Movement m : mov) {
			System.out.println(m);
		}
		Cat cat = (Cat)mov[0];
		System.out.println(cat.getGender());
		
	}

}
