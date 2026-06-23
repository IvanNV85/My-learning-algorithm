package algorithm.myLinkedList.doubleLinkedList;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList myDoubleLL = new DoubleLinkedList(7);

        myDoubleLL.append(8);
        myDoubleLL.append(9);

        myDoubleLL.getHead();
        myDoubleLL.getTail();
        myDoubleLL.getLength();

        myDoubleLL.remove(2);
        myDoubleLL.printList();

    }
}
