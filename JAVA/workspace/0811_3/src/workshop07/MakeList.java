package workshop07;

import java.util.ArrayList;
import java.util.List;

public class MakeList {
	ArrayList<Integer> list; //여기서 list를 선언해줘야 밑에서도 list 값을 받는다
							 //만약에 MakeList에 ArrayList<Integer>를 넣으면 MakeList에서만 적용된다
	public MakeList() {		//기본 생성자
			list = new ArrayList<Integer>(); //ArrayList 생성
	}
	
	public void makeArrayList(int size) {
		for(int i=0; i<size; i++) {
			list.add((int)((Math.random() * 10) +10)); 
		}
	}//list에 랜덤인 값 10개를 입력한다. 랜덤은 소수점값으로 int형으로 변환하려면 10을 곱해야한다.
	
	// ArrayList의 모든 값의 평균을 계산 하여 리턴
	public double getAverage( ) {
		double result = 0.0;
		double sum = 0;
		
		for(Integer integer : list) {
			int num = integer; //오토언박식 이용
			sum += num;
			}
		result = sum /list.size();
		return result;
	} //result와 sum을 선언, for문을 이용해 
	
	public ArrayList<Integer> getList(){
		return list; 
	} //ArrayList 리턴
}
