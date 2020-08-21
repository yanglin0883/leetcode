class Solution {
    public boolean isPerfectSquare(int num) {
        double s= Math.sqrt(num);
        if((int)s == s) return true;
        else return false;
    }
}