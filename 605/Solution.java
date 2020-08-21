class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            if(accessable(flowerbed, i)){
                count++;
                flowerbed[i] = 1;
            }
        }
        if(count>=n) return true;
        else return false;
    }
    private boolean accessable(int[] a, int i){
        if(a[i] == 1) return false;
        if(a.length==1) return a[i]!=1;
        if(i==0){
            return a[i+1] != 1;
        }
        else if(i==a.length-1){
            return a[i-1] != 1;
        }
        else return a[i-1]!=1&&a[i+1]!=1;
    }
}