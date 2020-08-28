package student;

public class TestStudent {

	public static void main(String[] args) {
		
	/*	Kim 100 90 95 89
		Lee 60 70 99 98
		Park 68 86 60 40*/
		
		Student01 stu01 = new Student01("Kim", 100, 90, 95, 89);
		Student01 stu02 = new Student01("Lee", 60, 70, 99 ,98);
		Student01 stu03 = new Student01("Park", 68, 86 ,60 ,40);
		
		Student01 [ ]stu = new Student01[3];
		stu[0] = stu01;
		
/*		Kim 평균: 93.5 학점: A학점
		Lee 평균: 81.75 학점: B학점
		Park 평균: 63.5 학점: C학점*/
		System.out.println(stu01.getName()+" 평균: " 
		 + stu01.getAvg() + " 학점: " + stu01.getGrade());
		
	
		
	}

}
