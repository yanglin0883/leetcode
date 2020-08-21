class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList();
        for(String w:words){
            if(match(w, pattern)) res.add(w);
        }
        return res;
    }
    
    boolean match(String a, String b){
        int[] aTb = new int[27];
        int[] bTa = new int[27];
        for(int i=0;i<a.length();i++){
            int tempA = a.charAt(i)-'a'+1;
            int tempB = b.charAt(i)-'a'+1;
            if(aTb[tempA]!=0 && aTb[tempA]!=tempB) return false;
            if(bTa[tempB]!=0 && bTa[tempB]!=tempA) return false;
            aTb[tempA] = tempB;
            bTa[tempB] = tempA;
        }
        return true;
    }
}