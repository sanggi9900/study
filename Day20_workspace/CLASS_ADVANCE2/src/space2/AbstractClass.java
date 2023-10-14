package space2;

import space1.House;

public class AbstractClass {
	public static void main(String[] args) {
		// 추상클래스 : 큰 틀을 제공함
		// - 상속을 전제로 하는 클래스
		House myhome = new House("내 집", 4);
		myhome.in("김씨");
		myhome.in("이씨");
		myhome.in("고씨");
		myhome.in("강씨");
		myhome.in("곽씨");
		// 일반 클래스 상속
		// 1) 일부 메서드는 필요하면 재정의
		// 2) 필드사용/업캐스팅/다운캐스팅 전부 동일함
		// 3) "이어" 받아 쓰는게 주 목적
		//    또한 그 클래스는 객체를 만들어 쓸 수 있음

		// 추상 클래스 상속
		// 1) 무조건 재정의를 해야 함
		// 2) 필드사용/업캐스팅/다운캐스팅 전부 동일함
		// 3) "정해진 사용방식"을 강제하는게 주 목적
		//    그 추상클래스는 객체를 만들 생각이 없음
	}
}






