package oop2;

class Paper {
	String title;
	String body;
	void write(String newTitle, String newBody) {
		title = newTitle;
		body = newBody;
	}
	void show() {
		System.out.println("���� : " + title);
		System.out.println("����\n" + body);
	}
}
public class OOPReview {
	public static void main(String[] args) {
		// ��ü���� ���α׷��� : �ڵ带 �ۼ��ϴ� ���(����)
		// - ������ ������ ���� ���� �߻�������(��������)...
		//   ���� �߻��� ���� ���� ��ȣ�ۿ��Ͽ� ����� �ȴ�(��ü����)...
		// - ��ü : �ڵ�� ����� "��(Thing)"
		// - Ŭ���� : ��ü�� ���ϰ� ������ ���� + ���� ���� ����/���
		
		// 1) �߻�ȭ : �ʿ��� ��ŭ(���� ������ ��ŭ) �����Ͽ� �Ű����� ����
		// - Ư¡ : �Ӽ�/�ʵ� -> �ڷ����� ������ ǥ���Ǵ� ��
		// - ���� : �����ϴ� ���/������ ���ϴ� ��� -> �޼���� ǥ���Ǵ� ��
		Paper memo1 = new Paper();
		memo1.write("�������","�� ���� ���� �ۼ��߾��~");
		memo1.show();
	}
}
