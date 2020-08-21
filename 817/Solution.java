/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        Map<Integer, ArrayList<Integer>> hm = new HashMap();
        for(int i:G)
            hm.put(i, new ArrayList<Integer>());
        while(head!=null){
            if(head.next!=null){
                if(hm.containsKey(head.val)) hm.get(head.val).add(head.next.val);
                if(hm.containsKey(head.next.val)) hm.get(head.next.val).add(head.val);
            }
            head=head.next;
        }
        Set<Integer> graph = new HashSet<>();
        for(int i:G)
            graph.add(i);
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> dfs = new Stack<>();
        int res=0;
        for(int i=0;i<G.length;i++){
            if(visited.contains(G[i]))continue;
            res++;
            dfs.push(G[i]);
            visited.add(G[i]);
            while(!dfs.empty()){
                Integer node = dfs.pop();
                for(Integer j: hm.get(node)){
                    if(graph.contains(j) && !visited.contains(j)){
                        dfs.push(j);
                        visited.add(j);
                    }
                }
            }
        }
        return res;
    }
}