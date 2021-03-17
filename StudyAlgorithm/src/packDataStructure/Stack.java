package packDataStructure;

/*
 * �����ڷᱸ��
 * ���� ���� �Ұ���
 * ���Լ���
 */
public class Stack {
	final int TOP_SIZE = 500;
	int top = 0;
	int[] arr = new int[TOP_SIZE];

	public int push(int n) {
		if(top >= TOP_SIZE) return -1;
		arr[top++] = n;
		return 0;
	}
	
	public int pop() {
		if(top <= 0) return -1;
		return arr[--top];
	}
	
	public void print() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
