package array;

import java.util.Scanner;

public class ArrayEX3 {
	public static void main(String[] args) {
		// 1회성 사용이면 배열이 필요없음
		// 다회 사용이면 배열이 있어야 코드 관리가 편해진다.
		Scanner sc = new Scanner(System.in);
		
		// ★  배열을 썻으면, 확실하게 연동이 되도록 맞춰준다.
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i += 1) {
			System.out.print((i + 1) + "번 값 >> ");
			arr[i] = sc.nextInt();
		}
		
		int result = 0;
		for (int i = 0; i < arr.length; i += 1) {
			result += arr[i];
		}
		System.out.print("값 : ");
		for (int i = 0; i < arr.length; i += 1) {
			System.out.print(arr[i] + " ");
		} System.out.print("\n");
		
		System.out.println("합 : " + result);
		System.out.println("평균 : " + ((double)result / arr.length));
		
		sc.close();
	}
}
