package problem24;

import utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {
    public ListNode swapPairs(ListNode head) {
        if(head == null ) return head;
        ListNode curr = new ListNode(0,head);
        head = curr;
        while(curr.next != null && curr.next.next != null){
            ListNode f1 = curr.next;
            ListNode f2 = curr.next.next;
            curr.next = f2;
            f1.next = f2.next;
            f2.next = f1;
            curr = f1;
        }
        return head.next;
    }
}


