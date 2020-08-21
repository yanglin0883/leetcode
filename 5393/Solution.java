class Solution {
    public int maxScore(int[] c, int k) {
        int sum = 0;
        for(int i:c) sum+=i;
        if(k==c.length) return sum;
        
        int temp[] = new int[c.length+1];
        for(int i=1;i<temp.length;i++)
            temp[i] = temp[i-1] + c[i-1];
        
        int len = c.length-k;
        int min = Integer.MAX_VALUE;
        for(int i=0;i+len<temp.length;i++){
            min = Math.min(min, temp[i+len]-temp[i]);
        }
        return sum-min;
    }
}