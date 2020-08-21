class Solution {
    public int numSpecialEquivGroups(String[] A) {
        HashMap<SpecialString, Integer> hm = new HashMap<>();
        for(String i:A){
            SpecialString temp = new SpecialString(i);
            hm.put(temp, hm.getOrDefault(temp, 0)+1);
        }
        return hm.size();
    }
    class SpecialString{
        SpecialString(String s){
            for(int i=0;i<s.length();i++){
                if(i%2==0) even[s.charAt(i)-'a']++;
                else odd[s.charAt(i)-'a']++;
            }
        }
        int[] odd = new int[26];
        int[] even = new int[26];
        public boolean equals(Object obj){
            if(obj.getClass()!=this.getClass()) return false;
            SpecialString temp = (SpecialString) obj;
            for(int i=0;i<26;i++)
                if(temp.odd[i]!=this.odd[i] || temp.even[i]!=this.even[i]) return false;
            return true;
        }
        public int hashCode(){
            int count=0;
            for(int i=0;i<26;i++)
                if(odd[i]!=0)count++;
            return count;
        }
    }
}