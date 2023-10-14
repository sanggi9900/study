package oop3;
import myclass.Box;
public class ClassArrayEX2 {
	public static void openDrawer(Box[] arr) {
		
	}
	public static void swap(Box[] arr, int in1, int in2) {
		
	}
	public static void main(String[] args) {
		Box[] arr = new Box[8];
		
		for (int i = 0; i < arr.length; i+= 1) {
			arr[i] = new Box((i+1) + "번째 서랍");
		}
		
		openDrawer(arr);
		swap(arr, 0, 1);
		swap(arr, 2, 3);
		swap(arr, 4, 5);
		swap(arr, 6, 7);
		
		for (int i = 0; i < arr.length; i+= 1) {
			arr[i].showInfo();
		}
	}
}
