class Solution {
    public int[] replaceElements(int[] arr) {
        int res[] = new int[arr.length];
        int cur = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>cur) cur = arr[i];
            res[i-1] = cur;
        }
        res[arr.length-1] = -1;
        return res;
    }
}