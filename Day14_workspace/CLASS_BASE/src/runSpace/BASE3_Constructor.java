package runSpace;

import classSource.Rock3;

public class BASE3_Constructor {
	public static void main(String[] args) {
		// ������
		// - �� �ѹ��� ���� ä��� �Ǵ� �ʵ带 ���ؼ� �غ�Ǵ� �޼���
		// - setter�� �غ� �پ��
		// - ��� Ŭ������ ���� �ʼ��� �غ� �Ǵ� �޼���
		// ���ǻ��� : �����ÿ��� ȣ���
		Rock3 rock1 = new Rock3();
		Rock3 rock2 = new Rock3();
		System.out.println(rock1.getMaterial());
		System.out.println(rock2.getMaterial());
		Rock3 rock3 = new Rock3("��");
		Rock3 rock4 = new Rock3("����", "������");
		Rock3 rock5 = new Rock3("1","2",3.5);
	}
}
