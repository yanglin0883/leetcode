class Solution {
    public int maximumSum(int[] arr) {
        int N = arr.length;
        int left[] = new int[N];
        int right[] = new int[N];
        left[0] = arr[0];
        right[N-1] = arr[N-1];
        for(int i=1;i<N;i++)
            left[i] = Math.max(left[i-1]+arr[i], arr[i]);
        for(int i=N-2;i>-1;i--)
            right[i] = Math.max(arr[i], right[i+1]+arr[i]);
        // print(left);
        // print(right);
        int max = Math.max(left[N-1], right[0]);
        for(int i=1;i<N-1;i++){
            int temp = Math.max(left[i-1]+right[i], left[i-1]-arr[i]+right[i]);
            max = Math.max(max, temp);
        }
        return max;
    }
    // void print(int[]a){
    //     for(int i=0;i<a.length;i++)
    //         System.out.print(a[i]+"    ");
    //     System.out.println();
    // }
}