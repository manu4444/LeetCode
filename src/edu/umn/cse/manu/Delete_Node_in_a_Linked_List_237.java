package edu.umn.cse.manu;

/**
 * Created by maste on 12/28/2016.
 */
public class Delete_Node_in_a_Linked_List_237 {


    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void deleteNode(ListNode node) {

        if (node != null) {
            ListNode start = node;
            ListNode second = start.next;
            while (second != null) {
                start.val = second.val;
                second = second.next;
                if (second == null) {
                    start.next = null;
                    break;
                }
                start = start.next;
            }
        }

    }

    public static void main(String[] args) {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);

        deleteNode(input.next.next.next);

        while (input != null) {
            System.out.println(input.val);
            input = input.next;

        }
    }
}
