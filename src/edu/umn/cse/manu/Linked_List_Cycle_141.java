package edu.umn.cse.manu;

/**
 * Created by maste on 12/24/2016.
 */
public class Linked_List_Cycle_141 {


    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode head1 = head;
        while (head1 != null && head != null) {
            head1 = head1.next;
            if (head1 != null) {
                head1 = head1.next;
            } else {
                return false;
            }
            head = head.next;
            if (head == head1) {
                return true;
            }
        }
        return false;


    }

    public static void main(String[] args) {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = input;

        System.out.println(hasCycle(input));
    }
}
