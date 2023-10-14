package oop2;

import myclass.Box;

public class OOP4 {
	public static void main(String[] args) {
		// 캡슐화 : 객체를 만들었을 때, 정해진 방법에 의해서만 다루도록 만들기 위한 것
		// - 정보(객체가 가지고 있는 특성/필드) 보호
		// - 사용가능한 범위를 제한
		// - 범위 : 어느 소스파일부터 어느 패키지까지...
		
		// 클래스가 public이면 다른 패키지에서도 사용 가능하다.
		Box box1 = new Box();
		// 멤버가 public이면 생성된 이후 각 멤버를 이용할 수 있다.
		box1.close();
		box1.open();
		// 멤버가 private이면 클래스 내부에 존재하는 메서드에서만 이용할 수 있음.
		// 생성후의 사용은 불가능함.
	}
}


