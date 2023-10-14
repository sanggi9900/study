package reference;

public class RefEX2 {
	public static void inputArr(int[] arr) {
		
	}
	public static void main(String[] args) {
		int[] arr = new int[5];
		inputArr(arr);
		for (int i = 0; i < arr.length; i += 1) {
			System.out.printf("°ª%d : %d\n", i+1, arr[i]);
		}
	}
}
