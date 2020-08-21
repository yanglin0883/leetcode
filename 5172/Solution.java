class Solution {
    public String largestMultipleOfThree(int[] digits) {
        ArrayList<Integer> re[] = new ArrayList[3];
        for(int i=0;i<3;i++){
            re[i] = new ArrayList();
        }
        int q = 0;
        for(int i : digits){
            q+=i;
            q%=3;
            re[i%3].add(i);
        }
        ArrayList<Integer> res = new ArrayList();
        for(Integer i: re[0]){
            res.add(i);
        }
        Collections.sort(re[1]);
        Collections.sort(re[2]);
        
        if(q==1){
            if(re[1].size()>0) re[1].remove(0);
            else {
                re[2].remove(0);
                re[2].remove(0);
            }
        }
        if(q==2){
            if(re[2].size()>0) re[2].remove(0);
            else {
                re[1].remove(0);
                re[1].remove(0);
            }
        }
            res.addAll(re[1]);
            res.addAll(re[2]);
        
        Collections.sort(res);
        StringBuilder ret = new StringBuilder();
        for(int i=res.size()-1; i>-1;i--){
            ret.append(res.get(i));
        }
        while(ret.length()>1&&ret.charAt(0)=='0')ret.deleteCharAt(0);
        return ret.toString();
    }
}