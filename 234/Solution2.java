/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        ListNode fast = head;
        ListNode slow = head;
        ListNode mid=null;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        if(fast==null) mid = slow;
        else mid = slow.next;
        //reverse the second half
        ListNode current=mid;
        ListNode pre = null;
        ListNode next;
        while(current!=null){
            next= current.next;
            current.next=pre;
            pre=current;
            current = next;
        }
        mid = pre;
        //judge
        while(mid!=null){
            if(mid.val!=head.val) return false;
            mid= mid.next;
            head=head.next;
        }
        return true;
    }
}