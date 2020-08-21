class Solution {
    public int countTriplets(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j;k<arr.length;k++){
                    if(getXOR(arr, i, j-1) == getXOR(arr, j, k)) count++;
                }
            }
        }
        return count;
    }
    int getXOR(int[] arr, int i, int j){
        int res=0;
        for(int a=i;a<=j;a++)
            res ^= arr[a];
        return res;
    }
}