package edu.umn.cse.manu;

/**
 * Created by maste on 12/24/2016.
 */
public class Remove_Nth_Node_From_End_of_List_19 {

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        int move = 1;
        ListNode start = head;

        // The list is empty
        if (head == null) {
            return head;
        }

        // n too small and no change required in case of zeroth element from the end
        if (n <= 0) {
            return head;
        }

        //Finding the length of the linked list
        while (start != null) {
            length++;
            start = start.next;
        }

        //n too large
        if (n > length) {
            return head;
        }

        //reinitializing the start to the head
        /*start = head;
        if( length == n) { //removing th first element
            head = start.next;
            return head;
        }*/
        ListNode cummy = new ListNode(0);
        cummy.next = head;
        start = cummy;

        while (move <= length - n) {
            move++;
            start = start.next;
        }
        start.next = start.next.next;
        return cummy.next;
    }

    public static void main(String[] args) {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(5);
        int position = 2;

        ListNode output = removeNthFromEnd(input, position);
        while (output != null) {
            System.out.println(output.val);
            output = output.next;
        }
    }
}
