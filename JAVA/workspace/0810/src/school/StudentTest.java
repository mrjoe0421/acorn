package school;

public class StudentTest {

	public static void main(String[] args) {
		Student studentArray [] = new Student[3]; //배열 생성
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		double totalAge = 0.0;
		double totalHeight = 0.0;
		double totalWeight = 0.0;
		StudentService service = new StudentService(); //객체 생성
		Student stu = null;
		try {
			stu = service.getAStudentInfo(studentArray, "김길동");
			System.out.println("검색결과======" + stu);
		}catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
		totalAge = service.getAgeAvg(studentArray);
		totalHeight = service.getHeigthAvg(studentArray);
		totalWeight = service.getWeigthAvg(studentArray);
		System.out.println("모든 정보 출력==========");
		service.printAllStudent(studentArray);
		
		System.out.println("나이의 평균 : " %.2f \n", totalAge /3);
		System.out.println("신장의 평균 : " %.2f \n", totalHeight /3);
		System.out.println("몸무게의 평균 : " %.2f \n", totalWeight /3);
//		System.out.println("이름 \t 나이 \t 신장\t 몸무게\t");		
//		for(int i =0; i<studentArray.length; i++) {
//			System.out.println(  studentArray[i].getName()+"\t" +studentArray[i].getAge()+"\t"  + studentArray[i].getHeight() +"\t" 
//			+ studentArray[i].getWeight());
//		}
		
	}

}
