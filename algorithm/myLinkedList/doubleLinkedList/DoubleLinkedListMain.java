package algorithm.myLinkedList.doubleLinkedList;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList myDoubleLL = new DoubleLinkedList(1);

        myDoubleLL.append(2);
        myDoubleLL.append(3);
        myDoubleLL.append(4);
        myDoubleLL.append(5);

        myDoubleLL.getHead();
        myDoubleLL.getTail();
        myDoubleLL.getLength();

        myDoubleLL.printList();
        System.out.println("\n" + "Is palindrome?: " + myDoubleLL.isPalindrome());
        myDoubleLL.reverse();
        System.out.println("List after reverse: ");
        myDoubleLL.printList();
    }
}
