package TestBackJoon;
/*
 * ������: ��ŸƮ�� ��ũ
 * ����: 21.06.18.��
 * https://www.acmicpc.net/problem/14889
 * ��������: ������ ��ŸƮ��ũ�� �ٴϴ� ������� �𿩼� �౸�� �غ����� �Ѵ�. �౸�� ���� ���Ŀ� �ϰ� �ǹ� ������ �ƴϴ�. �౸�� �ϱ� ���� ���� ����� �� N���̰� �ű��ϰԵ� N�� ¦���̴�. ���� N/2������ �̷���� ��ŸƮ ���� ��ũ ������ ������� ������ �Ѵ�.
			BOJ�� ��ϴ� ȸ�� ��� ������� ��ȣ�� 1���� N������ �����߰�, �Ʒ��� ���� �ɷ�ġ�� �����ߴ�. �ɷ�ġ Sij�� i�� ����� j�� ����� ���� ���� ������ ��, ���� �������� �ɷ�ġ�̴�. 
			���� �ɷ�ġ�� ���� ���� ��� ���� �ɷ�ġ Sij�� ���̴�. Sij�� Sji�� �ٸ� ���� ������, i�� ����� j�� ����� ���� ���� ������ ��, ���� �������� �ɷ�ġ�� Sij�� Sji�̴�.
			���� ���, 1, 2���� ��ŸƮ ��, 3, 4���� ��ũ ���� ���� ��쿡 �� ���� �ɷ�ġ�� �Ʒ��� ����.
				��ŸƮ ��: S12 + S21 = 1 + 4 = 5
				��ũ ��: S34 + S43 = 2 + 5 = 7
			1, 3���� ��ŸƮ ��, 2, 4���� ��ũ ���� ���ϸ�, �� ���� �ɷ�ġ�� �Ʒ��� ����.
				��ŸƮ ��: S13 + S31 = 2 + 7 = 9
				��ũ ��: S24 + S42 = 6 + 4 = 10
			�౸�� ����ְ� �ϱ� ���ؼ� ��ŸƮ ���� �ɷ�ġ�� ��ũ ���� �ɷ�ġ�� ���̸� �ּҷ� �Ϸ��� �Ѵ�. ���� ������ ���� ��쿡�� 1, 4���� ��ŸƮ ��, 2, 3�� ���� ��ũ ���� ���ϸ� ��ŸƮ ���� �ɷ�ġ�� 6, ��ũ ���� �ɷ�ġ�� 6�� �Ǿ ���̰� 0�� �ǰ� �� ���� �ּ��̴�.
 * �Է�: ù° �ٿ� N(4 �� N �� 20, N�� ¦��)�� �־�����. ��° �ٺ��� N���� �ٿ� S�� �־�����. �� ���� N���� ���� �̷���� �ְ�, i�� ���� j��° ���� Sij �̴�. Sii�� �׻� 0�̰�, ������ Sij�� 1���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
 * ���: ù° �ٿ� ��ŸƮ ���� ��ũ ���� �ɷ�ġ�� ������ �ּڰ��� ����Ѵ�.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class D210618T14889StartAndLink {
	static int[][] table;
	static int[] startTeam;
	static int[] linkTeam;
	static int N;
	static int diffMin = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		table = new int[N][N];
		startTeam = new int[N/2];
		linkTeam = new int[N/2];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				table[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0, 0, 0);
		
		System.out.println(diffMin);
	}

	static void dfs(int person, int start, int link) {
		if(person == N/2) {
			int sumStart = 0;
			int sumLink = 0;
			for(int i = 0; i < (N/2)-1; i++) {
				sumStart += table[startTeam[0]][startTeam[1]] + table[startTeam[1]][startTeam[0]];
				sumLink += table[linkTeam[0]][linkTeam[1]] + table[linkTeam[1]][linkTeam[0]];
			}
			
			int diff = Math.abs(sumStart-sumLink);
			if(diffMin > diff) {
				diffMin = diff;
			}
		}
		else {
			for(int i = 0; i < N; i++) {
				startTeam[person] = i;
			}
			
			for(int i = 0; i < N; i++) {
				linkTeam[person] = i;
			}
		}
	}
}