package controlflow;
import java.util.Scanner;

public class LoopEX4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("HELLO ���Ƚ�� >> ");
		int count = sc.nextInt();
		sc.close();
		
		// ������ų ���, ��ü������ �ݺ��� ����Ѵ�.
		// -> �� ���� for �ݺ����� �̿��Ѵ�.
		// -> ������ �°� ���ġ�� �ϸ� �ȴ�.
		for (int num = 1; num <= count; num += 1) {
			System.out.print("HELLO ");
		} System.out.print("\n");
		
		// while ���ѹݺ��ÿ��� ����� ������ ���Ƹ��Ŵ�.
		while (count > 0) {
			System.out.print("HELLO ");
			count -= 1;
		} System.out.print("\n");
	}
}
