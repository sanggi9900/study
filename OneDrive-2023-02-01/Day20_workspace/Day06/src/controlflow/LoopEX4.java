package controlflow;
import java.util.Scanner;

public class LoopEX4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("HELLO 출력횟수 >> ");
		int count = sc.nextInt();
		sc.close();
		
		// 온존시킬 경우, 대체변수로 반복을 운용한다.
		// -> 이 때는 for 반복문을 이용한다.
		// -> 문법에 맞게 재배치만 하면 된다.
		for (int num = 1; num <= count; num += 1) {
			System.out.print("HELLO ");
		} System.out.print("\n");
		
		// while 유한반복시에는 제어용 변수를 갈아마신다.
		while (count > 0) {
			System.out.print("HELLO ");
			count -= 1;
		} System.out.print("\n");
	}
}
