class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int max=0;
        for(int i=0;i<arr1.length;i++)
            for(int j=0;j<arr1.length;j++)
                max = Math.max(max, calculate(arr1, arr2, i, j));
        return max;
    }
    int calculate(int[]arr1, int[]arr2, int i, int j){
        return Math.abs(arr1[i]-arr1[j])+Math.abs(arr2[i]-arr2[j])+Math.abs(i-j);
    }
}