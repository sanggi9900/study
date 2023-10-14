package oop3;
import myclass.Box;
public class ClassArrayEX1 {
	public static void main(String[] args) {
		Box[] arr = new Box[8];
		for (int i = 0; i < arr.length; i+= 1) {
			arr[i] = new Box((i+1) + "번째 서랍");
		}
		for (int i = 0; i < arr.length; i+= 1) {
			arr[i].showInfo();
		}
	}
}
