class Solution {
    public String toGoatLatin(String S) {
        if(S==null||S.length()==0)return S;
        String[] words = S.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=0;i<words.length;i++){
            res.append(deal(words[i],i));
            res.append(' ');
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
    
    private StringBuilder deal(String s, int n){
        StringBuilder res = new StringBuilder();
        res.append(s);        
        if(!isVowel(s.charAt(0))){
            res.deleteCharAt(0);
            res.append(s.charAt(0));
        }
        res.append("maa");
        for(int i=0;i<n;i++){
            res.append('a');
        }
        return res;
    }
    private boolean isVowel(char ch){
        switch(ch){
                case'a':case'e':case'i':case'o':case'u':
                case'A':case'E':case'I':case'O':case'U': return true;
        }
        return false;
    }
}