package operator;

public class Pytha implements Calculator {
	public double calculate(int num1, int num2) {
		return Math.sqrt(num1*num1+num2*num2);
	}
}
