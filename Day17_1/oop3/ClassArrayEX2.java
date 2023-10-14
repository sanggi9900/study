package oop3;
import myclass.Box;
public class ClassArrayEX2 {
	public static void openDrawer(Box[] arr) {
		for (int i = 0; i < arr.length; i+= 2) {
			arr[i].open();
		}
	}
	public static void swap(Box[] arr, int in1, int in2) {
		if (in1 < 0 || in1 > arr.length) return;
		else if (in2 < 0 || in2 > arr.length) return;
		else {
			Box tmp = arr[in1];
			arr[in1] = arr[in2];
			arr[in2] = tmp;
		}
	}
	// 덤 : 오버로딩으로 구현한 배열 전체에 대한 swap함수
	public static void swap(Box[] arr) {
		for (int i = 0; i<arr.length; i+= 2) {
			swap(arr, i, i + 1);
		}
	}
	public static void main(String[] args) {
		Box[] arr = new Box[8];
		
		for (int i = 0; i < arr.length; i+= 1) {
			arr[i] = new Box((i+1) + "번째 서랍");
		}
		
		openDrawer(arr);
		// swap(arr);
		swap(arr, 0, 1);
		swap(arr, 2, 3);
		swap(arr, 4, 5);
		swap(arr, 6, 7);
		
		for (int i = 0; i < arr.length; i+= 1) {
			arr[i].showInfo();
		}
	}
}
