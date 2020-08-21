class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int n=0;
        for(int i=0;i<nums.size();i++)
            n+= nums.get(i).size();
        int[] res = new int[n];
        int index=0;
        boolean flag =true;
        for(int i=0;flag;i++){
            flag = false;
            for(int j=i;j>=0;j--){
                int x = j, y=i-j;
                if(x>=nums.size() ||y>=nums.get(x).size())continue;
                // System.out.println(x+"  "+y);
                res[index++] = nums.get(x).get(y);
                flag = true;
            }
        }
        return res;
    }
}