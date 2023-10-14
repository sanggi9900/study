package oop;
// 클래스명은 무조건 첫글자를 대문자로 시작한다.
// - 명사를 붙인다.
class Rock{
	// 특성(멤버변수) - 객체를 만들었을 때 고유의 특징을 보관할 수 있는 변수
	String material;
	double weight;
	// 동작(메서드) - 객체가 실행할 수 있는 동작/제공하는 기능 
	void show() {
		// 특성은 기본적으로 같은 클래스 내의 메서드라면
		// 제한없이 이용 가능
		System.out.println("재질 : " + material);
		System.out.println("무게 : " + weight);
	} 
}
public class OOP2 {
	public static void main(String[] args) {
		// 객체의 생성 : 클래스명 변수명 = new 클래스명();
		Rock rock1 = new Rock();
		// 객체의 사용 : 멤버(특성/메서드)를 이용한다.
		rock1.material = "현무암";
		rock1.weight = 7.92;
		rock1.show();
	}
}
