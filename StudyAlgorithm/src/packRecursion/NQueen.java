package packRecursion;

/*
 * https://www.inflearn.com/course/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EA%B0%95%EC%A2%8C/lecture/4077?tab=curriculum
 * '������ ���α׷����� ���� �˰��� ����' ���� ����2 6. Recursion�� ����: n queens problem
 */

/*
 * n queens problem
 * 	- N*N ũ���� ü����
 * 	- N �� N�� ü���� ���� �� N���� ���� ������ �� ���� ���� ����
 * 	- ���� ������ �� �� �ڽ��� �������� ��������(���� �� ����)�� �밢�� ���⿡�� �ƹ��͵� ���������� �� ��
 * 
 * Backtracking(������ ���)
 *  - �ֱٿ� ������ ������ �ǵ��ư��� �����Ͽ� ������ �ذ��ϴ� ���
 *  - ���°��� Ʈ���� ���� �켱 ������� Ž���Ͽ� �ظ� ã�� �˰���
 * 	- ���°���Ʈ��: 
 * 			ã�� �ظ� �����ϴ� Ʈ��. 
 * 			�ذ� �����Ѵٸ� �װ��� �ݵ�� �� Ʈ���� � �� ��忡 �ش���. 
 * 			���� �� Ʈ���� ü�������� Ž���ϸ� �ظ� ���� �� ����. 
 * 			(Ʈ���� ����� ���� �ƴ϶� ������ ������ Ȱ���Ͽ� ������ �ذ��ϴ� �����.)
 * 			Ž�� �Ұ��� Ʈ���� Infeasible �Ǵ� non-promising ���¿� �����ִٰ� ��.
 * 
 * �Է�: N�� �־�����. (1 �� N < 15)
 * ���: �� N���� ���� ������ �� ���� ���� ����� ��
 */
public class NQueen {
	private int[] cols;
	
	public NQueen(int N) {
		cols = new int[N+1];
	}

	public boolean queens(int level) {
		if(level < 0 || level >= cols.length) 
			return false;
		else if(level == cols.length)
			return true;
		else if(!promising(level))
			return false;
		else {
			for(int i = 1; i <= cols.length; i++) {
				cols[level+1] = i;
				if(queens(level+1))
					return true;
			}
			return false;
		}
	}
	
	private boolean promising(int level) {
		return true;
	}
}