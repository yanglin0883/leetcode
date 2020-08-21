class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<List<Integer>> arr = new ArrayList();
        int sum=0;
        for(int i=0;i<nums.size();i++){
            List<Integer> temp = nums.get(i);
            sum+=temp.size();
            for(int j=0;j<temp.size();j++){
                int k = i+j;
                if(k==arr.size()){
                    arr.add(new ArrayList());
                }
                arr.get(k).add(temp.get(j));
            }
        }
        int[] res = new int[sum];
        int index=0;
        for(int i=0;i<arr.size();i++)
            for(int j=arr.get(i).size()-1;j>-1;j--)
                res[index++] = arr.get(i).get(j);
        return res;
    }
}