class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows==0) return res;
        int[] level = new int[numRows+2];
        level[1] = 1;
        for(int i=0;i<numRows;i++){
            int[] next = new int[level.length];
            for(int j=0;j<=i;j++){
                next[j+1]=level[j] + level[j+1];
            }
            level = next;
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                temp.add(level[j+1]);
            }
            res.add(temp);
            // for(int j=0;j<level.length;j++)
            //     System.out.print(level[j]);
            // System.out.println();
        }
        return res;
    }
}