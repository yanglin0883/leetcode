class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n<1) return 1;
        int res = 9;
        int sum = res;
        for(int i=0;i<n-1;i++){
            res = res*(9-i);
            sum+=res;
        }
        return sum+1;
    }
}