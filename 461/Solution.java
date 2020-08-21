class Solution {
    public int hammingDistance(int x, int y) {
        int temp = x^y;
        int res=0;
        while(temp!=0){//System.out.println(res+"  "+temp);
            res+= temp & 1;
            temp>>>=1;            
        }
        return res;
    }
}