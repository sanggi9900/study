package classSource;

// 캡슐화
public class Rock2 {
	// 기본원칙
	// - 필드는 private부터 시작하며 넓어진다
	private String material;
	private String shape;
	private double weight;
	
	// - 메서드는 public부터 시작하며 좁아진다
	// setter/getter는 필드와 기능 메서드 사이에 준비해줌
	// setter끼리 묶어서 준비하고
	public void setMaterial(String mat) {
		material = mat;	// 기본동작
	}
	public void setShape(String sha) {
		shape = sha;
	}
	public void setWeight(double value) {
		weight = value;
	}
	// getter끼리 묶어서 준비함
	public String getMaterial() {
		return material; // 기본동작
	}
	public String getShape() {
		return shape;
	}
	public double getWeight() {
		return weight;
	}
	// getter / setter : 선택사항
	// getter -> 외부에서 읽을 수 있는 정보
	// setter -> 외부에서 바꿀 수 있는 정보
	// # 공개된 필드 -> 사용통제가 안됨
	
	public void canThrow() {
		System.out.println("부우우웅~!");
	}
}













