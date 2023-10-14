package method;

public class MethodEX4 {
	public static int getQuot(int n1, int n2) {
		if (n2 == 0) return 0;
		else 		 return n1/n2;
	}
	public static int getExpo(int n1, int n2) {
		if (n2 < 0) return 0;
		else {
			int result = 1;
			// 증감연산자를 잘 활용하면 좋긴 좋다.
			// while의 경우 조건식->종속문 : 비교하고 감소한다. -> 후치연산으로 처리가 가능
			while (n2-- > 0) result *= n1;
			/*
			for (int i = 1; i <= n2; i += 1) result *= n1;
			*/
			return result;
		}
	}
	public static void main(String[] args) {
		int result1 = getQuot(10, 3);
		int result2 = getQuot(10, 0);
		int result3 = getExpo( 2, 3);
		int result4 = getExpo( 2,-1);
		System.out.println("몫1 : " + result1);
		System.out.println("몫2 : " + result2);
		System.out.println("거듭제곱1 : " + result3);
		System.out.println("거듭제곱2 : " + result4);
		
	}
}
