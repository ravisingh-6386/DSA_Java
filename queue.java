class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class queue {

    Node head;
    Node tail;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

   
    public int remove() {
        if (head == null) {
            return -1;
        }
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
    Node temp = head;

    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }

    System.out.println();
}
public boolean isFull() {
    return false; 
}
    public static void main(String[] args) {

        queue q = new queue();

        q.insert(1);
        q.insert(2);
        q.insert(3);

        System.out.print("Queue elements: ");
        q.display();

        System.out.println("remove: " + q.remove());
        System.out.println("remove: " + q.remove());
        System.out.println("remove: " + q.remove());
        System.out.println("isEmpty: " + q.isEmpty());
        System.out.println("isFull: " + q.isFull());

    }
}