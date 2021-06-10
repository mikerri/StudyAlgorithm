package TestBackJoon;

/*
 * ������: ü���� �ٽ� ĥ�ϱ�
 * ����: 21.06.09.��
 * https://www.acmicpc.net/problem/1018
 * ��������:
 		�����̴� �ڽ��� ���ÿ��� MN���� ���� ���簢������ �������� �ִ� M*N ũ���� ���带 ã�Ҵ�. � ���簢���� ���������� ĥ���� �ְ�, �������� ������� ĥ���� �ִ�. �����̴� �� ���带 �߶� 8*8 ũ���� ü�������� ������� �Ѵ�.
		ü������ �������� ����� �����Ƽ� ĥ���� �־�� �Ѵ�. ��ü������, �� ĭ�� �������� ��� �� �ϳ��� ��ĥ�Ǿ� �ְ�, ���� �����ϴ� �� ���� �簢���� �ٸ� ������ ĥ���� �־�� �Ѵ�. ���� �� ���Ǹ� ������ ü������ ��ĥ�ϴ� ���� �� �������̴�. 
		�ϳ��� �� ���� �� ĭ�� ����� ���, �ϳ��� �������� ����̴�.		
		���尡 ü����ó�� ĥ���� �ִٴ� ������ ���, �����̴� 8*8 ũ���� ü�������� �߶� �Ŀ� �� ���� ���簢���� �ٽ� ĥ�ؾ߰ڴٰ� �����ߴ�. �翬�� 8*8 ũ��� �ƹ������� ��� �ȴ�. �����̰� �ٽ� ĥ�ؾ� �ϴ� ���簢���� �ּ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�: ù° �ٿ� N�� M�� �־�����. N�� M�� 8���� ũ�ų� ����, 50���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ��� ������ �� ���� ���°� �־�����. B�� �������̸�, W�� ����̴�.
 * ���: ù° �ٿ� �����̰� �ٽ� ĥ�ؾ� �ϴ� ���簢�� ������ �ּڰ��� ����Ѵ�.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class T1018PrintChess {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] chess = new char[N][M];
		for(int i = 0; i < N; i++) {
			String str = br.readLine(); 
			for(int j = 0; j < M; j++) {
				chess[i][j] = str.charAt(j);
			}
		}

		int change = 64;
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < M; j++) {
//				if(i + 8 > N || j + 8 > M) {
//					continue;
//				}
//				
//				int nowChange = rePrint(chess, i, j);
//				if(change > nowChange)
//					change = nowChange;
//			}
//		}
		for(int i = 0; i < N; i++) {
			if (!(N - i < 8)) {
				for(int j = 0; j < M; j++) {
					if (!(M - j < 8)) {
						int nowChange = rePrint(chess, i, j);
						if(change > nowChange)
							change = nowChange;					
					}
				}
			}
		}

		System.out.println(change);
	}
	
	public static int rePrint(char[][] chess, int x, int y) {
		int change = 0;
		int n = x+8; // ü���� ���� ������ �� ��
		int m = y+8; // ü���� ���� ������ �� ��
		
		System.out.println(x + "/" + y);
		for(int i = x; i < n; i++) {
			for(int j = y; j < m; j++) {
				System.out.print(chess[i][j]);
			}
			System.out.println();
		}

		char prevColor = chess[x][y];
		for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if((i + j) % 2 == 0) {
                    // ������ ���ƾ� �ϴ� ���
                    if(chess[i + x][j + y] != prevColor) {
                    	change++;
                    }
                } else {
                    // ������ �޶�� �ϴ� ���
                    if(chess[i + x][j + y] == prevColor) {
                    	change++;
                    }
                }
            }
        }
		
		
//		for(int i = x; i < n; i++) {
//			for(int j = y; j < m; j++) {
//				if(i == x && j == y) { // i��, j���� ��� ù��° ��ġ�� ��� �ǳʶ��
//					continue;
//				}
//
//				if(prevColor == chess[i][j]) {
//					change++;
//					//chess[i][j] = (chess[i][j] == 'B' ? 'W' : 'B');
//					prevColor = (chess[i][j] == 'B' ? 'W' : 'B');
//				}
//				else {
//					if(j == m-1) { // i���� �ι�° ������ ��ġ�� �ְ� j���� ù��° ��ġ�� ���
//						// i-1���� �������� ������ ��, �� ������ ������ ��������
//						//prevColor = (chess[i-1][m-1] == 'B' ? 'W' : 'B');
//						prevColor = (chess[i][j] == 'B' ? 'W' : 'B');
//					}
//					else {
//						prevColor = chess[i][j];
//					}
//				}
//			}
//		}

		return change;		
	}
}
