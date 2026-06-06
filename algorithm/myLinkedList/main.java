package algorithm.myLinkedList;

public class main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

        //before remove
        myLinkedList.append(11);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();

        //after remove
        System.out.println(myLinkedList.removeLast());
        System.out.println(myLinkedList.removeLast());
        System.out.println(myLinkedList.removeLast());

    }
}
