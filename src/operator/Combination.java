package operator;
/* 조합 계산기
 * 비정상입력 (예외)
 * 	입력값 자연수가 아니면 -1 출력
 * 	num1 이 num2보다 작으면 -1 출력
*/
public class Combination implements Calculator {
	public double calculate(int num1, int num2) {
		double up = 1.0;
		double down = 1.0;
		
		if (num1 < 0 || num2 < 0) {
			return -1.0;
		}
		
		if (num1 < num2) {
			return -1.0;
		}
		
		
		for (int i = 1; i <= num1; i++) {
			up *= i;
		}
		
		for (int i = 1; i <= num2; i++) {
			down *= i;
		}
		
		for (int i = 1; i <= num1-num2; i++) {
			down *= i;
		}
		
		return up/down;
	}
}
