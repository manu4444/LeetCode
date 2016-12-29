package edu.umn.cse.manu;

/**
 * Created by maste on 12/28/2016.
 */
public class Remove_Duplicates_from_Sorted_List_83 {

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            ListNode start = temp;

            int tempVal = start.val;

            while (start.val == tempVal) {
                start = start.next;
                if (start == null) {
                    temp.next = null;
                    return head;
                }
            }
            temp.next = start;
            temp = temp.next;
        }
        return head;

    }

    public static void main(String[] args) {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(2);
        input.next.next.next = new ListNode(4);

        deleteDuplicates(input);

        while (input != null) {
            System.out.println(input.val);
            input = input.next;

        }

    }
}
