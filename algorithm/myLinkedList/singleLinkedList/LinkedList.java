package algorithm.myLinkedList.singleLinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(" " + temp.value + " ->");
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
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        if (length == 0) {
            tail = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        Node insertNode = new Node(value);
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node temp = get(index - 1);
        insertNode.next = temp.next;
        temp.next = insertNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) removeLast();
        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before; //đổi chiều của mũi tên trở từ node trước
            before = temp;
            temp = after;
        }
    }

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }

    public void createCycle(int index) {
        if (index < 0 || index >= length || head == null) {
            return;
        }
        // Lấy node ở vị trí index
        Node cycleNode = get(index);
        // Nối tail trỏ tới node đó
        tail.next = cycleNode;
        System.out.println("\n" + "✓ Cycle created at index " + index);
    }

    public Node findKFromEnd(int value) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < value; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public void removeDuplicate() {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next;
                    length--;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public void removeDuplicateWithHashSet() {
        Set<Integer> seen = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (seen.contains(current.value)) {
                prev.next = current.next;
                length--;
            } else {
                seen.add(current.value);
                prev = current; //prev trỏ đến node hiện tại
            }
            current = current.next; //và current trỏ đến node tiếp theo
        }
    }

    public int binaryToDecimal() {
        int decimal = 0;
        Node current = head;
        while (current != null) {
            decimal = decimal * 2 + current.value;
            current = current.next;
        }
        return decimal;
    }

    public void partitionList(int x) {
        Node dummyLess = new Node(0);
        Node dummyGreater = new Node(0);
        Node lessThan = dummyLess;
        Node greaterThan = dummyGreater;

        Node current = head;
        while (current != null) {
            if (current.value < x) {
                lessThan.next = current;
                lessThan = current;
            } else {
                greaterThan.next = current;
                greaterThan = current;
            }
            current = current.next;
        }

        lessThan.next = dummyGreater.next;  //nối node cuối của list < x với đầu list > x
        greaterThan.next = null;            //cắt đuôi cua list greater
        head = dummyLess.next;              //cập nhật head là đầu của list < x;

    }

    public void reverseBetween(int m, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        for (int i = 0; i < m; i++) {
            prev = prev.next;
        }
        Node current = prev.next;
        for (int i = 0; i < n - m; i++) {
            Node nextNode = current.next;
            current.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }
        head = dummy.next;
    }

    public void swapPairs() {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = prev.next.next;

            //swap 2 node pairs
            first.next = second.next;
            second.next = prev.next;
            prev.next = second;

            //continue to the next pair
            prev = first;
        }
        head = dummy.next;
    }

    public void selectionSort() {
        if (length < 2) return;
        Node current = head;
        while (current.next != null) {
            Node smallest = current;
            Node innerCurrent = current.next;
            while (innerCurrent != null) {
                if (innerCurrent.value < smallest.value) smallest = innerCurrent;
                innerCurrent = innerCurrent.next;
            }
            if (smallest != current) {
                int temp = current.value;
                current.value = smallest.value;
                smallest.value = temp;
            }
            current = current.next;
        }
    }

}
