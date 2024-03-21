package problem95;

import utils.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = first.next;
        ListNode third = first.next;
        first.next = null;
        while(second != null) {
            third = second.next;
            second.next = first;
            first = second;
            second = third;
        }
        return first;
    }
}