class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int d[] = new int[6];
        d[0] = dist(p3,p2);
        d[1] = dist(p1,p2);
        d[2] = dist(p1,p3);
        d[3] = dist(p1,p4);
        d[4] = dist(p4,p2);
        d[5] = dist(p4,p3);
        Arrays.sort(d);
        if(d[0]==0) return false;
        if(d[0]==d[1]&&d[1]==d[2]&&d[2]==d[3]&&d[3]<d[4]&&d[4]==d[5]) return true;
        return false;
    }
    private int dist(int[] p1, int[] p2){
        int a= p1[0]-p2[0];
        int b= p1[1]-p2[1];
        return a*a+b*b;
    }
}