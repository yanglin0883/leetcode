/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        //ListNode res = new ListNode(0);
        if(head == null ||head.next == null) return head;
        ListNode pivot = head;
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode pl = left, pr = right;
        for(ListNode i = head.next;i!=null;i = i.next){
            if(i.val<=pivot.val){
                pl.next = i;
                pl = pl.next;
            }
            else {
                pr.next = i;
                pr = pr.next;
            }
        }
        pl.next = null; pr.next = null;
        // for(pl = left;pl!=null;pl = pl.next)
        //     System.out.print(pl.val+"->");
        // System.out.println();
        // for(pl = right;pl!=null;pl = pl.next)
        //     System.out.print(pl.val+"->");
        // System.out.println();
        left.next = sortList(left.next);
        right.next = sortList(right.next);
        // if(left.next==null) return right.next;
        // else if(right.next == null) return left.next;
        pl = left;
        while(pl.next!=null) pl = pl.next;
        // for(pr = left;pr!=null;pr = pr.next)
        //     System.out.print(pr.val+"->");
        // System.out.println();
        pl.next = pivot;
        pivot.next = right.next;
        // System.out.println(pl.val+"  "+pivot.val+"  "+right.next);
        return left.next;
    }
}