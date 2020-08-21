class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int[] roots = new int[s.length()];
        for(int i=0;i<roots.length;i++) roots[i] = i;
        for(List<Integer>p : pairs){
            int u = find(p.get(0), roots);
            int v = find(p.get(1), roots);
            if(u!=v) roots[u] = v;
        }
        
        for(int i=0;i<roots.length;i++) roots[i] = find(i, roots);
        HashMap<Integer, PriorityQueue<Character>> map = new HashMap();
        for(int i=0;i<roots.length;i++){
            map.putIfAbsent(roots[i], new PriorityQueue());
            map.get(roots[i]).add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<roots.length;i++) sb.append(map.get(roots[i]).poll());
        return sb.toString();
    }
    
    int find(int n, int[]roots){
        while(roots[n]!=n){
            roots[n] = roots[roots[n]];
            n = roots[n];
        }
        return n;
    }
}