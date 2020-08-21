class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> in = new ArrayList();
        // ArrayList<int[]> out= new ArrayList();
        in.add(newInterval);
        for(int[]i:intervals) in.add(i);
        Collections.sort(in, (a,b)->a[0]-b[0]);
        for(int i=0;i<in.size()-1;i++){
            if(in.get(i)[1]>=in.get(i+1)[0]){
                in.get(i)[1] = Math.max(in.get(i)[1], in.get(i+1)[1]);
                in.remove(i+1);
                i--;
            }
        }
        return in.toArray(new int[0][0]);
    }
}