class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if(rooms==null||rooms.size()<2)return true;
        Queue<Integer> check = new LinkedList();
        boolean[] visited = new boolean[rooms.size()];
        check.offer(0);
        visited[0]=true;
        
        while(!check.isEmpty()){
            int cur = check.poll();
            for(Integer i: rooms.get(cur)){
                if(visited[i]) continue;
                check.offer(i);
                visited[i] = true;
            }
        }
        
        // for(boolean b: visited){
        //     System.out.print(b+"  ");
        // }System.out.println();
        
        for(boolean b: visited)
            if(!b) return false;
        return true;
    }
}