class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] w = new int[words.length];
        for(int i=0;i<w.length;i++)
            w[i]=f(words[i]);
        int[] res = new int[queries.length];
        for(int i=0;i<res.length;i++){
            int temp = f(queries[i]);
            
            for(int j=0;j<w.length;j++){
                if(temp<w[j]) res[i]++;
            }
        }
        return res;
    }
    
    private int f(String s){
        int[] letter = new int[26];
        for(char c: s.toCharArray()){
            letter[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(letter[i]!=0) return letter[i];
        }
        return letter[25];
    }
}