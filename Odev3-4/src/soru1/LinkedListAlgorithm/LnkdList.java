package soru1.LinkedListAlgorithm;

public class LnkdList<T> {
	private Node<T> head;
	private Node<T> tail;
	
	public void add(T data) {
		if (head == null) {
			head =  new Node<>(data);
			return;
		}
		
		Node<T> current = head;
		
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node<>(data);
	}
}
