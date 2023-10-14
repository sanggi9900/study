package controlflow;

public class While2 {
	public static void main(String[] args) {
		// 유한반복 : 변하는 것들을 일정하게 변하도록 만들어줘야 한다.
		// - 변하는 것은 코드를 짜서 분석을 함으로써 파악이 된다.
		// 1) 원본
		System.out.println("1 2 3 4 5");
		// 2) 분해
		System.out.print("1 ");
		System.out.print("2 ");
		System.out.print("3 ");
		System.out.print("4 ");
		System.out.print("5\n");
		// 3) 통일
		int num = 1;
		System.out.print(num+" "); num += 1;
		System.out.print(num+" "); num += 1;
		System.out.print(num+" "); num += 1;
		System.out.print(num+" "); num += 1;
		// if (num == 5)
		System.out.print(num+"\n"); num += 1;
		// 4) 포장
		int num1 = 1;
		while (num1 <= 5) {
			if (num1 == 5) System.out.print(num1+"\n"); 
			else System.out.print(num1+" ");
			num1 += 1;
		}
	}
}






