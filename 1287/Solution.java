class Solution {
    public int findSpecialInteger(int[] arr) {
        int N = arr.length/4, start=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                if(i-start>N) return arr[start];
                start = i;
            }
        }
        return arr[start];
    }
}