/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next == null) return head;
        
        this.k = k;
        ListNode ansHead=new ListNode(0);
        ListNode ansCur = ansHead;
        ansCur.next = head;
        while(ansCur!=null){
            ansCur = reverse( ansCur);
        }
        return ansHead.next;
    }
    int k;
    ListNode reverse(ListNode cur){
        ListNode pre = null, post = cur;
        for(int i=0;i<k;i++){
            if(post.next==null) return null;
            post = post.next;
        }
        final ListNode end = post.next;
        ListNode head = cur.next;
        ListNode endNode = cur.next;
        ListNode temp =null; 
        // System.out.println("cur: "+cur.val);
        while(head!=end){
            // System.out.println(head+"  "+end);
            // System.out.println(head.val+"  "+end.val);
            temp = head.next;            
            // System.out.println(head.val+"  "+end.val+"  "+end.next.val);
            head.next = pre;
            // System.out.println(head.val+"  "+end.val+"  "+end.next.val);
            pre = head;
            // System.out.println(head.val+"  "+end.val+"  "+end.next.val);
            head = temp;
            // System.out.println(head.val+"  "+end.val+"  "+end.next.val);
        }
        // System.out.println("finally: "+cur.val+" "+head.val+" "+endNode.val+"  "+temp.val);
        cur.next = post;
        endNode.next = temp;
        return endNode;
    }
    // void sop(ListNode head){
    //     while(head!=null&&head!=head.next){
    //         System.out.print(head.val+"->");
    //     }System.out.println();
    // }
}