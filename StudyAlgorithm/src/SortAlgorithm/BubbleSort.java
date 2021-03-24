package SortAlgorithm;

/*
 * ��������
 * �ð����⵵ O(n^2) - for�� �ι�
 * �������⵵ O(n) - �迭 �� ���� ���
 * ���� ������ �� ���Ҹ� �˻��Ͽ� �����ϴ� �˰���
 * ���������� �ð����⵵�� ���� �ʾ� ���� ��� ����.
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
}