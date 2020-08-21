class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int max1,max2,max3,max4=Integer.MIN_VALUE;
        max1=max2=max3=max4;
        int min1, min2, min3, min4=Integer.MAX_VALUE;
        min1=min2=min3=min4;
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum= arr1[i]+arr2[i]+i;
            max1 = Math.max(sum, max1);
            min1 = Math.min(sum, min1);
            sum= arr1[i]+arr2[i]-i;
            max2 = Math.max(sum, max2);
            min2 = Math.min(sum, min2);
            sum= arr1[i]-arr2[i]+i;
            max3 = Math.max(sum, max3);
            min3 = Math.min(sum, min3);
            sum= arr1[i]-arr2[i]-i;
            max4 = Math.max(sum, max4);
            min4 = Math.min(sum, min4);
        }
        
        return Math.max(Math.max(max1-min1 , max2-min2), Math.max(max3-min3 , max4-min4));
    }
}