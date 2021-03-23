package packRecursion;

/*
 * https://www.inflearn.com/course/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EA%B0%95%EC%A2%8C/lecture/4075?tab=curriculum
 * '������ ���α׷����� ���� �˰����� ����' ���� ����2 4. Recursion�� ���� - �̷�ã�� 1
 */

/*
 * �̷�ã��
 * N X N
 * pathway : ���
 * wall : ���� ��
 */
public class Maze {
	// Decision Problem : ���� Yes �Ǵ� No�� ����
	
	private static final int PATHWAY_COLOR = 0; // white - �̵� ������ ���
	private static final int WALL_COLOR = 1; 	// blue - �̷��� ��
	private static final int BLOCKED_COLOR = 2;	// red - �������� �ȵǴ� ���
	private static final int PATH_COLOR = 3;	// green - �̵� ���
		
	public boolean findPath(int[][] maze, int x, int y) {
		int N = maze.length;
		if(x < 0 || y < 0 || x >= N || y >= N) {
			return false;
		}
		else if(maze[x][y] != PATHWAY_COLOR) {
			//System.out.println("!PATHWAY_COLOR : ("+x+", "+y+")");
			return false;
		}
		else if (x == N-1 && y == N-1) {
			//System.out.println("LAST: ("+x+", "+y+")");
			maze[x][y] = PATH_COLOR;
			return true;
		}
		else {
			//System.out.println("("+x+", "+y+")");
			//print(maze);
			maze[x][y] = PATH_COLOR;
		
//			int[] neigbor = new int[] {-1, 1}; 
//			for(int i = 0; i < neigbor.length;i++) { 
//				if(findPath(maze, x+neigbor[i], y) || findPath(maze, x, y+neigbor[i]))
//					return true; 
//			}			
			if(findPath(maze, x-1, y) || findPath(maze, x, y+1) || findPath(maze, x+1, y) || findPath(maze, x, y)) {
				return true;
			}
			
			maze[x][y] = BLOCKED_COLOR;
			//print(maze);
			return false;
		}
	}
}