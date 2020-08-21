class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0){
            int[][] res = new int[1][2];
            res[0] = newInterval;
            return res;
        }
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        ArrayList<int[]> res = new ArrayList();
        boolean flag=true, visited = false;
        if(newInterval[1]<intervals[0][0]){
            res.add(newInterval);
            visited = true;
        }
        int[] temp={Integer.MAX_VALUE, Integer.MIN_VALUE};
        for(int[] i : intervals){
            if(i[1]<newInterval[0] || i[0]>newInterval[1]){
                if(!flag){
                    flag=true;
                    res.add(temp);
                }
                res.add(i);
            }else{
                    temp[0] = Math.min(temp[0],Math.min(i[0], newInterval[0]));
                temp[1] = Math.max(temp[1], Math.max(i[1], newInterval[1]));
                flag = false;
                visited = true;
            }
        }
        if(!visited)res.add(newInterval);
        if(!flag){
                    flag=true;
                    res.add(temp);
                }
        Collections.sort(res, (a,b)->a[0]-b[0]);
        return res.toArray(new int[0][0]);
    }
}