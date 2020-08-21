class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
        T1:for(int i=0;i<ans.length;i++){
            for(int j=i+1;j<T.length;j++)
                if(T[j]>T[i]){
                    ans[i] = j-i;
                    continue T1;
                }
        }
        return ans;
    }
}