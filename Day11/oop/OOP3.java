package oop;
// 다른 패키지의 클래스 등을 불러온다.
import myclass.Box;

public class OOP3 {
	public static void main(String[] args) {
		// 접근제어 : 특성(필드)를 보호하기 위한 기술
		// - 정해진 방법을 통해서만 필드를 이용하기 위한 기술
		// - 정해진 방법 : 메서드
		// 캡슐화의 궁극목표 : 정보 은닉
		Box box1 = new Box();
		// 발생하는 문제 : 인스턴스(고유의 값을 가진 객체)로 바꿀 수 없음
		box1.open();
		box1.close();
	}
}
