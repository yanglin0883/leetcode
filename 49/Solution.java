class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashString, List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            HashString hs = new HashString(strs[i]);
            if(hm.containsKey(hs))
                hm.get(hs).add(strs[i]);
            else{
                ArrayList<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                hm.put(hs, temp);
            }
        }
            
        List<List<String>> res = new ArrayList<>();
        for(HashString i : hm.keySet()){
            res.add(hm.get(i));
        }
        return res;
    }
    
    class HashString{
        int letter[] = new int[26];
        HashString(String s){
            for(char c: s.toCharArray()){
                letter[c-'a']++;
            }
        }
        
        @Override
        public int hashCode(){
            int sum =0;
            for(int i=0;i<26;i++)
                sum+= letter[i]*i;
            return sum;
        }
        
        @Override
        public boolean equals(Object o){
            if(o.getClass() != this.getClass()) return false;
            HashString temp = (HashString) o;
            for(int i=0;i<26;i++)
                if(this.letter[i]!=temp.letter[i]) return false;
            return true;
        }
    }
}