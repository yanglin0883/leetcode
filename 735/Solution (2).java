class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        if(asteroids==null||asteroids.length<2) return asteroids;
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>=0)continue;
            for(int j=i-1;j>-1 && asteroids[j]>=0;j--){
                if(asteroids[j]==0)continue;
                if(-asteroids[i]>asteroids[j]) asteroids[j] =0;
                else if(-asteroids[i]==asteroids[j]){
                    asteroids[i] = asteroids[j] =0;
                    break;
                }
                else {
                    asteroids[i] =0;
                    break;
                }
            }
        }
        int n=0;
        for(int i:asteroids) if(i!=0) n++;
        int[] res = new int[n];
        int j=0;
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]!=0){
                res[j++] = asteroids[i];
            }
        }
        return res;
    }
}