class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[] res = new int[rowIndex+2];
        res[1] = 1;
        for(int i=0;i<rowIndex;i++){
            int[] next = new int[res.length];
            for(int j=1;j<next.length;j++)
                next[j] = res[j]+res[j-1];
            res = next;
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=1;i<res.length;i++)
            ans.add(res[i]);
        return ans;
    }
}