package student;

public class Student {

	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	Student(){}

	public Student(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	public double getAvg() {
		int sum = korean + english + math + science;
		int avg = sum / 4;
		return avg;
		
	}
	public String getGrade() {
//		int avg=(int)getAvg();
		double avg=getAvg();
		String result;
		if( avg >= 90){
		    	result = "A 학점";
		    }else if( avg >= 70 ){
		    	result = "B 학점";
		    }else if( avg >= 50){
		    	result = "C 학점";
		    }else if( avg >= 30){
		    	result = "D 학점";
		    }else {
		    	result = "F 학점";
		    }
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
