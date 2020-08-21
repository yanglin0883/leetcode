class Solution {
    public boolean isPowerOfThree(int n) {
        return (n>0) && 1162261467 % n ==0; // largest number 3^19 within INteger.MAXVALUE
    }
}