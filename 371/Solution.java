class Solution {
    public int getSum(int a, int b) {
        int carried = (a&b)<<1;
        int sum = a^b;
        if(carried==0) return sum;
        return getSum(carried, sum);
    }
}