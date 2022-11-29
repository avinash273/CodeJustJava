package Leetcode;

public class addTwoNumbersMain {
    /* Definition for singly-linked list.*/
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 == null) ? 0 : l1.val;
            int y = (l2 == null) ? 0 : l2.val;
            int sum = x + y + carry;

            head.next = new ListNode(sum % 10);
            carry = sum / 10;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            head = head.next;
        }
        if (carry != 0)
            head.next = new ListNode(carry);

        return dummy.next;
    }
}

