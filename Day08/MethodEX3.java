package method;

public class MethodEX3 {
	// 직접 입력을 받을 경우 : Scanner 등을 통해야 가능하기에 범용성이 떨어진다.
	// 매개변수를 거칠 경우 : 외부에서 Scanner 등으로 받은 값을 복사하기에
	//                 직접 입력과 복사를 필요에 따라 활용할 수 있다.
	public static void showMax(int num1,int num2,int num3) {
		// 범위 내에서 제일 큰 값을 첫번째로 선정하고
		// 나머지가 더 크면 "큰 값" 을 갱신한다.
		if (num1 == num2 && num2 == num3) {
			System.out.println("전부 같습니다.");
		}
		else {
			int maxValue = num1;
			int count = 1;
			if (num2 > maxValue) {
				maxValue = num2;
				count = 2;
			}
			if (num3 > maxValue) {
				maxValue = num3;
				count = 3;
			}
			System.out.println("제일 큰 값 : " + maxValue + " " + count);
		}
	}
	public static void main(String[] args) {
		showMax(1,2,3);
		showMax(3,2,1);
		showMax(1,3,2);
		showMax(2,2,3);
		showMax(3,2,3);
		showMax(3,3,3);
	}
}
