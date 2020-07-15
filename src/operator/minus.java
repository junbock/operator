package operator;

public class minus {

	public static Object calculate(int num1, int num2) {

		if (num1 > num2) {
			return (double) num1 - num2;
		} else {
			return (double) num2 - num1;
		}

	}

}
