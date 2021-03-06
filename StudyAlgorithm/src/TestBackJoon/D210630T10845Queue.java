package TestBackJoon;
/*
 * 문제명: 큐
 * 일자: 21.06.30.수
 * https://www.acmicpc.net/problem/10845
 * 문제내용: 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
		명령은 총 여섯 가지이다.			
		push X: 정수 X를 큐에 넣는 연산이다.
		pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		size: 큐에 들어있는 정수의 개수를 출력한다.
		empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
		front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * 입력: 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 * 출력: 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D210630T10845Queue {
	static final int MAX = 10000;
	static int front = 0, back = 0;
	static int[] queue = new int[MAX];
	
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			String order = br.readLine();
			if(order.equals("pop")) {
				sb.append(pop()).append("\n");
			}
			else if(order.equals("size")) {
				sb.append(size()).append("\n");				
			}
			else if(order.equals("empty")) {
				sb.append(empty()).append("\n");
			}
			else if(order.equals("front")) {
				sb.append(front()).append("\n");
			}
			else if(order.equals("back")) {
				sb.append(back()).append("\n");
			}
			else {
				StringTokenizer st = new StringTokenizer(order);
				st.nextToken();
				int x = Integer.parseInt(st.nextToken());
				push(x);
			}
		}
		System.out.println(sb.toString());
	}
	
	// 정수 X를 큐에 넣는 연산
	static void push(int x) {
		queue[back++] = x;
	}
	
	// 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력
	static int pop() {
		if(size() == 0)
			return -1;
		return queue[front++];
	}
	
	// 큐에 들어있는 정수의 개수를 출력
	static int size() {
		if(front > back)
			return 0;
		return back-front;
	}
	
	// 큐가 비어있으면 1, 아니면 0을 출력
	static int empty() {
		if(size() == 0)
			return 1;
		return 0;
	}
	
	// 큐의 가장 앞에 있는 정수, 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력
	static int front() {
		if(size() == 0)
			return -1;
		return queue[front];
	}
	
	// 큐의 가장 뒤에 있는 정수, 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력
	static int back() {
		if(size() == 0)
			return -1;
		return queue[back-1];
	}
}