package packSortAlgorithm;

/*
 * ��������
 * �ð����⵵ O(n^2)
 * �ϳ��� ������ ������ ������ ���Ĺ��, Ư�� ���� ���ؼ� �� ���� �´� ��ġ�� ã��, �������� ��ĭ�� �о��.
 * O(n^2) ���� �˰����� �߿����� ���� ����
 */
public class InsertionSort {
	public int[] sort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = i-1; j >= 0; j--) { // j�� i�� �������� �̵�
				if(arr[j] > arr[j+1]) { // i��° ���� Ŀ�� ������ �̵�
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
				else break;
			}
		}		
		return arr;
	}
	
	public void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}