class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals==null||intervals.length==0) return new int[0][2];
        Arrays.sort(intervals, (p1, p2)->p1[0]-p2[0]);
        ArrayList<int[]> res = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int max = intervals[i][1];
            int jump=0;
            for(int j=i+1;j<intervals.length;j++){
                if(intervals[j][0]<=max){
                    jump++;
                    max = Math.max(max, intervals[j][1]);
                }
                else break;
            }
            int[] temp = {intervals[i][0], max};
            res.add(temp);
            i+=jump;
        }
        return res.toArray(new int[0][2]);
    }
}