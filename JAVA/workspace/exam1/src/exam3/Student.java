package exam3;

public class Student {
		private String name;
		private int korean;
		private int english;
		private int math;
		private int science;
		
		Student () {}

		public Student(String name, int korean, int english, int math, int science) {
			super();
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
			this.science = science;
		}
		
		double getAvg() {
			int sum = korean + english + math + science;
			int avg = sum/4;
			return avg;
		}
		
		String getGrade() {
			int avg=0;
			String result = "F학점";
			if(avg>=90) {
				System.out.println("A학점");
			}else if(avg>=80) {
				System.out.println("B학점");
			}else if(avg>=70) {
				System.out.println("C학점");
			}else if(avg>=60) {
				System.out.println("D학점");
			}else {
				System.out.println(result);
			}
			return result;
			
			
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getKorean() {
			return korean;
		}


		public void setKorean(int korean) {
			this.korean = korean;
		}


		public int getEnglish() {
			return english;
		}


		public void setEnglish(int english) {
			this.english = english;
		}


		public int getMath() {
			return math;
		}


		public void setMath(int math) {
			this.math = math;
		}

		public int getScience() {
			return science;
		}

		public void setScience(int science) {
			this.science = science;
		}
}
