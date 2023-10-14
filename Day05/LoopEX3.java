package controlflow;
import java.util.Scanner;

public class LoopEX3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 팁 : while(true)를 쓸 경우, 전체 코드를 반복시킨다고
		//     생각하는게 편하다.
		while (true) {
			System.out.print("뭐할까? >> ");
			// 중괄호 내부에서 변수를 선언하면, 이 내부에서만 사용 가능
			String menu = sc.next();
			if (menu.compareTo("종료") == 0) break;

			String result = "Good ";
			if (menu.compareTo("아침") == 0) result += "Morning!";
			else if (menu.compareTo("점심") == 0) result += "Afternoon!!";
			else if (menu.compareTo("저녁") == 0) result += "Evening!!!";
			else result = "WRONG INPUT...";
			System.out.println(result);
		}
		System.out.println("Bye Bye ~~");
		System.out.println("\n프로그램 종료");
	}
}
