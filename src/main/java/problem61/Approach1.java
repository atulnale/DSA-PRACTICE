package problem61;

import utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        int count = 1;
        while(curr.next != null){
            curr = curr.next;
            count++;
        }
        k = k % count;
        if(k == 0) return head;
        int t = count - k;
        curr = head;
        for (int i = 1; i < t; i++) {
            curr = curr.next;
        }
        ListNode temp = curr.next;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        temp = curr.next;
        curr.next = null;
        return temp;
    }

}