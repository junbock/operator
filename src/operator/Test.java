package operator;

public class Test {
	public static void main(String[] args) {
		//div test
		Calculator div = new Div();
		//1.5 ���
		System.out.println(div.calculate(3, 2));
		
		//combination test
		Calculator com = new Combination();
		//���� ���� 12 ���
		System.out.println(com.calculate(4, 2));
		//�߸��� �Է� : a<b, -1 ���
		System.out.println(com.calculate(2, 4));
		//�߸��� �Է� : a or b �ڿ��� �ƴ�, -1 ���
		System.out.println(com.calculate(5, -3));
	}	
}
