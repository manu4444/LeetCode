package edu.umn.cse.manu;

/**
 * Created by maste on 12/28/2016.
 */
public class Intersection_of_Two_Linked_Lists_160 {

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lengthA = 0, lengthB = 0;

        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != null) {
            tempA = tempA.next;
            lengthA++;
        }

        while (tempB != null) {
            tempB = tempB.next;
            lengthB++;
        }

        int diff = Math.abs(lengthA - lengthB);
        if (lengthA > lengthB) {
            for (int i = 0; i < diff; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                headB = headB.next;
            }
        }

        while (headA != null && headB != null) {
            if (headA.val == headB.val) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;

    }

    public static void main(String[] args) {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);

        ListNode input1 = new ListNode(1);
        input1.next = input.next.next;

        System.out.println(getIntersectionNode(input, input1));

    }
}
