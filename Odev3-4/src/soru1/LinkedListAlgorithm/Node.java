package soru1.LinkedListAlgorithm;

public class Node<T> {
	
	T data;
	Node<T> next;
	Node<T> previous;
	
	public Node (T data) {
		this.data = data;
		this.previous = null;
		this.next = null;
	}

	
}


