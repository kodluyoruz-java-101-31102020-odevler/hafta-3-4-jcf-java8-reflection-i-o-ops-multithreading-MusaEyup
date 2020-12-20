package soru1;

public class LnkdList<T> {

	public Node<T> head;
    public Node<T> tail;
    public int size = 0;

    //add element
    public void push(T data){

        //Add head
        if (head == null){
            head = tail = new Node<T>(data);
            size++;
            return;
        }

        //dont add repeated item
        if (head.data == data) return;

        //add element
        Node<T> temp = head;
        while(temp.next != null)
        {
            //dont add repeated item
            if (temp.data == data)
                return;

            temp = temp.next;
        }
        // (data, previousElement)
        temp.next = new Node<T>(data, temp);

        tail = temp.next;
        size++;
    }

    //remove element
    public void drop(T data) {

        if (head == null) return;

        if (head.data == data){
            head = head.next;
            head.previous = null;
            size--;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null){

            if (temp.next.data == data){

                temp.next = temp.next.next;
                temp.previous = temp.previous.previous;
                size--;
                return;
            }

            temp = temp.next;
        }
    }


    public int size(){
        return this.size;
    }

    public void print(){
        Node<T> current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;

        }
    }

    public void printBackword(){
        Node<T> temp = tail;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.previous;

        }
    }
}
