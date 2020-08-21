/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=1, right=n, mid=0;
        while(left<=right){
            mid= left+(right-left>>1);
            if(isBadVersion(mid)){
                if(mid==1 || !isBadVersion(mid-1)) return mid;
                else right = mid-1;
            }else left = mid+1;
        }
        return -1;
    }
}