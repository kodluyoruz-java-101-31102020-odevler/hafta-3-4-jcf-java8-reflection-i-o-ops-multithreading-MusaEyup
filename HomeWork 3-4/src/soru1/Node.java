package soru1;

public class Node<T> {

	T data;
    Node<T> next;
    Node<T> previous;


    public Node(T data) {
        this.data = data;
        next = null;
        previous = null;

    }
    public Node(T data, Node<T> previous) {
        this.data = data;
        this.previous = previous;

    }
}
