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
        Stack<ListNode> stack = new Stack<ListNode>();
        for(ListNode i = head;i!=null;i=i.next){
            stack.push(i);
        }
        while(head!=null){
            if(head.val!=stack.pop().val) return false;
            head= head.next;
        }
        return true;
    }
}