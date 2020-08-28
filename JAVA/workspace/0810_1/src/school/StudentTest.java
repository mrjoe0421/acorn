package school;

import java.io.ObjectInputStream.GetField;

public class StudentTest {

	public static void main(String[] args) {
		Student studentArray [] = new Student[3]; //배열과 객체 생성
		studentArray [0] = new Student("홍길동",15,171,81);
		studentArray [1] = new Student("한사람",13,183,72);
		studentArray [2] = new Student("임걱정",15,175,65);
		
		double totalAge = 0.0; //평균 나이
		double totalHeight = 0.0; //평균 신장
		double totalWeight = 0.0; //평균 무게
		
		System.out.println("이름 \t 나이 \t 신장 \t 몸무게");
		for(int i=0;i<studentArray.length; i++) {
			totalAge +=studentArray[i].getAge();
			totalHeight +=studentArray[i].getHeight();
			totalWeight +=studentArray[i].getWeight();
			System.out.println(studentArray[i].getName()+"\t" +studentArray[i].getAge()+"\t"+studentArray[i].getHeight()+"\t" + studentArray[i].getWeight());
		}
		
//		System.out.println(stu1.getName() + "\t" +stu1.getAge() + "\t" +stu1.getHeight() + "\t" + stu1.getWeight());
//		System.out.println(stu2.getName() + "\t" +stu2.getAge() + "\t" +stu2.getHeight() + "\t" + stu2.getWeight());
//		System.out.println(stu3.getName() + "\t" +stu3.getAge() + "\t" +stu3.getHeight() + "\t" + stu3.getWeight());
		System.out.printf("나이의 평균: %.2f \n", totalAge /3);
		System.out.printf("신장의 평균: %.2f \n", totalHeight /3);
		System.out.printf("몸무게의 평균: %.2f \n", totalWeight /3);
		
	}

}
