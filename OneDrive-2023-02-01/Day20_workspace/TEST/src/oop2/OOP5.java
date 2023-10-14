package oop2;

class Dog {
	private String name;
	private String species;
	// setter : 필드에 값을 저장하는 메서드
	// - 일반적으로 set+필드명으로 만든다.
	public void setName(String newName) {
		name = newName;
	}
	public void setSpecies(String species) {
		// this : 자기자신(객체)을 의미하는 예약어
		// - 기본용도 : 변수명 중복관리
		this.species = species;
	}
	// getter : 필드에 저장된 값을 가져오는 메서드
	// - 일반적으로 get+필드명으로 만든다.
	public String getName() {
		return name;
	}
	public String getSpecies() {
		return species;
	}
	// 팁 : setter와 getter는 임의다.
	// - setter는 변할 수 있는 것들에 설정해준다.
	// - getter는 반드시 읽어서 알아야 하는 것들에 설정해준다.
	public void bark() {
		System.out.println("왈왈왈왈!!!");
	}
}

public class OOP5 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.setName("발발이");			// dog1.name = "발발이";
		dog1.setSpecies("시고르자브종");	// dog1.species = "시고르자브종";
		dog1.bark();
		System.out.println(dog1.getName() + "의 종은 " + dog1.getSpecies() +"입니다.");
		dog1.bark();
	}
}
