package runSapce;

import classSpace.WordBox;

public class InheritanceEX1 {
	public static void main(String[] args) {
		// 실습
		// IntBox 클래스를 참고해서
		// 단어를 저장할 수 있는 WordBox 클래스를
		// 상속으로 만들어보세요.
		// # super는 못쓰겠으면 쓸 필요는 없습니다.
		WordBox word1 = new WordBox("단어1", "Apple");
		WordBox word2 = new WordBox("단어2", "Pie");
		System.out.println(word1.getData()); // Unreadable
		System.out.println(word2.getData()); // Unreadable
		word1.open();
		word2.open();
		System.out.println(word1.getData()); // Apple
		System.out.println(word2.getData()); // Pie
		word1.setData("Apple Pie");
		word2.setData("Pine Apple");
		System.out.println(word1.getData()); // Apple Pie
		System.out.println(word2.getData()); // Pine Apple
	}
}
