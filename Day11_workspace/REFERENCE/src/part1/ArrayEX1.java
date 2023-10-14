package part1;

import java.util.Scanner;

public class ArrayEX1 {
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 입력 >> ");
		int size = sc.nextInt();
		*/
		// new int[수량] - 변동되는 수량에 대응함
		int[] arr = new int[3];
		// 값을 채우는 것도 수량이 변동되면 반복으로 대응시켜줘야 함
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// { 값1, 값2, ... } - 고정 수량을 만들어놓고 쓸 때
		// int[] arr = { 10, 20, 30 };
		for (int i = 0; i < arr.length; i += 1) {
			System.out.printf("index : %d, value : %d\n", i, arr[i]);
		}
	}
}
