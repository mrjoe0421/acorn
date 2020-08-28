
public class Car {//클래스 이름
	//클래스는 멤버로 속성을 표현하는 필드와 기능을 표현하는 메소드를 가진다
	//또 클래스는 생성된 객체의 필드를 초기화해주는 특별한 메소드인 생성자를 가진다.

	private String modelName;
	private int modelYear;
	private String modelColor; //인스턴스 변수
	
	Car(String modelName, int modelYear, String modelColor){ //생성자
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.modelColor = modelColor;
	}
	public String getModel{ //메소드:어떠한 특정 작업을 수행하기 위한 명령문의 집합
		return this.modelYear + "년식" + this.modelName + " " + this.modelColor
	}
	

}
