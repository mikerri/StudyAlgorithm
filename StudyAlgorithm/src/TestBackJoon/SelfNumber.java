package TestBackJoon;

/*
 * ����: 21.03.25.��
 * https://www.acmicpc.net/problem/4344
 * ������: ����� �Ѱ���
 * ��������: 
 		���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
 * �Է�: 
 		ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
		��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
 * ���: �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
 */

//import java.io.BufferedWriter;
//import java.io.OutputStreamWriter;
//import java.io.IOException;
public class SelfNumber {
	public void solution() // throws IOException 
	{
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = 10001;
		boolean[] numbers = new boolean[N];
		for(int i = 1; i < N; i++) {
			int num = d(i);
			if(num < N)
				numbers[num] = true;
		}
		
		for(int i = 1; i < N; i++) {
			if(!numbers[i])
				//bw.write(i + "\n");
				sb.append(i).append('\n');
		}
		System.out.print(sb);
		//bw.flush();
	}
	
	private int d(int num) {
		int sum = num;
		
		// ���� ���
		while (num != 0) {
			sum += (num % 10);
			num = num / 10;
		}
		
		// ���ڿ��� ���
//		String strNum = Integer.toString(num);
//		for(int i = 0; i < strNum.length(); i++) {
//			sum += Integer.parseInt(strNum.substring(i, i+1));
//		}
		return sum;
	}
}
