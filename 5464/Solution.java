class Solution {
    public int numWaterBottles(int a, int b) {
        int res=a;
        while(a>=b){
            int t = a/b;
            res += t;
            // System.out.println(res);
            a = t + a%b;
        }
        return res;
    }
}