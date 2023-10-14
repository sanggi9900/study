package runSpace;

import classSource.Rock3;

public class BASE3_Constructor {
	public static void main(String[] args) {
		// 생성자
		// - 단 한번만 값을 채우면 되는 필드를 위해서 준비되는 메서드
		// - setter의 준비가 줄어듬
		// - 모든 클래스에 대해 필수로 준비가 되는 메서드
		// 주의사항 : 생성시에만 호출됨
		Rock3 rock1 = new Rock3();
		Rock3 rock2 = new Rock3();
		System.out.println(rock1.getMaterial());
		System.out.println(rock2.getMaterial());
		Rock3 rock3 = new Rock3("모래");
		Rock3 rock4 = new Rock3("진흙", "부정형");
		Rock3 rock5 = new Rock3("1","2",3.5);
	}
}
