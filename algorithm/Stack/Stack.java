package algorithm.Stack;

public class Stack {
    private Node top;
    private int height;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void getTop() {
        System.out.println("Top: " + top.value);
    }

    public void getHeight(){
        System.out.println("Height: " + height);
    }

    public void prinStack(){
        Node temp = top;
        while (temp != null){
            System.out.print(" " + temp.value + " ");
            temp = temp.next;
        }
    }

}
