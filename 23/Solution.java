/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        boolean flag = true;
        while(flag){
            flag = false;
            int min = -1;
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null){
                    flag = true;
                    if(min==-1||lists[min].val>lists[i].val){
                        min = i;
                    }
                }
            }
            if(!flag) break;
            p.next = lists[min];
            p = p.next;
            lists[min] = lists[min].next;
        }
        //p.next = null;
        return dummy.next;
    }
}