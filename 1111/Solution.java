class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int cur=0, index=0;
        int[] res = new int[seq.length()];
        for(char c:seq.toCharArray()){
            if(c=='('){
                res[index++] = cur;
                cur ^=1;
            }else {
                cur^=1;
                res[index++] = cur;
            }
        }
        return res;
    }
}