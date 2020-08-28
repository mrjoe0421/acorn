import java.util.Date;

public class TestEmp {
	
		//객체 생성 후 각 자식의 printInfo 출력
	public Emp[] createEmpArr() {
		Emp man = new Man("홍길동", "영업부");
		Emp man2 = new Man("이완용", "영업부");
		Emp en1 = new Eng("이순신", "제조업");
		Emp en2 = new Eng("강감찬", "제조업");
		
		Emp arr [] = new Emp []{man,man2,en1,en2};
	
		return arr;
		}
	
	public void printEmpArr(Emp [] arr) {
			for(Emp e : arr) {
			 System.out.println(e.printInfo());
			}	
		}
	public void printChildData(Emp e) {
		if (e instanceof Man) {
			Man m = (Man) e;
			System.out.println(m.getDepart());
		}else if(en instanceof Emp e) {
			Eng en = (Eng) e;
			System.out.println(en.getName());
		}
	}
	public Emp searChildData(Emp[]arr, String name) {
		Emp data =null;
		for(Emp e : arr) {
			if(name.equals(e.getName())) {
				data = e;
			}
		}
		return data;
	}
		
	public void searChildData2(String name, Emp[]arr) {
		String data = "";
		String token = "/";
		for (Emp e :arr) {
			if(e instanceof Man) {
				Man m = (Man) e;
				if(name.equals(m.getDepart()))
					data=data + m.getName()+token;
			}else if(e instanceof Eng) {
				Eng en = (Eng) e;
				if(name.equals(en.getSkill()))
					data= data+ en.getName()+token;
			}
			
		}
	}
	public static void main(String[] args) {
		Emp e = new Emp("홍길동");
		System.out.println(e);
		Emp m = new Man("이순신", "영업부"); 
		System.out.println(m);
//		Emp man = new Man("홍길동", "영업부");
//		Emp en1 = new Eng("이순신", "제조업");
//		Emp en2 = new Eng("강감찬", "제조업");

//		TestEmp test = new TestEmp();
//		Emp e =test.createEmp();
//		if(e instanceof Man) {
//			Man m = (Man)e;
//			System.out.println(m.getDepart());
//		}else if(e instanceof Eng) {
//			Eng en = (Eng)e;
//		}else {
//			System.out.println("잘못된 데이터");
//		}
//		test.printEmp (m);
//		test.printEmp (en1);	
//		test.printEmp (en2);
		
//		
//		Date d = new Date();
//		System.out.println(d); //참조변수만 넣을시 jdk가 자동으로 d.toString()으로 변환
//		System.out.println(d.toString());
//		
//		
//		//객체 생성 후 배열에 담기
//		Emp m = new Man("홍길동", "영업부");
//		Emp eng1 = new Eng("이순신", "제조업");
//		Emp eng2 = new Eng("강감찬", "연구업");
//		Emp [] Emps = new Emp[3]; 
//		Emps [0]= m;
//		Emps [1]= eng1;
//		Emps [2]= eng2;
//		
//		 
		 }
	}

