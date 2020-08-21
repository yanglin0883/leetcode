class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        for(int i=1;i<coordinates.length-1;i++){
            if(nonLinear(coordinates[i-1], coordinates[i], coordinates[i+1])) return false;
        }
        return true;
    }
    
    private boolean nonLinear(int[] a, int[] b, int[] c){
        return (a[1] - b[1])*(a[0]-c[0]) != (a[0]-b[0])*(a[1]-c[1]); 
    }
}