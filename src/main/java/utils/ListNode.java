package utils;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public static ListNode createList(List<Integer> list){
        ListNode head = new ListNode();
        ListNode curr = head;
        for (Integer i : list) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return head.next;
    }

    public static void printList(ListNode head){
        ListNode curr = head;
        while(curr != null) {
            System.out.printf(curr.val + "\t");
            curr = curr.next;
        }
    }

}
