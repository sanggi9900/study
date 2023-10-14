package basic;
import java.util.Scanner;

public class InputEX2 {
	public static void main(String[] args) {
		System.out.print("이름 입력 >> ");
		Scanner sc = new Scanner(System.in);
		// 입력되는 것이 무엇인지 잘 생각해서 준비해야 함
		String name = sc.next();
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		System.out.print("취미 입력 >> ");
		sc.nextLine();
		String hobby = sc.nextLine();
		sc.close();
		
		System.out.printf(
				"\n제 이름은 %s이고 나이는 %d세입니다.\n",name,age
				);
		System.out.println("취미 : " + hobby);
		
	}
}
