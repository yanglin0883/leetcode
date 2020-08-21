class Solution {
    class Node{
        char c;
        int val;
        Node(int v, char l){
            val = v;
            c = l;
        }
        ArrayList<Node> next = new ArrayList();
    }
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        Node[] tree = new Node[n];
        for(int i=0;i<n;i++)
            tree[i] = new Node(i, labels.charAt(i));
        for(int[] i:edges){
            tree[i[0]].next.add(tree[i[1]]);
            tree[i[1]].next.add(tree[i[0]]);
        }
        int[] res = new int[n];
        dfs(res, tree[0], new HashSet<Integer>());
        return res;
    }
    int[] dfs(int[] res, Node root, Set<Integer>visited){
        // System.out.println(root.val+" "+root.next+" "+visited);
        visited.add(root.val);
        
        int[] tr = new int[26];
        for(Node i:root.next){
            if(visited.contains(i.val))continue;
            int[]t = dfs(res, i, visited);
            for(int j=0;j<26;j++)
                tr[j] += t[j];
        }
        tr[root.c-'a']++;
        res[root.val] = tr[root.c-'a'];
        return tr;
    }
}