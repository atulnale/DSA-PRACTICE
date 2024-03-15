package problem2;

import utils.ListNode;

public class Approach1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode();
        ListNode temp = result;
        while(l1 != null || l2 != null) {
            int num1  = 0;
            if(l1 != null) {
                num1 = l1.val;
                l1 = l1.next;
            }
            int num2 = 0;
            if(l2 != null) {
                num2 = l2.val;
                l2 = l2.next;
            }
            int sum = num1 + num2 + carry;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            carry = sum /10;
        }
        if(carry == 1){
            temp.next = new ListNode(1);
        }
        result = result.next;
        return result;
    }
}
