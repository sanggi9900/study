package oop3;

import myclass.Box;
import myclass.Human;

public class InteractionEX2 {
	public static void main(String[] args) {
		Box[] boxArray = new Box[4];
		
		for (int i = 0; i<boxArray.length; i+=1) {
			boxArray[i] = new Box((i+1)+"��° ����");
		}
		
		Human boxManager = new Human("�ڽ�������");
		
		boolean result1 =
				boxManager.openOneBox(boxArray, "1��° ����");
		boolean result2 =
				boxManager.openOneBox(boxArray, 3);
		boolean result3 =
				boxManager.openOneBox(boxArray, "2��° ����");
		boolean result4 =
				boxManager.openOneBox(boxArray, 10);
		
		for (int i = 0;i<boxArray.length; i+=1) {
			boxArray[i].showInfo();
		}
		
		System.out.println("���1 : " + result1);
		System.out.println("���2 : " + result2);
		System.out.println("���3 : " + result3);
		System.out.println("���4 : " + result4);
	}
}





