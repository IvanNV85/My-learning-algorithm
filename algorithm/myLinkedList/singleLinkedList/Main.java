package algorithm.myLinkedList.singleLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

        //before removes
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
//        myLinkedList.prepend(3);
//        myLinkedList.removeFirst();
//        myLinkedList.set(3, 55);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
        System.out.print("List: ");
        myLinkedList.printList();
//
//        myLinkedList.remove(2);
//        System.out.print("\n"+ "List after remove: ");
//        myLinkedList.printList();

//        System.out.print("\n"+ "List after reverse: ");
//        myLinkedList.reverse();
//        myLinkedList.printList();
//
//        System.out.println("\n The number you find is: " + myLinkedList.get(1).value);

//        System.out.print("\n" + "The number in the middle is: " + myLinkedList.findMiddleNode().value);

//        System.out.print("\n" + "Has loop?: " + myLinkedList.hasLoop());
//        myLinkedList.removeDuplicateWithHashSet();
//        System.out.print("\n" + "List after remove duplicate: ");
//        myLinkedList.printList();


//        myLinkedList.createCycle(2);
        System.out.print("\n" + "Binary to Decimal: " + myLinkedList.binaryToDecimal());

        myLinkedList.partitionList(3);
        System.out.print("\nPartition list: ");
        myLinkedList.printList();

//        myLinkedList.reverseBetween(1, 3);
//        System.out.print("\nReverse between list: ");
//        myLinkedList.printList();

        myLinkedList.swapPairs();
        System.out.print("\nList after swap pairs: ");
        myLinkedList.printList();



    }
}
