class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum =0 ;
        for(int i=0;i<distance.length;i++)
            sum+=distance[i];
        int dis = 0;
        if(start>destination){
            int temp = start;
            start = destination;
            destination = temp;
        }
        for(int i=start;i<destination;i++)
            dis += distance[i];
        return Math.min(sum-dis, dis);
    }
}