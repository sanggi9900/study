package forstatement;

import java.util.Scanner;

public class ForEX1 {
	public static void main(String[] args) {
		// for�� ���ѹݺ����̰�, while�� ���뼺�� ����
		// - while�� �ᵵ �Ǵµ�, for�� ���� �����ΰ�?
		Scanner sc = new Scanner(System.in);
		System.out.print("HELLO ���Ƚ�� >> ");
		int count = sc.nextInt();
		
		// for ���ѹݺ��� ���� �� ���� ū Ư¡
		// - ���ϴ� ������ �°� �غ��� �� �ִ� ���뼺
		for (int x = 1; x <= count; x += 1) System.out.print("HELLO ");
		System.out.println();
		
		// while ���ѹݺ��� ���� �� ���� ū Ư¡
		// - ������ ������ ���� Ƚ�� Ȯ����
		while (count-- > 0) System.out.print("HELLO ");
		System.out.println();
	}
}






