class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        for(int i=grid.length-1;i>-1;i--){
            for(int j=grid[0].length-1;j>-1;j--){
                p.next = new ListNode(grid[i][j]);
                p = p.next;
            }
        }
        p.next = dummy.next;        
        for(int i=0;i<k;i++)p=p.next;
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        for(int i=0;i<grid.length;i++){
            LinkedList<Integer> temp = new LinkedList<Integer>();
            for(int j=0;j<grid[0].length;j++){
                temp.addFirst(p.next.val);
                p = p.next;
            }
            res.addFirst(temp);
        }
        return res;
    }
    class ListNode{
        ListNode next = null;
        int val=0;
        ListNode(int val){
            this.val = val;
        }
    }
}