class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;true;i++){
            int t = power(x, i);
            if(t>bound||x==1&&i==1) break;
            for(int j=0;true;j++){
                int temp = t + power(y,j);
                if(temp>bound||y==1&&j==1) break;
                hs.add(temp);
            }
        } 
        return new ArrayList<Integer>(hs);
    }
    private int power(int base, int a){
        int res=1;
        for(int i=0;i<a;i++)
            res *= base;
        return res;
    }
}