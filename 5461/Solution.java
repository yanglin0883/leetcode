class Solution {
    public int numSub(String s) {
        Map<Integer, Integer> len = new HashMap();
        int last=-1;
        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i++){
            if(str[i]=='0'){
                if(i>last+1){
                    int t = i-last-1;
                    len.put(t, len.getOrDefault(t, 0)+1);
                }
                last = i;
            }
        }
        if(str[str.length-1]=='1') len.put(str.length-last-1, len.getOrDefault(str.length-last-1, 0)+1);
        factor = new HashMap();
        factor.put(1,1l);
        long res=0, mod = 1000000007;
        for(int i: len.keySet()){
            res += helper(i) * len.get(i)%mod;
        }
        return (int)res;
    }
    Map<Integer, Long> factor;
    long helper(int i){
        if(factor.containsKey(i)) return factor.get(i).longValue();
        long res = helper(i-1)+i;
        factor.put(i, res);
        return res;
    }
}