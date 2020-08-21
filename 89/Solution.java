class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        if(n<0) return res;
        res.add(0);
        for(int j=0;j<n;j++){
            for(int i=res.size()-1;i>-1;i--){
                res.add(res.get(i)+(int)Math.pow(2,j));
            }
        }
        return res;
    }
}