package array;

import java.util.Scanner;

public class ArrayEX2 {
	public static void main(String[] args) {
		// 반복이 똑같은거니 합친다? 아니다.
		// - 입력과 처리/출력은 합치지 않는다.
		
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[4];
		for (int i = 0; i < arr.length; i += 1) {
			System.out.print((i + 1) + "번 문자 : ");
			arr[i] = sc.next().charAt(0);
		}
		
		for (int i = 0; i < arr.length; i += 1) {
			System.out.printf("index : %d, char : %c\n", i, arr[i]);
		}
		
		sc.close();
	}
}
