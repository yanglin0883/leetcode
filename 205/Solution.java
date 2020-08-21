class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null||s.length()==0) return true;
        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char t1 = s.charAt(i), t2 = t.charAt(i);
            if(sToT.containsKey(t1)){
                if(sToT.get(t1) != t2) return false;
            }
            else 
                sToT.put(t1, t2);
            if(tToS.containsKey(t2)){
                if(tToS.get(t2) != t1) return false;
            }
            else 
                tToS.put(t2,t1);
        }
        return true;
    }
}