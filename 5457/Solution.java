class Solution {
    public int numOfSubarrays(int[] arr) {
        int[] sum = new int[arr.length+1];
        for(int i=0;i<arr.length;i++)
            sum[i+1] = sum[i] + arr[i];
        long odd=0, even=0;
        for(int i: sum){
            if(i%2==1)odd++;
            else even ++;
        }
        // System.out.println(odd+"  "+even+"  "+ odd*even);
        return (int)(odd*even%1000000007);
    }
}