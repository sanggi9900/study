package basic;

public class Output {
	public static void main(String[] args) {
		char ch = '��';
		int count = 100;
		double height = 189.9;
		String name = "��浿";
		// JAVA������ ���ڿ��� �����ؼ� ����� �� ����
		
		// print : ������ ��¿뵵�� ���
		System.out.print("��浿" + ch +' '+ name + '\n');
		System.out.print("��浿" + ch +' '+ name + '\n');
		
		// println : ���� �ڵ����� �ٹٲ��� �ٿ���
		System.out.println("��浿" + ch +' '+ name);
		System.out.println("��浿" + ch +' '+ name);
		
		// printf : ���� Ư�� ���Ŀ� �ݿ�������
		// - ������ �ݿ���Ű�� ���������� �̸� ���� ó���ϱ� ����
		System.out.println(height + " AND " + count);
		System.out.printf("%.3f AND %d\n", height, count);
	}
}




