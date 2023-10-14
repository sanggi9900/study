package array;

public class ArrayEX1 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i += 1) {
			arr[i] = (i + 1) * 10;
		}
		for (int i = 0; i < arr.length; i += 1) {
			System.out.printf("index : %d, value : %d\n", i, arr[i]);
		}
	}
}
