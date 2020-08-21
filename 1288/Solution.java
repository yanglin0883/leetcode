class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int res = intervals.length;
        Arrays.sort(intervals, (p1,p2)->{
            if(p1[0]==p2[0]) return p2[1]-p1[1];
            return p1[0]-p2[0];
        });
        // for(int[] i:intervals)System.out.println(i[0]+"  "+i[1]);
        int index =0 ;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][1]<=intervals[index][1]){
                // System.out.println(index+"  "+intervals[index][1]+" ; "+intervals[i][1]+"  "+i);
                res--;
            }else{
                index = i;
            }
            //System.out.println(intervals[i][0]+"  "+intervals[i][1]+" ; "+index+"  "+res);
        }
        return res;
    }
}