package TestBackJoon;
/*
 * ������: ����ī �̷�
 * ����: 21.06.28.��
 * https://www.acmicpc.net/problem/10448
 * ��������: �ﰢ�� Tn(n �� 1)�� [�׸�]������ ���� ������������ ������ ����� ��Ģ�� ���� ������ �������� ǥ���� �� �ִ�.
		�ڿ��� n�� ���� n �� 1�� �ﰢ��Tn�� ����� ������ �ִ�.			
		Tn = 1 + 2 + 3 + ... + n = n(n+1)/2			
		1796��, ���콺�� ��� �ڿ����� �ִ� 3���� �ﰢ���� ������ ǥ���� �� �ִٰ� �����Ͽ���. ���� ���,			
			4 = T1 + T2
			5 = T1 + T1 + T2
			6 = T2 + T2 or 6 = T3
			10 = T1 + T2 + T3 or 10 = T4
		�� ����� ������ ����ϱ� ���� ���� ���̾�� ��Eureka! num = �� + �� + �ġ� ��� �����Ϳ��� ����ī �̷����� �˷�����. ���� ��� �ڿ����� ��Ȯ�� 3���� �ﰢ���� ������ ǥ���� �� �ִ��� �ñ�������. 
		���� ���ÿ���, 5�� 10�� ��Ȯ�� 3���� �ﰢ���� ������ ǥ���� �� ������ 4�� 6�� �׷��� �ʴ�.
		�ڿ����� �־����� ��, �� ������ ��Ȯ�� 3���� �ﰢ���� ������ ǥ���� �� �ִ��� �������� �Ǵ����ִ� ���α׷��� ������. ��, 3���� �ﰢ���� ��� �޶�� �� �ʿ�� ����.
 * �Է�: ���α׷��� ǥ���Է��� ����Ѵ�. �׽�Ʈ���̽��� ������ �Է��� ù ��° �ٿ� �־�����. �� �׽�Ʈ���̽��� �� �ٿ� �ڿ��� K (3 �� K �� 1,000)�� �ϳ��� ���ԵǾ��ִ� T���� �������� �����Ǿ��ִ�.
 * ���: ���α׷��� ǥ������� ����Ѵ�. �� �׽�Ʈ���̽������� ��Ȯ�� �� ������ ����Ѵ�. ���� K�� ��Ȯ�� 3���� �ﰢ���� ������ ǥ���ɼ� �ִٸ� 1��, �׷��� �ʴٸ� 0�� ����Ѵ�.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D210628T10448TheoryOfEUreka {
	static final int MAX = 1001;
	static int N;
	static int[] table = new int[45];
	
	public static void main(String[] args) throws IOException {
		getTriangleNumber();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			System.out.println(dfs(0, 0, 0));
		}
	}
	
	static int dfs(int depth, int start, int sum) {
		if(depth == 3) {
			if(sum == N) {
				return 1;
			}
		}
		else {
			if(sum == N) {
				return 0;
			}
			else {
				for(int i = 0; i < table.length; i++) {
					dfs(depth+1, i+1, sum+table[i]);	
				}
			}
		}
		
		return 0;
	}
	
	static void getTriangleNumber() {
		int n = 1;
		while(true) {
			int cal = n*(n+1)/2;
			if(cal > MAX) break;
			table[n++] = cal;
		}
	}

}
