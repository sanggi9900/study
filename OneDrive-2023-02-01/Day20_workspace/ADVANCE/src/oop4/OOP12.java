package oop4;
// 제네릭 클래스의 까다로운 점 - 원시 자료형으로는 제네릭 클래스를 이용할 수 없음
// - 원시 자료형에 대응되는 비원시 자료형이 존재함
// -> Wrapper Class를 이용하여 원시 자료형을 대체한다.
// -> 사용법은 차이가 없고, 얻는 효과도 차이가 없음.
class Position<T> {
	private String name;
	private T x;
	private T y;
	public Position(String name) { this.name = name; }
	public void move(T x, T y) {
		this.x = x;
		this.y = y;
		System.out.println(name + " : " + x + ", " + y);
	}
}

public class OOP12 {
	public static void main(String[] args) {
		// 다형성(Polymorphism)
		// - 객체지향에서는 다양한 형태에 최소한의 변화만으로 대응할 수 있다.
		// - 클래스를 전용이 아니라, 범용으로 만들어낼 수 있음.
		// - 자료형을 필요할 때 바꿔서 쓸 수 있도록 해주는 것
		// 제네릭 클래스 - 필드 및 메서드의 자료형을 필요한 형태로 바로 바꿀 수 있는 클래스
		// - 다양한 종류의 값을 받을 수 있도록 만다는 것
		// - 주의사항1 : 코드가 완전히 동일하게 작동해야 한다.
		// - 주의사항2 : 서로 다른 클래스가 자동으로 만들어지니 주의할 것.
		Position<Integer> pos1 = new Position<Integer>("사람1");
		Position<Double> pos2 = new Position<Double>("사람2");
		
		// Wrapper Class : 원시 자료형을 쓸 수 있게 해주는 비원시 자료형
		// - 첫문자가 대문자이고, 풀네임으로 적는다.
		// char -> Character
		// short -> Short
		// int -> Integer
		// float -> Float
		// double -> Double
		// boolean -> Boolean
		pos1.move(8, 2);
		pos2.move(8.2,3.4);
	}
}









