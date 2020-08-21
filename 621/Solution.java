class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for(char c: tasks) map[c-'A']++;
        PriorityQueue<Integer> queue = new PriorityQueue<>(26, Collections.reverseOrder());
        for(int f:map) if(f>0) queue.add(f);
        int time=0;
        while(!queue.isEmpty()){
            int i=0;
            List<Integer> temp = new ArrayList();
            while(i<=n){//get n of them max to -1
                if(!queue.isEmpty()){
                    if(queue.peek()>1) temp.add(queue.poll()-1);
                    else queue.poll();
                }
                time++;
                if(queue.isEmpty()&&temp.size()==0) break;//last interval
                i++;
            }
            for(int j:temp) queue.add(j);
        }
        return time;
    }
}
}