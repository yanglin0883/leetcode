class Solution {
    public int[] sortArray(int[] nums) {
        n = nums;
        t = new int[nums.length];
        sort(0, nums.length);
        return n;
    }
    int[] n;
    int[] t ;
    void sort(int l, int r){
        if(l+1>=r) return;
        int m = l+r>>1;
        sort(l, m);
        sort(m, r);
        int i=l, j=m, index=0;
        while(i<m||j<r){
            if(j==r||(i<m &&n[i]<n[j]))
                t[index++] = n[i++];
            else t[index++] = n[j++];
        }
        for( i=0;i+l<r;i++)
            n[i+l] = t[i];
    }
}