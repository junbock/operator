package operator;
/* 최소 공배수 구하기
 * 입력값이 0 이하라면 -1 반환
 */
public class LCM implements Calculator{
	public double calculate(int num1, int num2) {
		int answer;
		if (num1 <= 0 || num2 <= 0) {
			return -1.0;
		}
		for (answer = Math.max(num1, num2); answer%num1!=0||answer%num2!=0; answer++) {
			
		}
		return (double)answer;	
	}
	
}
