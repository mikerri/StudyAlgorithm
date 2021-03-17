package packSortAlgorithm;

/*
 * ��������
 * ���� ������ �� ���Ҹ� �˻��Ͽ� �����ϴ� �˰���
 * �ð����⵵ O(n^2) - for�� �ι�
 * ���������� �ð����⵵�� ���� �ʾ� ���� ��� ����.
 * �������⵵ O(n) - �迭 �� ���� ���
 */
public class BubbleSort {
	public int[] sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int m = arr[i];
					arr[i] = arr[j];
					arr[j] = m;
				}
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