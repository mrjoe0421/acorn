package student;

public class Student01 {
	private String name;
	private  int korean;
	private  int english;
	private  int math;
	private  int science;
	
	public Student01(){}
	
	public Student01(String name, int korean, int english, int math, int science) {
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
		String result = "F학점";
		int avg = (int)getAvg();
		if(avg<=90) {
			System.out.println("A학점");
		}else if(avg<=80) {
			System.out.println("B학점");
		}else if(avg<=80) {
			System.out.println("C학점");
		}else if(avg<=80) {
			System.out.println("D학점");
		}else 
			System.out.println("F학점");
		return result;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the korean
	 */
	public int getKorean() {
		return korean;
	}

	/**
	 * @param korean the korean to set
	 */
	public void setKorean(int korean) {
		this.korean = korean;
	}

	/**
	 * @return the english
	 */
	public int getEnglish() {
		return english;
	}

	/**
	 * @param english the english to set
	 */
	public void setEnglish(int english) {
		this.english = english;
	}

	/**
	 * @return the math
	 */
	public int getMath() {
		return math;
	}

	/**
	 * @param math the math to set
	 */
	public void setMath(int math) {
		this.math = math;
	}

	/**
	 * @return the science
	 */
	public int getScience() {
		return science;
	}

	/**
	 * @param science the science to set
	 */
	public void setScience(int science) {
		this.science = science;
	}
	
}
