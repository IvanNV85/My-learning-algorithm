package LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        // Tạo linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        // In linked list ban đầu
        System.out.print("Original: ");
        printList(head);
        
        // Đảo ngược linked list
        ListNode reversed = reverseList(head);
        
        // In linked list sau khi đảo ngược
        System.out.print("Reversed: ");
        printList(reversed);
    }
    
    // Helper method để in linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null; //node phia truoc
        ListNode curr = head; //node hien tai

        while (curr != null) {
            //luu node tiep theo 
            ListNode nextTemp = curr.next;

            // tro nguoc lai ve prev
            curr.next = prev;
            //di chuyen prev len 1 buoc
            prev = curr;
            //di chuyen con tro curr len toi node da luu
            curr = nextTemp;
        }

        //end
        //khi ket thuc vong lap, curr = null, prev dung cuoi cung cua danh sach moi(new head)
        return prev;
    }
}
