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
        System.out.println("Stack: ");
        while (temp != null){
            System.out.println(" " + temp.value);
            temp = temp.next;
        }
    }

    public void push(int value){
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if (height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;
    }
    public String reverseString(String str){
        if (str.isEmpty()) return str;

        // Khởi tạo stack với ký tự đầu tiên
        Stack stack = new Stack((int) str.charAt(0));

        // Push các ký tự còn lại
        for (int i = 1; i < str.length(); i++) {
            stack.push((int) str.charAt(i));
        }

        // Pop lần lượt để lấy chuỗi đảo ngược
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            reversed.append((char) node.value);
        }

        return reversed.toString();

    }

    public boolean isEmpty(){
        return height == 0;
    }

}
