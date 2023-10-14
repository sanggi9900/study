package oop4;
// ���׸� Ŭ������ ��ٷο� �� - ���� �ڷ������δ� ���׸� Ŭ������ �̿��� �� ����
// - ���� �ڷ����� �����Ǵ� ����� �ڷ����� ������
// -> Wrapper Class�� �̿��Ͽ� ���� �ڷ����� ��ü�Ѵ�.
// -> ������ ���̰� ����, ��� ȿ���� ���̰� ����.
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
		// ������(Polymorphism)
		// - ��ü���⿡���� �پ��� ���¿� �ּ����� ��ȭ������ ������ �� �ִ�.
		// - Ŭ������ ������ �ƴ϶�, �������� ���� �� ����.
		// - �ڷ����� �ʿ��� �� �ٲ㼭 �� �� �ֵ��� ���ִ� ��
		// ���׸� Ŭ���� - �ʵ� �� �޼����� �ڷ����� �ʿ��� ���·� �ٷ� �ٲ� �� �ִ� Ŭ����
		// - �پ��� ������ ���� ���� �� �ֵ��� ���ٴ� ��
		// - ���ǻ���1 : �ڵ尡 ������ �����ϰ� �۵��ؾ� �Ѵ�.
		// - ���ǻ���2 : ���� �ٸ� Ŭ������ �ڵ����� ��������� ������ ��.
		Position<Integer> pos1 = new Position<Integer>("���1");
		Position<Double> pos2 = new Position<Double>("���2");
		
		// Wrapper Class : ���� �ڷ����� �� �� �ְ� ���ִ� ����� �ڷ���
		// - ù���ڰ� �빮���̰�, Ǯ�������� ���´�.
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









