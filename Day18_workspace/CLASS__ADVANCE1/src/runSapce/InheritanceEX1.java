package runSapce;

import classSpace.WordBox;

public class InheritanceEX1 {
	public static void main(String[] args) {
		// �ǽ�
		// IntBox Ŭ������ �����ؼ�
		// �ܾ ������ �� �ִ� WordBox Ŭ������
		// ������� ��������.
		// # super�� ���������� �� �ʿ�� �����ϴ�.
		WordBox word1 = new WordBox("�ܾ�1", "Apple");
		WordBox word2 = new WordBox("�ܾ�2", "Pie");
		System.out.println(word1.getData()); // Unreadable
		System.out.println(word2.getData()); // Unreadable
		word1.open();
		word2.open();
		System.out.println(word1.getData()); // Apple
		System.out.println(word2.getData()); // Pie
		word1.setData("Apple Pie");
		word2.setData("Pine Apple");
		System.out.println(word1.getData()); // Apple Pie
		System.out.println(word2.getData()); // Pine Apple
	}
}
