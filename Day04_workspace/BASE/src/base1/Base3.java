package base1;

public class Base3 {
	public static void main(String[] args) {
		// JAVA�� ����� ���ڿ��� ������ ���ؼ� �������� ����� �� ����
		
		// Sytem.out : System��Ű���� �ִ� out �ҽ������� �޼��带 �̿��� �����
		// - print : �ϳ��� �ٹٲ������� �ʰ� ���
		//   �ٹٲ��� ���� �����ϰų� �ʿ���� �� ���
		int value1 = 123;
		System.out.print("���� �����ָ� ����� " + value1 + "\n");
		
		// - println : �ϳ��� �ٹٲ����ָ鼭 ���
		boolean result = true;
		double height = 177.8;
		System.out.println("��� : " + result);
		System.out.println("Ű : " + height);
		
		// - printf : �ѹ��� �������� �������� �� ��
		//   ������ ���� �����. ��Ģ�� ������. %lf�� ���� %f�� ������
		//   %c %s %d %f %b
		System.out.println("A : " + value1 + ", B : " + height + ", C : " + result);
		System.out.printf("A : %d, B : %.1f, C : %b\n", value1, height, result);
	}
}





