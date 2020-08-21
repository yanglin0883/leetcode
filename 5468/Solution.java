class Solution {
    public int findKthPositive(int[] arr, int k) {
        int index=0;
        for(int i=1;i<2001;i++){
            if(index<arr.length && i==arr[index]){
                index++;
            }else{
                if(--k==0) return i;
            }
        }
        return -1;
    }
}