class Solution {
    public int countTriplets(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int k=i+1;k<arr.length;k++){
                int a = getXOR(arr, i, k), b=0;
                for(int j=k;j>i;j--){
                    if(a==b) {
                        count++;
                        // System.out.println(i+"  "+j+"  "+k+"  "+a+"  "+b);
                    }
                    a^=arr[j];
                    b^=arr[j];
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