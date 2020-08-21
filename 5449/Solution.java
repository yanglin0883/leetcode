class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] q = new int[k];
        for(int i: arr){
            int p = i%k;
            if(p<0)p+=k;
            q[p]++;
        }
        for(int i=1;i<k;i++){
            if(i==k-i){
                if(q[i]%2!=0) return false;
            }
            else if(q[i] !=q[k-i]) return false;
        }
        return true;
    }
}