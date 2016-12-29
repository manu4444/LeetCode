package edu.umn.cse.manu;

/**
 * Created by maste on 12/28/2016.
 */
public class Reverse_Linked_List_206 {

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode reverseList(ListNode head) {

        //Only one element
        if (head == null) {
            return head;
        }

        if (head.next == null) {
            return head;
        }


        //More than 2 elements
        ListNode p = null;
        ListNode q = head;
        ListNode r = q.next;

        while (q != null) {
            q.next = p;
            p = q;
            q = r;
            if (r != null)
                r = r.next;
        }

        head = p;
        return head;

    }

    public static void main(String[] args) {

        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);

        ListNode temp = reverseList(input);

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;

        }
    }

}
