package oop;
// Ŭ�������� ������ ù���ڸ� �빮�ڷ� �����Ѵ�.
// - ��縦 ���δ�.
class Rock{
	// Ư��(�������) - ��ü�� ������� �� ������ Ư¡�� ������ �� �ִ� ����
	String material;
	double weight;
	// ����(�޼���) - ��ü�� ������ �� �ִ� ����/�����ϴ� ��� 
	void show() {
		// Ư���� �⺻������ ���� Ŭ���� ���� �޼�����
		// ���Ѿ��� �̿� ����
		System.out.println("���� : " + material);
		System.out.println("���� : " + weight);
	} 
}
public class OOP2 {
	public static void main(String[] args) {
		// ��ü�� ���� : Ŭ������ ������ = new Ŭ������();
		Rock rock1 = new Rock();
		// ��ü�� ��� : ���(Ư��/�޼���)�� �̿��Ѵ�.
		rock1.material = "������";
		rock1.weight = 7.92;
		rock1.show();
	}
}
