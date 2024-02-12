package problem21;

import utils.ListNode;

import java.util.*;

public class Approach1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode curr = result;
        while(list1 != null || list2 != null) {
            int n1 = list1 == null ? Integer.MAX_VALUE : list1.val;
            int n2 = list2 == null ? Integer.MAX_VALUE : list2.val;
            ListNode temp;
            if(n1 < n2) {
                temp = new ListNode(n1);
                list1 = list1.next;
            } else {
                temp = new ListNode(n2);
                list2 = list2.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
        return result.next;
    }
}


