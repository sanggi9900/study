package classSpace;

public class Actor extends Human {
	public Actor(String name) {
		// �⺻ �����ڰ� ������ ������ �θ� �����ڸ� ȣ���ؾ� ��
		super(name, "���", 0);
	}
	// �޼��� �������̵� - ���� �޼��� ����ġ���
	// - ������ �����ؾ� ��
	// - �ٸ��� ���� ���� ������� ����
	public void greeting() {
		// �θ��� �޼��尡 ������ �ȵ�� �����Ǹ� ��
		// # �θ��� ���ۿ� �����ؼ� ���� ���� ���...
		//   super ���λ�� �̸� ȣ���� �� ����
		super.greeting();
		System.out.println("�߳����� ����Դϴ�.");
	}
}
