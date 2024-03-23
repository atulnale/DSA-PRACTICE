package problem106;

import utils.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondList = slow.next;
        slow.next = null;
        secondList = reverseList(secondList);
        head = mergeList(head,secondList);
    }

    private ListNode mergeList(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode resultHead = new ListNode();
        ListNode currResult = resultHead;
        boolean isFirst = true;
        while(curr1 != null || curr2 != null) {
            if(isFirst){
                currResult.next = curr1;
                curr1 = curr1.next;
            } else {
                if(curr2 == null) return curr1;
                currResult.next = curr2;
                curr2 = curr2.next;
            }
            currResult = currResult.next;
            isFirst = !isFirst;
        }
        return resultHead.next;
    }

    private ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = first.next;
        ListNode third = second;
        while(second != null){
            third = third.next;
            second.next = first;
            first = second;
            second = third;
        }
        head.next = null;
        return first;
    }
}