/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        if(head==null) return new int[0];
        head = reverse(head);
        Deque<Integer> stack = new LinkedList<>();
        int[] res = new int[size];
        for(int i=0;i<size;i++){
            while(!stack.isEmpty()&&stack.peek()<=head.val){
                stack.pop();
            }
            res[size-i-1] = stack.isEmpty()?0:stack.peek();
            stack.push(head.val);
            head = head.next;
        }
        return res;
    }
    int size;
    ListNode reverse(ListNode head){
        ListNode pre = null, cur =head, next = head.next;
        while(cur!=null){
            cur.next = pre;
            pre = cur;
            cur = next;
            next = next==null?null:next.next;
            size++;
        }
        return pre;
    }
}