package algorithm.myLinkedList.doubleLinkedList;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int length;

    static class Node {
        int value;
        Node prev;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public DoubleLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(" " + temp.value + " <->");
            temp = temp.next;
        }
    }


    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            //length = 4 thì chạy từ 3
            for (int i = length - 1; i > index; i--) { //chạy ngược lại list
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set (int value, int index){
        Node temp = get(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int value, int index){
        Node insertNode = new Node(value);
        if (index < 0 || index > length) return false; //không the insert 1 node vào vị trí lớn hơn length của list
        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        Node before = get(index - 1);
        Node after = before.next;

        insertNode.next = after;
        insertNode.prev = before;
        before.next = insertNode;
        after.prev = insertNode;

        length++;
        return true;
    }

    public Node remove(int index){
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();
        Node temp = get(index);
        Node before = temp.prev;
        Node after = temp.next;
        before.next = temp.next;
        after.prev = temp.prev;
        temp.next = null;
        temp.prev = null;
//        temp.next.prev = temp.prev;
//        temp.prev.next = temp.next;
        length--;
        return temp;
    }

    public boolean isPalindrome() {
        if (length == 0) return false;
        Node forward = head;
        Node backward = tail;
        while (forward.value != backward.value) {
            backward = backward.prev;
            forward = forward.next;
        }
        return true;
    }
}
