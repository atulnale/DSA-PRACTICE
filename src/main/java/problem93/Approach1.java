package problem93;

import utils.ListNode;

public class Approach1 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode back = list1;
        int i = 0;
        while(i != a-1){
            back = back.next;
            i++;
        }
        int j = i;
        ListNode  front = back;
        while(j != b){
            j++;
            front = front.next;
        }
        ListNode list2Front = list2;
        while(list2Front.next != null){
            list2Front = list2Front.next;
        }
        list2Front.next = front.next;
        front.next = null;
        back.next = list2;
        return list1;
    }
}