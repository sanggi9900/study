package method;

public class Method5 {
	public static int me1(int n1, int n2) {
		return n1 + n2;
	}
	public static double me2(int n1, double n2) {
		return n1 + n2;
	}
	public static double me3(double n1, int n2) {
		return n1 + n2;
	}
	public static double me4(double n1, double n2) {
		return n1 + n2;
	}
	
	public static int test(int n1, int n2) {
		return n1 + n2;
	}
	public static double test(int n1, double n2) {
		return n1 + n2;
	}
	public static double test(double n1, int n2) {
		return n1 + n2;
	}
	public static double test(double n1, double n2) {
		return n1 + n2;
	}
	
	public static void main(String[] args) {
		// ������ �ϴ� ���� �Ȱ���

		// �Լ� : ���� �ٸ� ���� �ٷ�ٸ� ���� �ٸ� ����� �غ�Ǿ�� �Ѵ�.
		// - ���� �ٸ� �Լ��ν� �̸��� �����Ǿ� �غ� �Ǿ�� ��
		System.out.println("���1 : " + me1(10,20));
		System.out.println("���2 : " + me2(10,20.5));
		System.out.println("���3 : " + me3(10.2,20));
		System.out.println("���4 : " + me4(10.2,20.5));

		// �޼��� : ���� �ٸ� ���� ���� �����̴�, �̸� ��� �� �� �ִ�.
		// - �޼��� �����ε��̶� �θ���.
		// - �Ű������� ���ؼ� �޼������ ���еȴ�.
		// - �޼������ ������ �ٸ� ������ ������ �� �޸� �ο�
		//   ��������� ���� ������ �Ű������� �޸� �غ���
		//   ������ �޼�������� �����Ѵ�.
		System.out.println("���1 : " + test(10,20));
		System.out.println("���2 : " + test(10,20.5));
		System.out.println("���3 : " + test(10.2,20));
		System.out.println("���4 : " + test(10.2,20.5));
	}
}
