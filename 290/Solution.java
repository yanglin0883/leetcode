class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern==null||pattern.length()==0){
            if(str==null||str.length()==0) return true;
            else return false;
        }
        if(str==null||str.length()==0) return false;
        String[] words=str.split(" "); 
        if(pattern.length()!=words.length) return false;
        HashMap<Character, String> cToS = new HashMap<Character, String>();
        HashMap<String, Character> sToC = new HashMap<String, Character>();
        for(int i=0;i<words.length;i++){
            char temp = pattern.charAt(i);
            if(cToS.containsKey(temp)){
                if(!cToS.get(temp).equals(words[i])) return false;                
            }
            if(sToC.containsKey(words[i])){
                if(temp!= sToC.get(words[i])) return false;
            }
            cToS.put(temp, words[i]);
            sToC.put(words[i], temp);
        }
        return true;
    }
}