class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] count = new int[12];
        for(int i=0;i<words.length;i++)
            count[f(words[i])]++;
        for(int i=10;i>-1;i--) count[i]+=count[i+1];
        int[] res = new int[queries.length];
        for(int i=0;i<res.length;i++){
            res[i] = count[f(queries[i])+1];
        }
        return res;
    }
    
    private int f(String s){
        int count=0;
        char ch = Character.MAX_VALUE;
        for(char c: s.toCharArray()){
            if(c<ch){
                ch=c;
                count=1;
            }
            else if(c==ch) count++;
        }        
        return count;
    }
}