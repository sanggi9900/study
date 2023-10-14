package controlflow;
import java.util.Scanner;
public class LoopEX6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 3;
		boolean result = false;
		while (count > 0) {
			System.out.print("ID 입력 >> ");	// 웹에서 받아온 것을 불러오는 것
			String userid = sc.next();
			if (userid.compareTo("User") != 0) {
				System.out.println("WRONG ID!"); // 웹으로 보내는 내용
			}
			else {
				System.out.print("PW 입력 >> ");	// 웹에서 받아온 것을 불러오는 것
				String userpw = sc.next();
				if (userpw.compareTo("it") != 0) {
					System.out.println("WRONG PW!"); // 웹으로 보내는 내용
				}
				else {
					result = true;
					break;
				}
			}
			count -= 1;
		}
		sc.close();
		if (result) System.out.println("LOGIN SUCCEED"); // 웹으로 보내는 내용
		else System.out.println("LOGIN BLOCKED");
	}
}
