package operator;
/* 나눗셈
 * 분모가 0이면 0을 반환
 */
public class Div implements Calculator {
	public double calculate(int num1, int num2) {
		if (num2 == 0) {
			return 0.0;
		}
		return (double)num1/num2;
	}
}
