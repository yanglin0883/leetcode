class Solution {
    public int[] closestDivisors(int num) {
        return closest(get(num+1), get(num+2));
    }
    int[] closest(int[]a, int[]b){
        if(Math.abs(a[0]-a[1])> Math.abs(b[0]-b[1])) return b;
        else return a;
    }
    int[] get(int n){
        int temp = (int)Math.sqrt(n);
        if(temp*temp == n) return new int[]{temp, temp};
        int[] res = {1, n};
        for(int i=2;i<=temp;i++){
            if(n%i==0) {
                res[0] = i;
                res[1] = n/i;
            }
        }
        return res;
    }
}