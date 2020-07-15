package operator;

public class Test {
	public static void main(String[] args) {
		//div test
		Calculator div = new Div();
		//1.5 출력
		System.out.println(div.calculate(3, 2));
		//0 div error 
		//System.out.println(div.calculate(4, 0));
		
		//combination test
		Calculator com = new Combination();
		//정상출력 1) 12 출력
		System.out.println(com.calculate(4, 2));
		//정상출력 2) 1  출력
		System.out.println(com.calculate(5, 5));
		//비정상 입력: a<b, -1 출력
		System.out.println(com.calculate(2, 4));
		//비정상 입렵 : a or b 이 자연수 아님, -1 출력
		System.out.println(com.calculate(5, -3));
	}	
}
