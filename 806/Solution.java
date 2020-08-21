class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int lines = 1;
        int width=0;
        for(char s: S.toCharArray()){
            int w=widths[s-'a'];
            width+=w;
            if(width>100){
                width=w;
                lines++;
            }
        }
        return new int[]{lines, width};
    }
}