package controlflow;

public class While2 {
	public static void main(String[] args) {
		// ���ѹݺ� : ���ϴ� �͵��� �����ϰ� ���ϵ��� �������� �Ѵ�.
		// - ���ϴ� ���� �ڵ带 ¥�� �м��� �����ν� �ľ��� �ȴ�.
		// 1) ����
		System.out.println("1 2 3 4 5");
		// 2) ����
		System.out.print("1 ");
		System.out.print("2 ");
		System.out.print("3 ");
		System.out.print("4 ");
		System.out.print("5\n");
		// 3) ����
		int num = 1;
		System.out.print(num+" "); num += 1;
		System.out.print(num+" "); num += 1;
		System.out.print(num+" "); num += 1;
		System.out.print(num+" "); num += 1;
		// if (num == 5)
		System.out.print(num+"\n"); num += 1;
		// 4) ����
		int num1 = 1;
		while (num1 <= 5) {
			if (num1 == 5) System.out.print(num1+"\n"); 
			else System.out.print(num1+" ");
			num1 += 1;
		}
	}
}






