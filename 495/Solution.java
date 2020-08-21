class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        //Arrays.sort(timeSeries);
        int total = timeSeries.length * duration;
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i-1] + duration > timeSeries[i])
                total -= timeSeries[i-1] + duration - timeSeries[i];
        }
        return total;
    }
}