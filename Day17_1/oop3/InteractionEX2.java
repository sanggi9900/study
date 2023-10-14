package oop3;

import myclass.Box;
import myclass.Human;

public class InteractionEX2 {
	public static void main(String[] args) {
		Box[] boxArray = new Box[4];
		
		for (int i = 0; i<boxArray.length; i+=1) {
			boxArray[i] = new Box((i+1)+"번째 서랍");
		}
		
		Human boxManager = new Human("박스관리자");
		
		boolean result1 =
				boxManager.openOneBox(boxArray, "1번째 서랍");
		boolean result2 =
				boxManager.openOneBox(boxArray, 3);
		boolean result3 =
				boxManager.openOneBox(boxArray, "2번째 상자");
		boolean result4 =
				boxManager.openOneBox(boxArray, 10);
		
		for (int i = 0;i<boxArray.length; i+=1) {
			boxArray[i].showInfo();
		}
		
		System.out.println("결과1 : " + result1);
		System.out.println("결과2 : " + result2);
		System.out.println("결과3 : " + result3);
		System.out.println("결과4 : " + result4);
	}
}





