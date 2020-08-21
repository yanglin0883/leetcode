class Solution {
    public boolean judgeSquareSum(int c) {
        int left=0, right = (int)Math.sqrt(c);
        while(left<=right){
            int sum = left*left+right*right;
            if(sum==c) return true;
            else if(sum<c) left++;
            else right--;
        }
        return false;
    }
}