package operator;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		// div test

		Scanner s = new Scanner(System.in);

		Calculator com = new Combination();

		Calculator div = new Div();

		System.out.println("원하시는 연산을 입력하시오!:  + - * / !");

		char f = s.next().charAt(0);

		System.out.println("첫번째 숫자를 입력하시오.");

		int num1 = s.nextInt();

		System.out.println("두번째 숫자를 입력하시오.");

		int num2 = s.nextInt();
		// System.out.println( " " + num2);

		System.out.println();

		switch (f) {
		case '+': //
			System.out.printf("Answer: %d+%d=%d \n", num1, num2, Add.add(num1, num2));
			break;

		case '-':
			System.out.printf("Answer: %d-%d=%d \n", num1, num2, minus.calculate(num1, num2));
			break;

		case '*':
			System.out.printf("Answer:%d*%d=%d \n", num1, num2, Mul.calculate(num1, num2));
			break;

		case '/':
			System.out.printf("Answer:%d/%d=%d", num1, num2, div.calculate(num1, num2));
			break;

		// 2, 3

		// 1*2 / 1*2*3

		case '!':
			if (num1 > num2) {

				System.out.printf("Answer:" + num2 + "! / " + num1 + "! = " + com.calculate(num1, num2));
				break;

			} else {
				System.out.printf("Answer:" + num1 + "! / " + num2 + "! = " + com.calculate(num1, num2));
				break;
			}

		default:
			System.out.println("다시 입력하세요.");

		}

//		//div test
//				Calculator div = new Div();
//				//1.5 출력
//				System.out.println(div.calculate(3, 2));
//				//0 div error 
//				//System.out.println(div.calculate(4, 0));
//				
//				//combination test
//				Calculator com = new Combination();
//				//정상출력 1) 12 출력
//				System.out.println(com.calculate(4, 2));
//				//정상출력 2) 1  출력
//				System.out.println(com.calculate(5, 5));
//				//비정상 입력: a<b, -1 출력
//				System.out.println(com.calculate(2, 4));
//				//비정상 입렵 : a or b 이 자연수 아님, -1 출력
//				System.out.println(com.calculate(5, -3));
	}
}
