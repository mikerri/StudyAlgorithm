package Recursion;

/*
 * https://www.inflearn.com/course/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EA%B0%95%EC%A2%8C/lecture/4073?tab=curriculum
 * '������ ���α׷����� ���� �˰��� ����' ���� ����2 1~3
 */

public class BasicConcept {
	/*
	 * 0! = 1
	 * n! = n*(n-1)!
	 */
	public int factorial(int n) {
		if(n == 0) return 1;
		else {
			return n * factorial(n-1);
		}
	}
	
	/*
	 * x^0 = 1
	 * x^n = x*x^n-1 (if n>0)
	 */
	public double power(double x, int n) {
		if(n < 0) return -1;
		else if (n == 0)
			return 1;
		else 
			return x*power(x, n-1);
	}
	
	/*
	 * f0 = 0
	 * f1 = 1
	 * fn = fn-1 + fn-2 (if n>1)
	 */
	public int fibonacci(int n) {
		if(n < 0) return -1;
		else if(n == 0) return 0;
		else if(n == 1) return 1;
		else {
			return fibonacci(n-1)*fibonacci(n-2);
		}
	}
	
	/*
	 * Euclid Method - �ִ�����
	 * m>=n�� �� ���� ���� m & n�� ���ؼ� 
	 * 	m�� n�� ����̸� gcd(m,n) = n,
	 * 	�׷��� ������ gcd(m,n) = gcd(n, m%n)
	 */
	public int gcd(int m, int n) {
		/*
		 * if(m < n) { int tmp = m; m = n; n = tmp; }
		 */
		if(m >= 0 && n >= 0) {
			if(m % n == 0) return n;
			else {
				return gcd(n, m%n);
			}
		}
		else return -1; 
	}
	
	/*
	 * gcd(m, n) = 
	 * 	m (if n=0)
	 * 	gcd(n, m%n) otherwise
	 */
	public int gcdSimple(int m, int n) {
		if(n == 0) 
			return m;
		else
			return gcd(n, m%n);
	}
	
	/*
	 * �ּҰ����
	 */
	public int lcm(int m, int n) {
		return m*n/gcd(m,n);
	}
	
	/*
	 * ���ڿ� ���� ���
	 */
	public int lengthOfString(String str) {
		if (str.equals(""))
			return 0;
		else
			return 1 + lengthOfString(str.substring(1));
	}
	
	/*
	 * ���ڿ� ���
	 */
	public void printChars(String str) {
		if (str.length()==0)
			return;
		else {
			System.out.print(str.charAt(0));
			printChars(str.substring(1));
		}			
	}
	
	/*
	 * ���ڿ� ������ ���
	 */
	public void printCharsReverse(String str) {
		if (str.length()==0) {
			return;
		}
		else {
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
	
	/*
	 * 2����
	 */
	public String numberInBinary(int n, String nStr) {
		if (n<2) {
			return Integer.toString(n).concat(nStr);
		}
		else {
			return numberInBinary((int)n/2, Integer.toString(n%2).concat(nStr));
		}
	}
	
	/*
	 * �迭�� �� ���ϱ�
	 */
	public int sum(int n, int[] data) {
		if (n<=0)
			return 0;
		else
			return sum(n-1, data) + data[n-1];
	}
	
	/*
	 * ���������Ϸκ��� n���� ���� �о����
	 */
	public int[] readFrom(int n, int[] data, java.util.Scanner in) {
		if (n == 0) 
			return data;
		else {
			data[n-1] = in.nextInt();
			return readFrom(n-1, data, in);
		}
	}
	
	/*
	 * ����Ž��
	 */
	// �Ͻ���(Implicit) �Ű�����
	public int search(int[] data, int n, int target) {
		for (int i = 0; i < n; i++) {
			if (data[i] == target) {
				return i;
			}		
		}
		return -1;
	}
	
	// �����(Explicit) �Ű����� - �˻������� �������� ��������� ����
	public int search(int[] data, int begin, int end, int target) {
		if (begin > end) 
			return -1;
		else if (target == data[begin]) 
			return begin;
		else 
			return search(data, begin+1, end, target);
	}
	// �����(Explicit) �Ű����� - �˻������� �������� ��������� ����
	public int search2(int[] data, int begin, int end, int target) {
		if(begin > end) 
			return -1;
		else if (target == data[begin]) 
			return begin;
		else 
			return search(data, begin, end-1, target);
	}
	
	// �̺� Ž�� Ȱ��
	public int searchByDivide(int[] data, int begin, int end, int target) {
		if (begin > end)
			return -1;
		else {
			int middle = (begin+end)/2;
			if (data[middle] == target) // ��� ã��
				return middle;
			
			int index = searchByDivide(data, begin, middle-1, target);
			if (index != -1) // ��� ã�� 
				return index;
			else {
				return searchByDivide(data, middle+1, end, target);
			}
		}
	}
	
	/*
	 * �ִ밪 ã��
	 * MAX(data[n]) = MAX( data[1], MAX(data[n-1]~data[2]) )
	 */
	// ����� �Ű�����	
	public int findMax(int[] data, int begin, int end) {
		if (begin == end)
			return data[begin];
		else {
			//return Math.max(data[begin], findMax(data, begin+1, end));
			int max = findMax(data, begin+1, end);
			if(data[begin] > max)
				max = data[begin];
			return max;			
		}
	}
	
	// �̺� Ž�� Ȱ��
	public int findMaxByDivde(int[] data, int begin, int end) {
		if(begin == end)
			return data[begin];
		else {
			int middle = (begin+end)/2;
			int max1 = findMaxByDivde(data, begin, middle);
			int max2 = findMaxByDivde(data, middle+1, end);
			return Math.max(max1, max2);
		}
	}
	
	/*
	 * �����˻� - ��, �����Ͱ� �������� ���� �Ǿ� �־�� ��.
	 */
	public int binarySearch(int[] data, int begin, int end, int target) {
		if (begin > end)
			return -1;
		else {
			int middle = (begin+end)/2;
			if(data[middle] == target)
				return middle;
			else if(data[middle] < target)
				return binarySearch(data, begin, middle-1, target);
			else 
				return binarySearch(data, middle+1, end, target);
		}
	}
}
