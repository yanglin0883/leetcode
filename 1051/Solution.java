class Solution {
    public int heightChecker(int[] heights) {
        int[] t = Arrays.copyOf(heights, heights.length);
        Arrays.sort(t);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=t[i]) count++;
        }
        return count;
    }
}