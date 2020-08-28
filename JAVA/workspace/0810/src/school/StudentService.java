package school;

public class StudentService {
	public Student getAStudentInfo(Student [] arr, String name) throws  StudentNotFoundException {
		Student stu =null;
//		boolean flag = false;
		for(Student student : arr) {
			if(name.equals(student.getName())) {
				stu = student;
				//flag = true;
			}
		}
		if(stu==null) {
				throw new StudentNotFoundExceptionn("찾는 학생이 없습니다/");
			}
		}
		return stu;
	}
	public double getWeightAvg() {
		
	}
	public static void main(String[] args) {
		
		

	}

}
