class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        if (N>14) N = N%14 + 14;
        else N = N%14;
        for(int i=0;i<N;i++){
            int[] next = new int[cells.length];
            for(int j=1;j<cells.length-1;j++){
                next[j] = cells[j-1] == cells[j+1]?1:0;
            }
            cells =next;
            // System.out.println(Arrays.toString(cells) +"  "+i);
        }
        return cells;
    }
}