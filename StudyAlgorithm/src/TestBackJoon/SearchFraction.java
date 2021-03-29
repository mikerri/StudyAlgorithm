package TestBackJoon;
/*
 * ����: 21.03.29.��
 * https://www.acmicpc.net/problem/1193
 * ������: �м�ã��
 * ��������:
 		�̿� ���� ������ �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
		X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�: ù° �ٿ� X(1 �� X �� 10,000,000)�� �־�����.
 * ���: ù° �ٿ� �м��� ����Ѵ�.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class SearchFraction {
	public void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 1, a = 0;
		while(a < N) {
	        a += count++;
		}
		int m = 0, n = 0, d = a-N;
		count--;
		if(count % 2 == 0) {
			m = count+d;
			n = 1-d;
		}
		else {
			m = 1-d;
			n = count+d;			
		}
		System.out.println(m + "/" + n);
	}
}
