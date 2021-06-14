package TestBackJoon;
/*
 * ������: ��ǥ ����
 * ����: 21.06.14.��
 * https://www.acmicpc.net/problem/18870
 * ��������: ������ ���� N���� ��ǥ X1, X2, ..., XN�� �ִ�. �� ��ǥ�� ��ǥ ������ �����Ϸ��� �Ѵ�.
			Xi�� ��ǥ ������ ��� X'i�� ���� Xi > Xj�� �����ϴ� ���� �ٸ� ��ǥ�� ������ ���ƾ� �Ѵ�.
			X1, X2, ..., XN�� ��ǥ ������ ������ ��� X'1, X'2, ..., X'N�� ����غ���.
 * �Է�: ù° �ٿ� N�� �־�����. ��° �ٿ��� ���� �� ĭ���� ���е� X1, X2, ..., XN�� �־�����.
 * ���: ù° �ٿ� X'1, X'2, ..., X'N�� ���� �� ĭ���� �����ؼ� ����Ѵ�.
 * ����: 1 �� N �� 1,000,000, -10^9 �� Xi �� 10^9
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class T18870CompressionCoordinates {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int index = 0;
		ArrayList<Integer> indexList = new ArrayList<>();
		list.sort((e1, e2) -> {
			if(e1 > e2) {
				indexList.add(index++);
			}
		});

		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(list.get(i)).append(" ");	
		}
		System.out.println(sb.toString());
	}
}