package problem19;

import utils.ListNode;

import java.util.*;

public class Approach1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        while(n != 0){
            fast = fast.next;
            n--;
        }
        if(fast == null) return head.next;
        ListNode curr = head;
        while(fast.next != null) {
            fast = fast.next;
            curr = curr.next;
        }
        ListNode temp = curr.next;
        curr.next = curr.next.next;
        temp.next = null;
        return head;
    }
}


