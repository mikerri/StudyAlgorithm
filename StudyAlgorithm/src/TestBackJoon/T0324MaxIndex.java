package TestBackJoon;
/*
 * 문제명: 최댓값
 * 일자: 21.03.24.수
 * https://www.acmicpc.net/problem/2562
 * 문제내용: 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성
 * 입력: 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
 * 출력: 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 */

import java.util.Scanner;
public class T0324MaxIndex {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int index = 1;
		int max = sc.nextInt();
		for(int i = 1; i < 9; i++) {
			int num = sc.nextInt();
			if(max < num) {
				max = num;
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
