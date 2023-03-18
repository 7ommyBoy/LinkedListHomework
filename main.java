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

//        // #1
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
//        }

        //#2
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(3);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(5);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(7);
//        head = deleteDuplicates(head);
//        while (head != null) {
//            System.out.print(head.val + " ");
//            head = head.next;
//        }



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


        //#4

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//
//        head = swapElements(head, 2, 4);
//        while(head != null) {
//            System.out.print(head.val + " ");
//            head = head.next;
//        }





        //#5
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
//
//
//        head = reverseList(head);
//
//        while (head != null) {
//            System.out.print(head.val + " ");
//            head = head.next;
//        }

        //#6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

            ListNode middleNode = middleNode(head);
            System.out.println(middleNode.val);


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
        // create a dummy node to hold the merged list. Kinda like a placeholder
        ListNode dummyNode = new ListNode(0);
        // tail is to keep track of the last node added to the merged list.
        ListNode tail = dummyNode;

        // merge the two lists
        while (head1 != null && head2 != null) {
            // Check if head1 value is less than head2 value's
            if (head1.val < head2.val) {
                tail.next = head1;
                head1 = head1.next;
            } else {
            // If false then we add head2
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // This is appending any remaining nodes from either list
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        // return the head of the merged list. Excluding the dummy node
        return dummyNode.next;
    }
        // This was research to get the code running.
        // This is creating the nodes for the list starting from the head and future nodes
    static class ListNode {
        // The value is stored in the node.
        int val;
        // Next represents the next future node.
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
        // Creating two new variables. prev and current.
        ListNode prev = null;
        ListNode current = head;
        // While current is not null. The loop will iterate through each node in the linked list.
        while (current != null) {
            // If prev does not equal to null and prev value is equal to the current val
            // If both conditions are true then that means it's a Duplicates
            if (prev != null && prev.val == current.val) {
                // We remove the duplicate and then move on to the next
                prev.next = current.next;
            } else {
                // If its false then we do not have any Duplicates.
                prev = current;
            }
            // we move onto the next node
            current = current.next;

        }

        return head;
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
        // we have not reached to the end of the linkedlist and to safely ensure the safety of the next node.
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

    /**
     * #4
     * Given the head of a zero-indexed linked list and two indices i and j, swaps
     the elements at these indices.
     *
     * Returns the head of the resulting list.
     */
    public static ListNode swapElements(ListNode head, int i, int j) {
        // Edge Cases. If head does not equal to null and if i is equal j. We return head if not we continue.
        if (head == null || i == j) {
            return head;
        }
        //The idea we had was to find the positions at i and j by using prev1, and current1 for i and
        // prev2, and current2 for j.
        // Then somehow use next after. But got confused trying to find(connect) the positions.
        // After we would create something to swap the nodes and then return the head.
        ListNode prev1 = null;
        ListNode current1= head;
        ListNode prev2 = null;
        ListNode current2= head;

        return head;
    }




    /**
     * #5
     * Given the head of a singly linked list, reverse the list, and return the
     reversed list.
     */
    public static ListNode reverseList(ListNode head) {
        // Created two ListNode variables prev, and curr. prev will soon point to the reversed list.
        // Current will traverse in the original list
        ListNode prev = null;
        ListNode current = head;
        // While current doesn't not equal to null
        while (current != null) {
            // Create another ListNode called next, which will be current's next
            ListNode next = current.next;
            // This will update next pointer for current to point to the prev node.
            // It reverses the direction of next pointer for current and inserts it at the beginning of the reversed list
            current.next = prev;
            // This will update the nodes for prev to be current and current to be next in the reversed list.
            prev = current;
            current = next;
        }
        // This will return prev since it will be the new head
        return prev;
    }

    /**
     * #6
     * Given the head of a singly linked list, returns the middle node of the
     linked list.
     *
     * If there are an even number of elements -- and thus two middle nodes --
     returns the second middle node.
     */
    public static ListNode middleNode(ListNode head) {
        // int will hold the list, as current will traverse the list
        int length = 0;
        ListNode current = head;

        // While current is not equal to null
        while (current != null) {
            // We then increment the length by 1 and move current to the next node of the list
            length++;
            current = current.next;
        }

        // Traverse the list again to find the middle node(s)
        current = head;
        // We then create a for loop and divide by 2. Which will give us the middle node.
        for (int i = 0; i < length / 2; i++) {
            current = current.next;
        }
        // Lastly we return the middle node.
        return current;

    }
}
