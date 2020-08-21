class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        Queue<Integer> opened = new LinkedList<>();
        Set<Integer> locked = new HashSet<>();
        for(int i=0;i<initialBoxes.length;i++){
            if(status[initialBoxes[i]]==1)opened.offer(initialBoxes[i]);
            else locked.add(initialBoxes[i]);
        }
        int sum=0;
        while(!opened.isEmpty()){
            int  cur = opened.poll();
            for(int i=0;i<keys[cur].length;i++){
                status[keys[cur][i]] = 1;
                if(locked.contains(keys[cur][i])){
                    opened.offer(keys[cur][i]);
                    locked.remove(keys[cur][i]);
                }
            }
            sum+=candies[cur];
            for(int i=0;i<containedBoxes[cur].length;i++){
                if(status[containedBoxes[cur][i]] == 1) opened.offer(containedBoxes[cur][i]);
                else locked.add(containedBoxes[cur][i]);
            }
        }
        return sum;
    }
}