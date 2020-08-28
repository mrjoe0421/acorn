package school;

public class StudentTest {

	public static void main(String[] args) {

		/*
		 * Kim 100 90 95 89 Lee 60 70 99 98 Park 68 86 60 40
		 */

		Student studentArray[] = new Student[3];
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		double totalAge = 0.0;//평균나이
		double totalHeight = 0.0; //평균키
		double totalWeight = 0.0; //평균몸무게
		StudentService service= new StudentService();
		Student stu= null;
		try {
		 stu= service.getAStudentInfo(studentArray, "김길동");//검색결과 없음
		 System.out.println("검색결과 ======="+ stu);
		}catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
		totalAge= service.getAgeAvg(studentArray);
		totalHeight= service.getHegithAvg(studentArray);
		totalWeight= service.getWeithAvg(studentArray);
		System.out.println("모든 정보 출력 =========");
		service.printAllStudent(studentArray);
//		
//		
//		
//		System.out.println("이름 \t 나이 \t 신장 \t 몸무게");
//		for (int i = 0; i < studentArray.length; i++) {
//			totalAge += studentArray[i].getAge();
//			totalHeight += studentArray[i].getHeight();
//			totalWeight += studentArray[i].getWeight();
//			System.out.println(studentArray[i].getName() + " \t " + studentArray[i].getAge() + " \t "
//					+ studentArray[i].getHeight() + " \t " + studentArray[i].getWeight());
//		}
//		System.out.println();
		System.out.printf("나이의 평균 : %.2f \n", totalAge / 3);
		System.out.printf("신장의 평균 : %.2f \n", totalHeight / 3);
		System.out.printf("몸무게의 평균 : %.2f \n", totalWeight / 3);
	}

}
