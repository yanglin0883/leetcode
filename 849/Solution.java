class Solution {
    public int maxDistToClosest(int[] seats) {
        int max=0, start = -1;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1){
                max = Math.max(max, i-start);
                start = i;
            }
        }
        max /= 2;
        int left =0;
        for(int i=0;i<seats.length;i++)
            if(seats[i]==1){
                left = i;
                break;
            }
        max = Math.max(max, left);
        int right = seats.length-1;
        for(int i=seats.length-1;i>-1;i--){
            if(seats[i]==1){
                right = seats.length -i-1;
                break;
            }
        }
        max = Math.max(max, right);
        return max;
    }
}