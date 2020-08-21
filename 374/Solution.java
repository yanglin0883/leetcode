/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return helper(1,n);
    }
    private int helper(int left, int right){
        // System.out.println(left+"  "+right);
        if(left==right) return left;
        int mid = left + ((right-left)>>1);
        switch(guess(mid)){
            case -1:
                return helper(left, mid-1);
            case 1:
                return helper(mid+1, right);
            case 0:
                return mid;
        }
        return -1;
    }
}