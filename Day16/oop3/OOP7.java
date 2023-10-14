package oop3;

class Bird{
	private String name;
	public Bird() { this("새"); }
	public Bird(String name) { this.name = name; }
	public String getName() { return name; }
}

public class OOP7 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		// 참조배열의 주의사항 : 비어있음(null)
		Bird[] oarr = new Bird[3];
		// 참조배열은 배열만 만들어주니 주의
		// - 각 객체는 각 인덱스에 연결시켜줘야 함
		oarr[0] = new Bird();
		oarr[1] = new Bird("송골매");
		oarr[2] = new Bird("참조롱이");
		for (int i = 0; i<oarr.length; i += 1) {
			System.out.println(oarr[i].getName());
		}
	}
}












