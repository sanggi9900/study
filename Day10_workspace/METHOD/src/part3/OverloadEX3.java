package part3;

public class OverloadEX3 {
	// 오버로딩은 매개변수까지 메서드를 구분하는 용도로 쓰기에
	// 같은 이름에 같은 매개변수로 호출하는게 아니면 서로 다른
	// 메서드로 구분되어 인식됨
	
	// 자바의 메서드 중복관리기술 : 오버로딩을 이용해, 포장해주기
	// - 모든 실행코드는 거대한 통합코드에서 관리하는 것
	// - 개별값을 넣었을 때 이에 대한 실행통제를 추가해줌
	public static void showNumber(int n1) {
		showNumber(1, n1);
	}
	public static void showNumber(int n1, int n2) {
		showNumber(n1, n2, 1);
	}
	public static void showNumber(int n1, int n2, int n3) {
		for (int a = n1; a <= n2; a += n3) {
			System.out.print( " " + a );
		} System.out.println(" 출력종료");
	}
	
	public static void main(String[] args) {
		showNumber(6); // showNumber( 1,  6, 1 );
		showNumber(2, 7); // showNumber( 2,  7, 1 );
		showNumber( 1, 12, 2 );
	}
}
