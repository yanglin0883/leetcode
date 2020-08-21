class Solution {
    public int[] constructRectangle(int area) {
        int a= (int)Math.sqrt(area);
        int[] res = new int[2];
        for(int i=a;i>0;i--){
            if(area%i==0){
                res[1] = i;
                res[0] = area/i;
                return res;
            }
        }
        return  res;
    }
}