package array;

public class Array1 {
	public static void main(String[] args) {
		// 배열 : 같은 종류의 변수의 묶음
		// 자료형[] 변수명 = new 자료형[크기];
		int[] arr1 = new int[3];
		double[] arr2 = { 0,0,0,0,0 };
		// 내부적으로는 C/C++의 동적할당에 대응된다.
		// - 필요한 크기를 변수를 통해서도 설정할 수 있음
		// - 크기는 음수이면 에러가 발생하고, 0은 통과됨.
		int size = 0;
		int[] arr3 = new int[size];
		
		// 기본적인 운용 : 인덱싱 + 반복
		arr1[0] = 10; // 0번부터 시작되고
		arr1[1] = 20;
		arr1[2] = 30; // 마지막은 크기-1이다.
		// 인덱싱한 상태가 우리가 필요한 값이다.
		System.out.println(arr1[0] + arr1[1] + arr1[2]);
		
		// C/C++방식 : 크기를 관리하는 변수가 "따로" 존재한다
		for (int i = 0; i < 5; i += 1) {
			arr2[i] = 1.5 + i;
		}

		// JAVA 방식 : 크기는 배열을 따라다닌다.
		// length : 멤버변수. 값의 변경은 불가.
		for (int i = 0; i < arr2.length; i += 1) {
			System.out.print(arr2[i] +" ");
		} System.out.print("\n");
		
		// 뒷정리(동적할당이니 이를 제거하는 과정)은 자동처리됨
		// -> 자바에는 Garbage Collector가 존재한다.
		
		// 주의사항 : 그냥 쓰면, 배열의 관리번호가 나오니 주의
		// - 메모리주소 아님
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
	}
}








