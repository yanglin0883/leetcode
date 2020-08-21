class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList();
        for(int i=left;i<=right;i++){
            if(isSDN(i)) res.add(i);
        }
        return res;
    }
    private boolean isSDN(int i){
        int temp = i;
        int t=i;
        while(temp>0){
            t = temp%10;
            if(t==0||(t!=1&&(i % t != 0))) return false;
            temp /= 10;
        }
        return true;
    }
}