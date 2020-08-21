class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        if(asteroids.length<2) return asteroids;
        int len = asteroids.length;
        int pre = 0;
        while(pre!=len){
            pre = len;
            for(int i=0;i<len-1;i++){
                if(asteroids[i]>0&&asteroids[i+1]<0){
                    if(asteroids[i]>-asteroids[i+1]){
                        for(int j=i+1;j<len-1;j++)
                            asteroids[j] = asteroids[j+1];
                        len--;
                    }
                    else if(asteroids[i]<-asteroids[i+1]){
                        for(int j=i;j<len-1;j++)
                            asteroids[j] = asteroids[j+1];
                        len--;
                    }
                    else{
                        for(int j=i;j<len-2;j++)
                            asteroids[j] = asteroids[j+2];
                        len-=2;
                    }
                }
            }
        }
        int[] res = new int[len];
        for(int i=0;i<len;i++)
            res[i] = asteroids[i];
        return res;
    }
}