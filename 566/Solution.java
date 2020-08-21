class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c != nums.length * nums[0].length) return nums;
        int[][] res = new int[r][c];
        pointer p = new pointer(nums.length,nums[0].length);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                res[i][j] = nums[p.i][p.j];
                // System.out.println(p.i+"  "+p.j);
                p.next();
            }
        }
        return res;
    }
    class pointer{
        int r, c;
        int i, j;
        pointer(int a, int b){
            this.r =a;
            this.c =b;
            i= 0;
            j=0;
        }
        void next(){
            j++;
            if(j>=c){
                j=0;
                i++;
            }
        }
    }
}