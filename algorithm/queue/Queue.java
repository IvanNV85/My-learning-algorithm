package algorithm.queue;


public class Queue {
    private Node first;
    private Node last;
    private int length;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void getFirst() {
        System.out.println("First: " + first.value);
    }

    public void getLast() {
        System.out.println("Last: " + last.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void printQueue(){
        Node temp = first;
        System.out.println("Queue: ");
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}
