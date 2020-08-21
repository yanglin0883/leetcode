class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            if(accessable(flowerbed, i)){
                count++;
                flowerbed[i] = 1;
            }
            if(count>=n) return true;
        }
        return false;
    }
    private boolean accessable(int[] a, int i){
        return a[i]==0 &&(i==0||a[i-1]==0) &&(i==a.length-1 || a[i+1] == 0);
    }
}