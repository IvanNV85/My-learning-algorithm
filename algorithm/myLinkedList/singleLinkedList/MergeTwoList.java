package algorithm.myLinkedList.singleLinkedList;

public class MergeTwoList {
    public static void main(String[] args) {

    }

    /**
     * Merge 2 linked list đã sắp xếp
     *
     * @param l1 Danh sách 1 (đã sắp xếp)
     * @param l2 Danh sách 2 (đã sắp xếp)
     * @return Danh sách merged (đã sắp xếp)
     */
    public static LinkedList.Node mergeTwoList(LinkedList.Node l1, LinkedList.Node l2) {
        LinkedList.Node dummy = new LinkedList.Node(0);
        LinkedList.Node current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null) {
            current.next = l1;
        } else if (l2 != null) {
            current.next = l2;
        }
        return dummy.next;
    }

}
