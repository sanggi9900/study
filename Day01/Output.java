package basic;

public class Output {
	public static void main(String[] args) {
		char ch = '와';
		int count = 100;
		double height = 189.9;
		String name = "고길동";
		// JAVA에서는 문자열과 덧셈해서 출력할 수 있음
		
		// print : 간단한 출력용도로 사용
		System.out.print("김길동" + ch +' '+ name + '\n');
		System.out.print("김길동" + ch +' '+ name + '\n');
		
		// println : 끝에 자동으로 줄바꿈을 붙여줌
		System.out.println("김길동" + ch +' '+ name);
		System.out.println("김길동" + ch +' '+ name);
		
		// printf : 값을 특정 서식에 반영시켜줌
		// - 각각에 반영시키면 복잡해지니 이를 쉽게 처리하기 위함
		System.out.println(height + " AND " + count);
		System.out.printf("%.3f AND %d\n", height, count);
	}
}




