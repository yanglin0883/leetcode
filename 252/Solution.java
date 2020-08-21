class Solution{
	public boolean canAttendMeetings(int[][] intervals){
		if(intervals==null||intervals.length==0) return true;
		Arrays.sort(intervals, (p1,p2)->p1[0]-p2[0]);
		int temp = intervals[0][1];
		for(int i=1;i<intervals.length;i++){
			if(intervals[i][0]<temp) return false;
			temp = intervals[i][1];
		}
		return true;
	}
}