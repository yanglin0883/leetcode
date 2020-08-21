class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        long left =1 , right = x, mid=1;
        while(left<=right){
            mid = left+(right-left)/2;
            long pro = mid*mid;
            if(pro == x ||(pro<x &&(mid+1)*(mid+1)>x))
                return (int)mid;
            if(pro>x) right = mid-1;
            if(pro<x) left = mid+1;
            //System.out.println(mid);
        }
        return (int)mid;
    }
}