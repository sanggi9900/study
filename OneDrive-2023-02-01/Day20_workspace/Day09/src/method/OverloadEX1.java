package method;

public class OverloadEX1 {
	// �޼��� �����ε��� �Ű������� �ڷ��� �� ������ ���ؼ� �����ȴ�.
	// - �� 2������ ��� �����ϸ� �ߺ����� ��޵Ǵ� ����
	public static int function(int n1, int n2) {
		return n1 + n2;
	}
	public static String function(String word1, String word2) {
		return word1 + word2;
	}
	
	// �����ε����� �������� �޼��� : �Ϲ������� ���Ǵ� ����� ���� ����
	public static int function(int n1, int n2, int n3) {
		return n1 * n2 * n3;
	}
	public static void main(String[] args) {
		System.out.println("�� ������ �� : "	+ function(10,20)	);
		System.out.println("�� ���ڿ��� �� : "	+ function("A","B")	);
		System.out.println("�� ������ �� : " 	+ function(3,4,5)	);
	}
}
