package reference;

public class RefEX1 {
	public static char[] getArr() {
		// 공유되는 구조이기 때문에, 받을 수만 있으면 쓸 수 있다.
		char[] arr1 = new char[10];
		for (int i = 0; i< arr1.length;i+=1) {
			arr1[i] = (char)(65 + i);
		}
		return arr1;
	}
	public static void showArr(char[] arr) {
		for (int i = 0; i< arr.length;i+=1) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// 받을 곳이 없으면 메서드가 종료되는 즉시 증발하니 주의.
		char[] arr1 = getArr();
		showArr(arr1);
	}
}
