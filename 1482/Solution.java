class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int left=Integer.MAX_VALUE, right = Integer.MIN_VALUE,  mid=0;
        for(int i: bloomDay){
            left = Math.min(i, left);
            right = Math.max(i, right);
        }
        int max = ++right;
        while(left<right){
            mid = left+(right-left)/2;
            if(check(mid, bloomDay,k)>=m) right = mid;
            else left = mid+1;
        }
        return left>=max ? -1:left;
    }
    
    int check(int D, int[]days, int k){
        int ans=0, cur=0;
        for(int d: days){
            if(d>D){
                cur=0;
            }else if(++cur == k){
                ans++;cur=0;
            }
        }
        return ans;
    }
}