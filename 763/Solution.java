class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        if(S==null||S.length()==0) return res;
        char[] s = S.toCharArray();
        int start=0, end=0;
        for(int i=0;i<s.length;i++){
            int j=s.length-1;
            for(;j>-1&&s[j]!=s[i];j--);
            end = Math.max(end, j);
            if(i==end){
                res.add(end-start+1);
                start = end+1;
            }
        }
        return res;
    }
}