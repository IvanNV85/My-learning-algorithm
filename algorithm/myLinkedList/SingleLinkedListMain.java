package algorithm.myLinkedList;

public class SingleLinkedListMain {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(11);

        //before removes
        myLinkedList.append(22);
        myLinkedList.append(23);
        myLinkedList.append(55);
//        myLinkedList.prepend(3);
//        myLinkedList.removeFirst();
//        myLinkedList.set(3, 55);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.print("List before remove: ");
        myLinkedList.printList();

        myLinkedList.remove(2);
        System.out.print("\n"+ "List after remove: ");
        myLinkedList.printList();


//        System.out.println("\n The number you find is: " + myLinkedList.get(1).value);

    }
}
