package reference;

public class RefEX1 {
	public static char[] getArr() {
		// �����Ǵ� �����̱� ������, ���� ���� ������ �� �� �ִ�.
		char[] arr1 = new char[10];
		for (int i = 0; i< arr1.length;i+=1) {
			arr1[i] = (char)(65 + i);
		}
		return arr1;
	}
	public static void showArr(char[] arr) {
		for (int i = 0; i< arr.length;i+=1) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// ���� ���� ������ �޼��尡 ����Ǵ� ��� �����ϴ� ����.
		char[] arr1 = getArr();
		showArr(arr1);
	}
}
