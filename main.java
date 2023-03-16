// Tommy Works
// Emily Perez

/** #1
 * Given the heads of two sorted linked lists, merges the two lists into a single
 * sorted list. The list is made by splicing together the nodes of the original two
 * lists, without creating any new nodes.
 *
 * Returns the head of the merged linked list.
 */
public class Main {
    public static void main(String[] args) {

        // #1
//        // We created the two sorted linked lists. head1 and head2
//        ListNode head1 = new ListNode(1);
//        head1.next = new ListNode(3);
//        head1.next.next = new ListNode(5);
//        head1.next.next.next = new ListNode(7);
//
//        ListNode head2 = new ListNode(2);
//        head2.next = new ListNode(4);
//        head2.next.next = new ListNode(6);
//        head2.next.next.next = new ListNode(8);
//
//        // This will merge the two lists and print the result
//        ListNode mergedList = mergeLists(head1, head2);
//        // If it doesn't equal to null then the system will print out the mergedList values.
//        while (mergedList != null) {
//            System.out.print(mergedList.val + " ");
//            mergedList = mergedList.next;


        //#3
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(5);
//        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(4);
//        head.next.next.next.next.next = new ListNode(5);
//        //Remove all element of 5 in the ListNode.
//        head = removeElements(head, 5);
//        while (head != null) {
//            // Print out the value
//            System.out.print(head.val + " ");
//            head = head.next;


//    }
}





    /**
     * #1
     * Given the heads of two sorted linked lists, merges the two lists into a single
     * sorted list. The list is made by splicing together the nodes of the original two
     * lists, without creating any new nodes.
     * <p>
     * Returns the head of the merged linked list.
     */
    public static ListNode mergeLists(ListNode head1, ListNode head2) {
        // create a dummy node to hold the merged list
        ListNode dummyNode = new ListNode(0);
        ListNode tail = dummyNode;

        // merge the two lists
        while (head1 != null && head2 != null) {
            // Check if the value is less than
            if (head1.val < head2.val) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // append any remaining nodes from either list
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        // return the head of the merged list (excluding the dummy node)
        return dummyNode.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;

        }
    }


    /**
     * #2
     * Given the head of a sorted linked list, deletes all duplicates such that
     each element appears only once.
     *
     * Returns the head of the resulting linked list, which is still sorted.
     */
    public static ListNode deleteDuplicates(ListNode head) {
        return null;
    }










    /** #3
     * Given the head of a sorted linked list, deletes all duplicates such that
     * each element appears only once.
     * <p>
     * Returns the head of the resulting linked list, which is still sorted.
     */

    public static ListNode removeElements(ListNode head, int val) {
        // If both of these conditions are true then it will update the head's node to the next.
        // If the head does not equal to null and if the heads value is equal to the value. It will update to the next node.
        while (head != null && head.val == val) {
            head = head.next;
        }
        // Create another variable (Reference)
        ListNode current_node = head;
        // This checks if the current_node and current_node.next is not equal to null then we can assure that
        // we have not reached to the end of the linkedlist and to saftely ensure the saftey of the next node.
        while (current_node != null && current_node.next != null) {
            // If the current node next is equal to the value then we move over to the next next node.
            if (current_node.next.val == val) {
                current_node.next = current_node.next.next;
            } else {
                // If it's not equal to the value then we move the next node.
                current_node = current_node.next;
            }
        }
        // We return the head of the linked list, without the deleted value's.
        return head;
    }
}




