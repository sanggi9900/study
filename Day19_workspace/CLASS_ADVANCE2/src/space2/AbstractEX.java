package space2;

import space1.ValueBox;

public class AbstractEX {
	public static void main(String[] args) {
		// �ǽ�
		// AbsBox �߻� Ŭ������ ��ӹ޾Ƽ�
		// �Ǽ����� �����ؼ� �����ϴ� ValueBox��
		// �����ϼ���.
		// # �߰��ʵ� : ������ / �Ǽ��� ���� ����
		// # ������ : �̸��� �Ǽ����� �޾Ƽ� �����Ǹ� �� �ܿ��� ����
		//          ������������ �����ο� �Ǽ��θ� ���� �и��Ͽ� ����
		// # open() / close() : ������
		// # setter ���� getter�� �ϳ� �غ�
		//   �� getter�� �����ο� �Ǽ��θ� �����ؼ� �ٽ� �Ǽ����� ��ȯ
		//   ��, ���ڰ� �������� ��� ��ȯ���� 0���� ����
		ValueBox box1 = new ValueBox("�ǽ��� ����", 3.14);
		System.out.println(box1.getValue()); // 0.0
		box1.open();
		System.out.println(box1.getValue()); // 3.14
	}
}
