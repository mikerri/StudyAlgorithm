package packDataStructure;

/*
 * �����ڷᱸ��
 * ���� ���� �Ұ���
 * ���Լ���
 */
class LinkedList {
	private int value;
	private LinkedList next;
	public LinkedList(int value, LinkedList next) {
		this.value = value; 
		this.next = next;
	}
	public void setValue(int value) {
		this.value = value;		
	}
	public void setNext(LinkedList next) {
		this.next = next;		
	}
	public int getValue() {
		return this.value;
	}
	public LinkedList getNext() {
		return this.next;
	}
}

public class Queue {
	LinkedList front;
	LinkedList back;
	
	public void enqueue(int n) {
		if(front == null) {
			front = new LinkedList(n, null);
			back = front;
		}
		else {
			back.setNext(new LinkedList(n, null));
			back = back.getNext();
		}
	}
	
	public int dequeue() {
		int val = front.getValue();
		front = front.getNext();
		return val;
	}
	
	public void print() {
		LinkedList pQueue = front;
		while(pQueue != null) {
			System.out.print(pQueue.getValue()+" ");
			pQueue = pQueue.getNext();
		}
		System.out.println();
	}
}