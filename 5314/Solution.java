class Solution {
    public int minJumps(int[] arr) {
        if(arr==nullarr.length2) return 0;
        MapInteger, ListInteger sameHeight = new HashMap();
        for(int i=0;iarr.length;i++){
            if(sameHeight.containsKey(arr[i])){
                sameHeight.get(arr[i]).add(i);
            }
            else{
                ListInteger temp = new ArrayList();
                temp.add(i);
                sameHeight.put(arr[i], temp);
            }
        }
        QueueInteger bfs = new LinkedList();
        boolean[] visited = new boolean[arr.length];
        bfs.offer(0);
        visited[0] = true;
        SetInteger used = new HashSet();
        int step=0;
        while(!bfs.isEmpty()){
            step++;
            int size = bfs.size();
            for(int i=0;isize;i++){
                int cur = bfs.poll();
                if(cur+1arr.length)
                    if(cur+1==arr.length-1) return step;
                    else if(!used.contains(arr[cur+1])&&!visited[cur+1]){bfs.offer(cur+1);visited[cur+1]=true;}
                if(cur-1=0)if(!used.contains(arr[cur-1])&&!visited[cur-1]){
                    bfs.offer(cur-1);
                    visited[cur-1] = true;
                }
                for(int indexsameHeight.get(arr[cur])){
                    if(index==arr.length-1) return step;
                    if(index==cur  visited[index]) continue;
                    bfs.offer(index);
                    visited[index]=true;
                }
                used.add(arr[cur]);
            }
        }
        return step;
    }
}