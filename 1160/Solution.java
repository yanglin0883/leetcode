class Solution {
    public int countCharacters(String[] words, String chars) {
        if(chars==null||chars.length()==0||words==null||words.length==0) return 0;
        HashMap<Character, Integer> hm = toHM(chars);
        
        int res=0;
        T1:for(int i=0;i<words.length;i++){
            HashMap<Character,Integer> temp = toHM(words[i]);
            if(temp==null)continue;
            //boolean flag=true;
            for(Character j: temp.keySet()){
                if(!hm.containsKey(j) || temp.get(j)>hm.get(j)){
                    continue T1;
                }                
            }
            res+=words[i].length();
        }
        return res;
    }
    private HashMap<Character, Integer> toHM(String chars){
        if(chars==null||chars.length()==0) return null;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i=0;i<chars.length();++i){
            char temp = chars.charAt(i);
            if(hm.containsKey(temp))
                hm.put(temp, hm.get(temp)+1);
            else
                hm.put(temp, 1);
        }
        return hm;
    }
}