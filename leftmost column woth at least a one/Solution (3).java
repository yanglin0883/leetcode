/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix b) {
        List<Integer> para = b.dimensions();
        int[] cur = {0, para.get(1)-1};
        int min = para.get(1);
        while(cur[0]<para.get(0) && cur[1]>-1){            
            if(b.get(cur[0], cur[1])==1){
                min = Math.min(min, cur[1]);
                cur[1]--;
                // System.out.println(min+"  "+Arrays.toString(cur));
            }else{
                cur[0]++;
            }
        }
        return min==para.get(1)?-1:min;
    }
}