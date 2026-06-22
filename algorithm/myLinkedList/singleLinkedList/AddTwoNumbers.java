package algorithm.myLinkedList.singleLinkedList;

public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public static LinkedList.Node addTwoNumbers(LinkedList.Node l1, LinkedList.Node l2) {
        LinkedList.Node dummy = new LinkedList.Node(0);
        LinkedList.Node current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int value1 = (l1 != null) ? l1.value : 0; //nếu l1 không null thi lay value cua l1 còn không thì value l1 =0
            int value2 = (l2 != null) ? l2.value : 0;

            int sum = value1 + value2 + carry;
            /*
             tách phần số và phần dư để cộng vào so tiếp theo
             VD: sum = 10
                    digit = 0
                    carry = 1
             */
            int digit = sum % 10;
            carry = sum / 10;

            current.next = new LinkedList.Node(digit);
            current = current.next;

            //nếu l1 không bằng null, di chuyển con trỏ l1, nếu không thì = null
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return dummy.next;
    }


}
