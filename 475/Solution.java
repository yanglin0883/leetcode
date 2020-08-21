class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int max=0;
        for(int i=0;i<houses.length;i++){
            max = Math.max(max, min(houses[i], heaters));
        }
        return max;
    }
    
    private int min(int a, int[] h){
        int min = Math.abs(h[0]-a);
        for(int i=1;i<h.length;i++){
            min = Math.min(min, Math.abs(h[i]-a));
            //System.out.println(a+"  "+min);
        }
        return min;
    }
}