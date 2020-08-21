class Solution {
    public int[] getStrongest(int[] arr, int k) {
        int[][] a = new int[arr.length][2];
        for(int i=0;i<a.length;i++){
            a[i][0] = arr[i];
            a[i][1] = i;
        }
        int m =getM(arr);
        Arrays.sort(a, (a1,b1)->{
            int t =  Math.abs(a1[0]-m) - Math.abs(b1[0]-m);
            if(t==0) return a1[0]-b1[0];
            return t;
        });
        // System.out.println(m);
        // for(int i=0;i<a.length;i++)System.out.println(Arrays.toString(a[i]));
        
        int[]res = new  int[k];
        for(int i=0;i<k;i++)
            res[i] = a[a.length-1-i][0];
        return res;
    }
    int getM(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length-1 >>1];
    }
}