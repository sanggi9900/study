package array;

public class Array1 {
	public static void main(String[] args) {
		// �迭 : ���� ������ ������ ����
		// �ڷ���[] ������ = new �ڷ���[ũ��];
		int[] arr1 = new int[3];
		double[] arr2 = { 0,0,0,0,0 };
		// ���������δ� C/C++�� �����Ҵ翡 �����ȴ�.
		// - �ʿ��� ũ�⸦ ������ ���ؼ��� ������ �� ����
		// - ũ��� �����̸� ������ �߻��ϰ�, 0�� �����.
		int size = 0;
		int[] arr3 = new int[size];
		
		// �⺻���� ��� : �ε��� + �ݺ�
		arr1[0] = 10; // 0������ ���۵ǰ�
		arr1[1] = 20;
		arr1[2] = 30; // �������� ũ��-1�̴�.
		// �ε����� ���°� �츮�� �ʿ��� ���̴�.
		System.out.println(arr1[0] + arr1[1] + arr1[2]);
		
		// C/C++��� : ũ�⸦ �����ϴ� ������ "����" �����Ѵ�
		for (int i = 0; i < 5; i += 1) {
			arr2[i] = 1.5 + i;
		}

		// JAVA ��� : ũ��� �迭�� ����ٴѴ�.
		// length : �������. ���� ������ �Ұ�.
		for (int i = 0; i < arr2.length; i += 1) {
			System.out.print(arr2[i] +" ");
		} System.out.print("\n");
		
		// ������(�����Ҵ��̴� �̸� �����ϴ� ����)�� �ڵ�ó����
		// -> �ڹٿ��� Garbage Collector�� �����Ѵ�.
		
		// ���ǻ��� : �׳� ����, �迭�� ������ȣ�� ������ ����
		// - �޸��ּ� �ƴ�
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
	}
}








