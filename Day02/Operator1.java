package basic;

public class Operator1 {
	public static void main(String[] args) {
		int countA = 100;
		System.out.println("A�� ���� : " + countA + "��");
		// ���ǻ���1 : ���ڿ��� ��� ����� ��, �Ұ�ȣ�� ��� �����ؾ� ��
		// - ���ڿ��� ���� : concatenate(�����ϴ�)
		//   -> ���� ����� ���ڿ��� �ٲ㼭 �̾� �ٿ��� �ϳ��� ����� �ش�.
		System.out.println("5�� �þ ��� : " + countA + 5 + "��");
		// - �����ڴ� �켱������ ������
		//   -> �켱������ �����ϸ� ���ʿ��� ���������� 2���� ����ó��
		System.out.println("5�� �þ ��� : " + (countA + 5) + "��");
		System.out.println("9�� ������ ��� : " + (countA - 9) + "��");
		System.out.println("2�谡 �� ��� : " + (countA * 2) + "��");
		
		// ���ǻ���2 : �Ǽ����� �����ϸ� ����� ������ �Ǽ����̴�
		System.out.println("2.5�谡 �� ��� : " + (countA * 2.5) + "��");
		
		// ���ǻ���3 : ���������� �� ���ϰ�, �Ǽ��� �־�߸� �Ҽ����� ���´�.
		System.out.println("�������� ������ ��� : " + (countA/2) + "��");
		System.out.println("1/3���� ������ ��� : " + (countA/3.0) + "��");
		
		// ���ǻ���4 : �ڹٿ����� ������������ �Ǽ����� �� �� �ִ�.
		System.out.println(countA % 5.2);
		
		// ������ �� �� ������� : Ư�� ������ ������ ���Ǹ� �����Ѵ�.
		// - 1) �ڵ��� �۵��ӵ�(ȿ����)�� �ø� �� �ִ�.
		// - 2) �Ұ�ȣ�� �� �� �� ����
		int countB = countA + 10;
		System.out.printf("10�� �������� : %d��\n", countB);
		System.out.println("10�� �������� : " + countB + "��");
		// - 3) ���̻� �������� �ʿ���ٸ� ���� ���� ����. �ʿ��ϸ� �ٸ� ���� ����.
		countA = countA + 10;
		System.out.printf("10�� �������� : %d��\n", countA);
		System.out.println("10�� �������� : " + countA + "��");
	}
}





