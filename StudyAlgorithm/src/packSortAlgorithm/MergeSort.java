package packSortAlgorithm;

/*
 * �պ�����
 * �ð����⵵ O(log n)
 * ���� �� ���̸�(John von Neumann)�� ����
 * ������ �ɰ������� ������ ���� ����Ʈ�� ����Ͽ� ������ ���� �� �� ����Ʈ������ ���� �� ����(merge) ���� �� �����ϴ� ���� => ���� ����(divide and conquer) �˰����� �ϳ�
 * ���� ���� ���
 * ����(Divide): �Է� �迭�� ���� ũ���� 2���� �κ� �迭�� ���� 
 * -> ����(Conquer): �κ� �迭�� ����. �κ� �迭�� ũ�Ⱑ ����� ���� ������ ��ȯ ȣ�� �� �̿��Ͽ� �ٽ� ���� ���� ����� ���� 
 * -> ����(Combine): ���ĵ� �κ� �迭���� �ϳ��� �迭�� �պ�
 */
public class MergeSort {
	int[] sorted;
	
	public MergeSort (int maxSize) {
		sorted = new int[maxSize];
	}
	
	public int[] sort(int arr[], int s, int e)
	{
		int mid;
		if (s < e)
		{
			mid = (s + e) / 2; 
			
			sort(arr, s, mid);
			sort(arr, mid + 1, e);
			merge(arr, s, e);
		}
		print(sorted);
		return arr;
	}
	
	private void merge(int arr[], int s, int e)
	{
		int mid = (s + e) / 2;

		int i = s;
		int j = mid + 1;
		int k = s;
		while (i <= mid && j <= e)
		{
			if (arr[i] <= arr[j]) 
				sorted[k++] = arr[i++]; 
			else
				sorted[k++] = arr[j++];
		}

		int tmp = i>mid ? j : i;
		
		while(k<=e) 
			sorted[k++] = arr[tmp++];

		for (i=s;i<=e;i++) 
			arr[i] = sorted[i];
	}
	
	public void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}