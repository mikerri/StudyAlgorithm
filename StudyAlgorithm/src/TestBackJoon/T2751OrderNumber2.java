package TestBackJoon;
/*
 * ������: �� �����ϱ�
 * ����: 21.06.10.��
 * https://www.acmicpc.net/problem/2751
 * ��������: N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�: ù° �ٿ� ���� ���� N(1 �� N �� 1,000,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ���ڰ� �־�����. �� ���� ������ 1,000,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
 * ���: ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
 * Ǯ��: �ð� ���⵵�� O(nlogn)�� ���� �˰������� Ǯ �� �ֽ��ϴ�. ���� ��� ���� ����, �� ���� ���� ������, ����� �˰����̹Ƿ� ������ �� ����� ���� �Լ��� ���� ���� ��õ�帳�ϴ�.
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class T2751OrderNumber2 {
	public static int[] tempArr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[Integer.parseInt(br.readLine())];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		tempArr = new int[arr.length];
		
		sort(arr, 0, arr.length-1);

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void sort(int[] arr, int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			sort(arr, start, mid);
			sort(arr, mid+1, end);
			merge(arr, start, end);
		}
	}
	
	public static void merge(int[] arr, int start, int end) {
		int mid = (start + end) / 2;
		int moveFirst = start;
		int moveMiddle = mid+1;
		int index = start;
		
		while(moveFirst <= mid && moveMiddle <= end) {
			if(arr[moveFirst] > arr[moveMiddle]) {
				tempArr[index++] = arr[moveMiddle++];
			}
			else {
				tempArr[index++] = arr[moveFirst++];
			}
		}
		
		int remainIndex = (moveFirst > mid ? moveMiddle : moveFirst);
		while(index <= end) {
			tempArr[index++] = arr[remainIndex++];
		}
		
		for(int i = start; i <= end; i++) {
			arr[i] = tempArr[i];
		}
	}
}
