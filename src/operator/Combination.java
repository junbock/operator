package operator;
/* 조합 계산기
 * a가 b보다 크거나 같아야함,아니면 -1 반환
 * a와 b가 자연수가 아니면 -1 반환
 */
public class Combination implements Calculator {
	public double calculate(int num1, int num2) {
		double up = 1.0;
		double down = 1.0;
		
		if (num1 <= 0 || num2 <= 0) {
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
