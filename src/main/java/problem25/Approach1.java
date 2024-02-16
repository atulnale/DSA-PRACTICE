package problem25;

import utils.ListNode;

public class Approach1 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;
        int i = 1;
        ListNode tempHead = new ListNode();
        tempHead.next = head;
        ListNode start = tempHead;
        ListNode end = head;
        while(i <= k) {
            if(end == null){
                break;
            }
            if(i == k){
                ListNode tempEnd = end;
                ListNode tempStart = start.next;
                end = end.next;
                reverse(tempStart, tempEnd);
                start.next = tempEnd;
                tempStart.next = end;
                start = tempStart;
                i=1;

            } else {
                end = end.next;
                i++;
            }

        }
        return tempHead.next;

    }
    public void reverse(ListNode start, ListNode end){
        if(start == null || start.next == null) {
            return ;
        }
        ListNode l1 = start;
        ListNode l2 = l1.next;

        l1.next = null;
        if(l2 == end){
            l2.next = l1;
            return;
        }
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
