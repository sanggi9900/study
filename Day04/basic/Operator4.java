package basic;

public class Operator4 {
	public static void main(String[] args) {
		// ��Ʈ������ : Ư������ ������
		// - �����ڷ��� ��, �����迭 �ڷ����� �����ϱ� ���� ������
		// - �̸� 0�� 1�� ������ �������� �ٲ㼭 �̿��ϴ� ������
		// - int�� 0�� 1�� ������ �� �ִ� 32��¥�� �迭�� �ؼ��ؾ� �Ѵ�.
		/*signed*/ int num1 = 128;
		int num2 = 192; // 128 + 64
		System.out.println("��� : " + (num1 << 1));	// ��Ʈ �̵�������
		System.out.println("��� : " + (num1 >> 1));	// �̵� ĭ���� ������
		System.out.println("��� : " + (num1 & num2)); // ��Ʈ ����
		System.out.println("��� : " + (num1 | num2)); // ��Ʈ ����
		System.out.println("��� : " + (~num1)); 		// ��Ʈ ������
		System.out.println("��� : " + (num1^num2));	// ��Ʈ ��Ÿ����(XOR)
		// <<< / >>> : ����ȣ ��Ʈ��������
		// unsigned : ��ȣ�� ������� �ʴ� �� -> -21 ~ 21 -> 0 ~ 42�� 
		// System.out.println("��� : " + (num1 <<< 1));
		// System.out.println("��� : " + (num1 >>> 1));
		
		// �� ���� : �ϵ���� �����
	}
}
