package algorithm.myLinkedList;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList myDoubleLL = new DoubleLinkedList(7);
        myDoubleLL.append(8);
        myDoubleLL.removeLast();

        myDoubleLL.getHead();
        myDoubleLL.getTail();
        myDoubleLL.getLength();

        myDoubleLL.printList();
    }
}
