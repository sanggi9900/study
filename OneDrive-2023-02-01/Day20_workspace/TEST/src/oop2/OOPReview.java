package oop2;

class Paper {
	String title;
	String body;
	void write(String newTitle, String newBody) {
		title = newTitle;
		body = newBody;
	}
	void show() {
		System.out.println("제목 : " + title);
		System.out.println("내용\n" + body);
	}
}
public class OOPReview {
	public static void main(String[] args) {
		// 객체지향 프로그래밍 : 코드를 작성하는 기법(개념)
		// - 현실은 절차에 따라 무언가 발생하지만(절차지향)...
		//   무언가 발생한 것은 서로 상호작용하여 결과가 된다(객체지향)...
		// - 객체 : 코드로 묘사된 "것(Thing)"
		// - 클래스 : 객체를 편하게 만들어내기 위한 + 쓰기 위한 문법/기술
		
		// 1) 추상화 : 필요한 만큼(구현 가능한 만큼) 묘사하여 옮겨적는 과정
		// - 특징 : 속성/필드 -> 자료형과 변수로 표현되는 것
		// - 동작 : 제공하는 기능/스스로 행하는 기능 -> 메서드로 표현되는 것
		Paper memo1 = new Paper();
		memo1.write("제목없음","와 종이 만들어서 작성했어요~");
		memo1.show();
	}
}
