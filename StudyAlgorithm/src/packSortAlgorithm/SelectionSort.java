package packSortAlgorithm;

/*
 * ��������
 * �ð����⵵ O(n^2)
 * �������İ� ����. �ѹ� ��ȸ�� �ϸ鼭 ���� ū ���� ã�Ƽ� �迭�� ������ ��ġ�� ��ȯ.
 */
public class SelectionSort {
	public void sort(int arr[]) {
		int minIndex;
		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[minIndex] < arr[j]) {
					minIndex = j;
				}
			}
			int t = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = t;
		}
	}
	
	public void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
