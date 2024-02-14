package problem23;

import utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return new ListNode();
        List<ListNode> list = new ArrayList<>();
        for(ListNode listNode: lists){
            list.add(listNode);
        }
        while(list.size() > 1){
            List<ListNode> result = new ArrayList<>();
            for(int i = 0; i< list.size(); i+=2) {
                ListNode list1 = list.get(i);
                ListNode list2;
                if(i+1 >= list.size()){
                    list2 = null;
                } else {
                    list2 = list.get(i + 1);
                }
                ListNode merge = merge(list1, list2);
                result.add(merge);
            }
            list = result;
        }
        if(list.size() == 0) return new ListNode();
        return list.get(0);
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        ListNode result = new ListNode(0);
        ListNode curr = result;
        while(list1 != null || list2 != null){
            int num1 = list1 == null ? Integer.MAX_VALUE:list1.val;
            int num2 = list2 == null ? Integer.MAX_VALUE:list2.val;
            if(num1 < num2) {
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
                curr.next = null;

            } else {
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
                curr.next = null;
            }
        }
        return result.next;
    }


}


