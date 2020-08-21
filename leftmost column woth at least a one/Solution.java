/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    int m,n;
    int min = Integer.MAX_VALUE;
    public int leftMostColumnWithOne(BinaryMatrix b) {
        List<Integer> a = b.dimensions(); 
        n = a.get(0); m=a.get(1);
        for(int i=0;i<n;i++){
            min = Math.min(min, search(b, i));
        }
        return min==Integer.MAX_VALUE? -1 : min;
    }
    
    int search(BinaryMatrix b, int row){
        int left=0, right = m-1,mid=0;
        // int a[] = new int[m];
        Arrays.fill(a, -1);
        while(left<=right){
            if(left>min) return Integer.MAX_VALUE;
            mid = right+left>>1;
            // int t1=-1, t2=-1;
            // if(a[mid]==-1){
            //     a[mid] = b.get(row, mid);
            // }
            // t1 = a[mid];
            
            if(b.get(row, mid) == 0)left = mid+1;
            else {
                // if(mid>0){
                //     if(a[mid-1]==-1){
                //         a[mid-1] = b.get(row, mid-1);
                //     }
                //     t2 = a[mid-1];
                // }
                if(mid==0||b.get(row, mid-1)==0) return mid;
                else right = mid-1;
            }
        }
        return Integer.MAX_VALUE;
    }
}