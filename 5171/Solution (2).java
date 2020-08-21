class Solution {
    public int[] closestDivisors(int num) {
        int end = (int)Math.sqrt(num+2);
        int[] res = {1, num+1};
        for(int i=2;i<=end;i++){
            if((num+1)%i==0){
                res[0] = i;
                res[1] = (num+1)/i;
            }
            else if((num+2)%i==0){
                res[0] = i;
                res[1] = (num+2)/i;
            }
        }
        return res;
    }
}