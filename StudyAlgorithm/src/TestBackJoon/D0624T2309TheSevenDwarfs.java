package TestBackJoon;
/*
 * ������: �ϰ� ������
 * ����: 21.06.24.��
 * https://www.acmicpc.net/problem/2309
 * ��������: �պ� ���� �ϰ� �����̵�� �Բ� ��ȭ�Ӱ� ��Ȱ�ϰ� �ִ� �鼳���ֿ��� ���Ⱑ ã�ƿԴ�. �ϰ��� ��ġ�� ���ƿ� �����̰� �ϰ� ���� �ƴ� ��ȩ ���̾��� ���̴�.
			��ȩ ���� �����̴� ��� �ڽ��� "�鼳 ���ֿ� �ϰ� ������"�� ���ΰ��̶�� �����ߴ�. �پ ������ �������� ������ �ִ� �鼳���ִ�, ���ེ���Ե� �ϰ� �������� Ű�� ���� 100�� ���� ����� �´�.
			��ȩ �������� Ű�� �־����� ��, �鼳���ָ� ���� �ϰ� �����̸� ã�� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�: ��ȩ ���� �ٿ� ���� �����̵��� Ű�� �־�����. �־����� Ű�� 100�� ���� �ʴ� �ڿ����̸�, ��ȩ �������� Ű�� ��� �ٸ���, ������ ������ ���� ������ ��쿡�� �ƹ��ų� ����Ѵ�.
 * ���: �ϰ� �������� Ű�� ������������ ����Ѵ�. �ϰ� �����̸� ã�� �� ���� ���� ����.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D0624T2309TheSevenDwarfs {
	static int[] table = new int[9];
	static boolean[] visited = new boolean[9];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 9; i++) {
			table[i] = Integer.parseInt(br.readLine());
		}
		
		dfs(0, 0);
	}

	static void dfs(int count, int start) {
		if(count == 7) {
			int sum = 0;
			for(int i = 0; i < 9; i++) {
				if(visited[i]) {
					sum += table[i];
				}
			}
			if(sum == 100) {
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < 9; i++) {
					if(visited[i]) {
						sb.append(table[i]).append("\n");
					}
				}
				System.out.println(sb.toString());
			}
		}
		else {
			for(int i = start; i < 9; i++) {
				
			}
		}
	}
}
