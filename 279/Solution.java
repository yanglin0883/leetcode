class Solution {
    ArrayList<Integer> square = new ArrayList<Integer>();
    public int numSquares(int n) {
        for(int i=1;i*i<=n;i++){
            square.add(i*i);
        }
        //System.out.println(square);
        return helper(n);
    }
    
    private int helper(int n){
        Queue<Integer> bfs = new LinkedList<>();
        Set<Integer> visited = new HashSet();
        bfs.offer(0);
        visited.add(0);
        int level=0;
        while(!bfs.isEmpty()){
            level++;
            int size = bfs.size();
            for(int i=0;i<size;i++){
                Integer temp = bfs.poll();
                for(Integer nei: square){
                    Integer next = nei + temp;
                    if(visited.contains(next)) continue;
                    if(n==next) return level;
                    if(next<n){
                        bfs.offer(next);
                        visited.add(next);
                    }
                }
            }
        }
        return -1;
    }
}