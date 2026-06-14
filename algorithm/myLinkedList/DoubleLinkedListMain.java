package algorithm.myLinkedList;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList myDoubleLL = new DoubleLinkedList(7);
        myDoubleLL.removeLast();

//        myDoubleLL.append(8);
        myDoubleLL.prepend(9);
        myDoubleLL.append(7);

        myDoubleLL.getHead();
        myDoubleLL.getTail();
        myDoubleLL.getLength();

        myDoubleLL.printList();
    }
}
