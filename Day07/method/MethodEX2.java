package method;

import java.util.Scanner;

public class MethodEX2 {
	public static int getSum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("합을 구할 정수 >> ");
		int value = sc.nextInt();
		int result = 0;
		// 1 + 2 + 3 == 3 + 2 + 1
		// - 수렴에 대해서 생각해보자...
		while (0 != value) {
			result += value;
			if (value > 0) value -= 1;
			else           value += 1;
		}
		// 반환값은 하나밖에 안되니 Scanner 정리를 못함
		return result;
	}
	public static void main(String[] args) {
		int result1= getSum();
		int result2= getSum();
		System.out.println("첫번째 합 : " + result1);
		System.out.println("첫번째 합 : " + result2);
	}
}









