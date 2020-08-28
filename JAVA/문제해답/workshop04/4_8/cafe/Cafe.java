package cafe;

public class Cafe {
	Coffee[] coffeList= new Coffee[10];
	int index=0;
	public Cafe() {
		super();
//		 coffeList= new Coffee[10];//cafe 생성시  커피배열을 10개로 지정
//		 index=0;//전역으로 사용할 배열 방 번호 
	}
	public Coffee[] getCoffeList() {
		return coffeList;
	}
	public void setCoffeList(Coffee coffee) {
		if(index < 10) { //커피 객체를 배열에 저장하기전 10개가 넘는지 검사 
			coffeList[index]= coffee; //넘지 않을 경우 배열방에 저장
			index=index+1;// 다음 빈 배열 방 번호 저장 
		}else {
			System.out.println("정보 추가가 될 수 없습니다.");
		}
	}	
    public int totalPrice() {
    	int total=0;
    	for (int i = 0; i <index; i++) { //전체 배열에서 가격만꺼내와서 누적 합산계산		 
			total= total+ coffeList[i].getPrice();			
		}
    	
    	return total;
    }
}
