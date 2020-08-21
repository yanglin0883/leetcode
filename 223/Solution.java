class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        long width = Math.min((long)C,(long)G) - Math.max((long)A,(long)E);
        long length = Math.min((long)D,(long)H) - Math.max((long)B,(long)F);
        long area = (C-A)*(D-B) + (G-E)*(H-F);
        //System.out.println(area+"  "+width+" * "+length);
        if(width<=0 || length<=0) return (int)area;
        else return (int)(area-width * length);
    }
}