package problem25;

import utils.ListNode;

public class ReverseListIterative {
    public void reverse(ListNode start, ListNode end){
        if(start == null || start.next == null) {
            return ;
        }
        ListNode l1 = start;
        ListNode l2 = l1.next;
        l1.next = null;
        ListNode l3 = l2.next;
        while(true){
            l2.next = l1;
            l1 = l2;
            l2 = l3;

            if(l3 == end){
                l3.next = l1;
                break;
            } else {
                l3 = l3.next;
            }
        }

    }

}
