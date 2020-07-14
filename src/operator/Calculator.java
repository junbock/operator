package operator;

public interface Calculator {
	static double num = 0.0;
	public double calculate(int num1, int num2);
	public static void print() {
		System.out.println(num);
	}
}
