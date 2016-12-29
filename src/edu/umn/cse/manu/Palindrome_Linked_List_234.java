package edu.umn.cse.manu;

import java.util.Stack;

/**
 * Created by maste on 12/28/2016.
 */
public class Palindrome_Linked_List_234 {

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean isPalindrome(ListNode head) {


        Stack<Integer> st = new Stack<Integer>();
        ListNode tempHead = head;
        while (tempHead != null) {
            st.push(tempHead.val);
            tempHead = tempHead.next;
        }

        while (head != null) {
            if (st.pop() != head.val) {
                return false;
            }
            head = head.next;
        }
        return true;

    }

    public static void main(String[] args) {

        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(2);
        input.next.next.next.next = new ListNode(1);


        System.out.println(isPalindrome(input));

    }
}
