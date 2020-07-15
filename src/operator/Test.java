package operator;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		// div test

		Scanner s = new Scanner(System.in);

		Calculator com = new Combination();

		Calculator div = new Div();

		System.out.println("�썝�븯�떆�뒗 �뿰�궛�쓣 �엯�젰�븯�떆�삤!:  + - * / !");

		char f = s.next().charAt(0);

		System.out.println("泥ル쾲吏� �닽�옄瑜� �엯�젰�븯�떆�삤.");

		int num1 = s.nextInt();

		System.out.println("�몢踰덉㎏ �닽�옄瑜� �엯�젰�븯�떆�삤.");

		int num2 = s.nextInt();
		// System.out.println( " " + num2);

		System.out.println();

		switch (f) {
//		case '+': //
//			System.out.printf("Answer: %d+%d=%d \n", num1, num2, Add.add(num1, num2));
//			break;

//		case '-':
//			System.out.printf("Answer: %d-%d=%d \n", num1, num2, Minus.calculate(num1, num2));
//			break;

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
			System.out.println("�떎�떆 �엯�젰�븯�꽭�슂.");

		}

	
//		//정상 동작 1) 6 출력
//		System.out.println(com.calculate(4, 2));
//		//정상 동작 2) 1 출력
//		System.out.println(com.calculate(5, 5));
//		//잘못된 입력 : a<b, -1 출력
//		System.out.println(com.calculate(2, 4));
//		//잘못된 입력 : a or b 자연수 아님, -1 출력
//		System.out.println(com.calculate(5, -3));
	}	
}
		