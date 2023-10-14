package classSpace;

// ���׸� Ŭ���� ���ǹ��
// - �����ϴ� Ŭ������ �̸� ���� <E>�� �߰���
// - E : �ڷ����� �ĺ��ϱ� ���� �±�
public class TypeBox<E> extends Box {
	// ������ : �ڷ����� ���� ������
	private E data;
	
	public TypeBox(String name, E data) {
		super(name);
		this.data = data;
	}
	
	public void setData(E data) {
		if (state) this.data = data;
	}
	public E getData() {
		// ���ǻ��� : ��ȯ���� ���׸��̸�,
		//          ������ �ڷ������� ��ȯ��ų �� ����
		if (state) return data;
		// ����� ��ȯ���� �ʿ��ϸ� null ó���� ������
		else return null;
		// - �ƴϸ� ��ȯ���� ������ �ϳ��� ���Ͻ��ѹ���
	}
}

