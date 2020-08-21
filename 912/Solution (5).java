class Solution {
    public int[] sortArray(int[] nums) {
        n = nums;
        sort(0, nums.length-1);
        return n;
    }
    int[]n;
    void sort(int l, int r){
        if(l>=r) return;
        int i=l, j=r, p=n[l+r>>1];
        while(i<=j){
            while(n[i]<p)i++;
            while(n[j]>p)j--;
            if(i<=j){
                int t = n[i];
                n[i++] = n[j];
                n[j--] = t;
            }
        }
        sort(l,j);
        sort(i,r);
    }
}