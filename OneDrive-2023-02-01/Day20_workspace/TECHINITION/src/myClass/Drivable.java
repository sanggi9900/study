package myClass;

// 1. �ش������δ�, �ٸ� ���� �ű�� ���� �뵵�θ� �ᵵ ��
// 2. ĸ��ȭ(��������)�� �� �����ϰ�, �� �Ϻ��ϰ� �޼��Ѵ�.
//    -> ������ �������̽��� �غ��� �޼���θ� �����ȴ�.
public interface Drivable {
	// �ʵ�� ������ public static�̴�
	String interfaceName = "Drivable";
	// �޼���� ������ public abstract�̴�
	void showInfo();
	void drive();
	void stop();
}
