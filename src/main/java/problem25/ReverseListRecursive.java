package problem25;

import utils.ListNode;

public class ReverseListRecursive {
    ListNode newHead;
    public ListNode reverse(ListNode head){
        reverseHelper(head);
        return newHead;
    }
    public ListNode reverseHelper(ListNode curr){
        if(curr == null || curr.next == null) {
            newHead = curr;
            return curr;
        }
        ListNode temp = reverseHelper(curr.next);
        temp.next = curr;
        curr.next = null;
        return curr;
    }

}


