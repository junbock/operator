package operator;

public class Test {
	public static void main(String[] args) {
		//div test
		Calculator div = new Div();
		//1.5 출력
		System.out.println(div.calculate(3, 2));
		//0 div 에러 
		//System.out.println(div.calculate(4, 0));
		
		//combination test
		Calculator com = new Combination();
		//정상 동작 1) 6 출력
		System.out.println(com.calculate(4, 2));
		//정상 동작 2) 1 출력
		System.out.println(com.calculate(5, 5));
		//잘못된 입력 : a<b, -1 출력
		System.out.println(com.calculate(2, 4));
		//잘못된 입력 : a or b 자연수 아님, -1 출력
		System.out.println(com.calculate(5, -3));
	}	
}
