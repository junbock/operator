package operator;

public class Permu implements Calculator{
	public double calculate(int num1, int num2) {
		int permu = 1;
		for(int i=num1; i>num1-num2;i--) {
			permu *= i;
		}
		return (double)permu;
	}
}
