package operator;
/* ���� ����
 * a�� b���� ũ�ų� ���ƾ���,�ƴϸ� -1 ��ȯ
 * a�� b�� �ڿ����� �ƴϸ� -1 ��ȯ
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
		
		return up/down;
	}
}
