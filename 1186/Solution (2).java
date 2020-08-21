class Solution {
    public int maximumSum(int[] arr) {
        int N = arr.length;
        int left[] = new int[N];
        int right[] = new int[N];
        left[0] = arr[0];
        right[N-1] = arr[N-1];
        int max = arr[0];
        for(int i=1;i<N;i++){
            left[i] = left[i-1]>0?left[i-1]+arr[i]:arr[i];
            max = Math.max(max, left[i]);//without deletation
        }
        for(int i=N-2;i>-1;i--)
            right[i] = right[i+1]>0?right[i+1]+arr[i]:arr[i];
        // print(left);
        // print(right);
        for(int i=1;i<N-1;i++){
            max = Math.max(max, left[i-1]+right[i+1]);
        }
        return max;
    }
    // void print(int[]a){
    //     for(int i=0;i<a.length;i++)
    //         System.out.print(a[i]+"    ");
    //     System.out.println();
    // }
}