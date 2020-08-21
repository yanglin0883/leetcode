/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=1, right=n,mid;        
        while(left<right){
            mid = left + ((right-left)>>1);
            //System.out.println(left+"  "+mid+"  "+right);
            if(isBadVersion(mid)){                
                right = mid;
                //System.out.println("right");
            }
            else{
                left = mid+1;
                //System.out.println("left");
            }
        }
        return left;
    }
}